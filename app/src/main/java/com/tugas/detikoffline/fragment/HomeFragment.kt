package com.tugas.detikoffline.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.tugas.detikoffline.DetailActivity
import com.tugas.detikoffline.R
import com.tugas.detikoffline.adapter.RvHomeNewsAdapter
import com.tugas.detikoffline.model.NewsHome
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment: Fragment() {

    private lateinit var newsHomeAdapter: RvHomeNewsAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        var headlineNews: NewsHome? = null
        if (NewsHome.NewsModel.newsList.isNotEmpty()){
            headlineNews = NewsHome.NewsModel.newsList[NewsHome.NewsModel.newsList.size-1]
            tv_newsHeadlines.text = headlineNews.title
            tv_descHeadlines.text = headlineNews.desc
            img_newsHeadlines.setImageResource(headlineNews.photo)
        }

        cdv_newsheadline.setOnClickListener {
            val intentDetail = Intent(context, DetailActivity::class.java)
            intentDetail.putExtra(DetailActivity.judulDetailBerita, headlineNews?.title)
            intentDetail.putExtra(DetailActivity.contentDetailBerita, headlineNews?.detail)
            intentDetail.putExtra(DetailActivity.photoDetailBerita, headlineNews?.photo.toString())
            startActivity(intentDetail)
        }

        val linearManager = LinearLayoutManager(context)
        linearManager.orientation = LinearLayoutManager.VERTICAL
        rv_daftarBerita.layoutManager = linearManager

        newsHomeAdapter = RvHomeNewsAdapter(context!!, NewsHome.NewsModel.newsList)
        rv_daftarBerita.adapter = newsHomeAdapter
    }


}