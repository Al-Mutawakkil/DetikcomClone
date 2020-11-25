package com.tugas.detikoffline.model

import com.tugas.detikoffline.R

class TechNews(var title: String, var desc: String, var photo:Int, var detail: String)  {

    object NewsModel {
        val newsList = listOf<TechNews>(
            TechNews("Puluhan Startup Lokal Ikuti Bootcamp di Tangerang",
                "detiktech | 1 Jam yang lalu",
                R.drawable.img_news10,
                "Puluhan tim startup lokal mengikut program pelatihan dan mentoring bertajuk Startup Heroes."),
            TechNews("Punya Lini Produk Baru, Realme Siapkan V5 Bulan Ini",
                "detiktech | 1 Jam yang lalu",
                R.drawable.img_news11,
                "Realme dilaporkan akan segera memiliki lini smartphone baru, yakni V. Model pertama dari lini baru ini pun sudah diungkap oleh perusahaan asal Tiongkok tersebut, yakni Realme V5."),
            TechNews("Android 11 ternyata masih punya nama Dessert, Apa itu?",
                "detiktech | 2 jam yang lalu",
                R.drawable.img_news12,
                "test data"),
            TechNews("Unboxing Samsung Galaxy A01 Core, Smartphone Android Go Rp 1 juta",
                "detiktech | 3 jam yang lalu",
                R.drawable.img_news13,
                "test data"),
            TechNews("Portal Covid19.go.id Tak Dapat Diakses",
                "detiktech | 4 jam yang lalu",
                R.drawable.img_news14,
                "test data"),
            TechNews("Hands-on Samsung Galaxy M11, smartphone dengan layar dan baterai jumbo",
                "detiktech | 5 jam yang lalu",
                R.drawable.img_news15,
                "test data"),
            TechNews("Twitter Pertimbangkan Model Bisnis Berlangganan",
                "detiktech | 6 jam yang lalu",
                R.drawable.img_news16,
                "test data"),
            TechNews("Samsung Resmi ungkap Galaxy Z Flip 5G, Harganya?",
                "detiktech | 8 jam yang lalu",
                R.drawable.img_news17,
                "test data"),
            TechNews("Realme Klaim Kantongi 40 juta Pengguna Smartphone di Dunia",
                "detiktech | 1 menit yang lalu",
                R.drawable.img_news18,
                "test data")

        )
    }
}