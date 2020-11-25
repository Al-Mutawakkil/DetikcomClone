package com.tugas.detikoffline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*


class DetailActivity : AppCompatActivity() {

    companion object {
        const val judulDetailBerita = "Judul Berita"
        const val contentDetailBerita = "Content Berita"
        const val photoDetailBerita = "Photo Berita"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        txt_TitleNews.setText(intent.getStringExtra(judulDetailBerita))
        txt_kontenNews.setText(intent.getStringExtra(contentDetailBerita))
        imgDetailNews.setImageResource(intent.getStringExtra(photoDetailBerita).toInt())

    }
}