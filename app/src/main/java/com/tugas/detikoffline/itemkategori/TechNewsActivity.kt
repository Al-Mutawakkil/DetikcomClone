package com.tugas.detikoffline.itemkategori

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.tugas.detikoffline.DetailActivity
import com.tugas.detikoffline.R
import com.tugas.detikoffline.adapter.RvTechNewsAdapter
import com.tugas.detikoffline.model.TechNews
import kotlinx.android.synthetic.main.activity_tech_news.*

class TechNewsActivity : AppCompatActivity() {

   private var techNewsAdapter: RvTechNewsAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tech_news)

        var headlineNews: TechNews? = null

        if (TechNews.NewsModel.newsList.isNotEmpty()) {
            headlineNews = TechNews.NewsModel.newsList[TechNews.NewsModel.newsList.size-1]
            tv_newsHeadlines2.text = headlineNews.title
            tv_descHeadlines2.text = headlineNews.desc
            img_newsHeadlines2.setImageResource(headlineNews.photo)
        }

        cdv_newsheadline2.setOnClickListener {
            val intentDetail = Intent(this, DetailActivity::class.java)
            intentDetail.putExtra(DetailActivity.judulDetailBerita, headlineNews?.title)
            intentDetail.putExtra(DetailActivity.contentDetailBerita, headlineNews?.detail)
            intentDetail.putExtra(DetailActivity.photoDetailBerita, headlineNews?.photo.toString())
            startActivity(intentDetail)

        }

        val linearManager = LinearLayoutManager(this)
        linearManager.orientation = LinearLayoutManager.VERTICAL
        rv_daftarBerita2.layoutManager = linearManager

        techNewsAdapter = RvTechNewsAdapter(this, TechNews.NewsModel.newsList)
        rv_daftarBerita2.adapter = techNewsAdapter

    }
}