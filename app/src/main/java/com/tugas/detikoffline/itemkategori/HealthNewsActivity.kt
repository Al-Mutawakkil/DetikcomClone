package com.tugas.detikoffline.itemkategori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.tugas.detikoffline.DetailActivity
import com.tugas.detikoffline.R
import com.tugas.detikoffline.adapter.RvHealthNewsAdapter
import com.tugas.detikoffline.model.HealthNews
import kotlinx.android.synthetic.main.activity_health_news.*

class HealthNewsActivity : AppCompatActivity() {

    private var healthNewsAdapter: RvHealthNewsAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_health_news)

        var headlineNews: HealthNews? = null

        if (HealthNews.NewsModel.newsList.isNotEmpty()) {
            headlineNews = HealthNews.NewsModel.newsList[HealthNews.NewsModel.newsList.size-1]
            tv_newsHeadlines3.text = headlineNews.title
            tv_descHeadlines3.text = headlineNews.desc
            img_newsHeadlines3.setImageResource(headlineNews.photo)
        }

        cdv_newsheadline3.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(DetailActivity.judulDetailBerita, headlineNews?.title)
            intent.putExtra(DetailActivity.contentDetailBerita, headlineNews?.detail)
            intent.putExtra(DetailActivity.photoDetailBerita, headlineNews?.photo.toString())
            startActivity(intent)
        }

        val linearManager = LinearLayoutManager(this)
        linearManager.orientation = LinearLayoutManager.VERTICAL
        rv_daftarBerita3.layoutManager = linearManager

        healthNewsAdapter = RvHealthNewsAdapter(this, HealthNews.NewsModel.newsList)
        rv_daftarBerita3.adapter = healthNewsAdapter

    }
}