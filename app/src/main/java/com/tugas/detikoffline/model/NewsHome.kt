package com.tugas.detikoffline.model

import com.tugas.detikoffline.R

class NewsHome(var title: String, var desc: String, var photo:Int, var detail: String) {

    object NewsModel {
        val newsList = listOf<NewsHome>(
            NewsHome("Pasar ramai dikunjungi warga meskipun wabah covid 19 belum dinyatakan usai",
                "detikcom | 1 Jam yang lalu",
                R.drawable.img_news1,
                "Semua pasar ramai sehingga pedangan menjadi rentan terkenea covid 19"),
            NewsHome("Kapal Nelayan menyalurkan bansos masyarakat Sulawesi",
                "detikcom | 1 Jam yang lalu",
                R.drawable.img_news2,
                "Ternyata dibalik berjuangnya mereka dalam mencari rezeki para nelayan dapat membagikan bansos ke masyarakay"),
            NewsHome("Macet mulai terjadi di wilayah jalur pemudik semarang",
                "detikcom | 2 jam yang lalu",
                R.drawable.img_news3,
                "test data"),
            NewsHome("Jelang new normal jakarta macet lagi",
                "detikcom | 3 jam yang lalu",
                R.drawable.img_news4,
                "test data"),
            NewsHome("Dukung indonesia perangi covid-19, sampoerna donasi ventilator dan APD Full Set",
                "detikcom | 4 jam yang lalu",
                R.drawable.img_news5,
                "test data"),
            NewsHome("Saat risma jelaskan soal penanganan corona pada kepala BNpB dan Menkes",
                "detikcom | 5 jam yang lalu",
                R.drawable.img_news6,
                "test data"),
            NewsHome("Banjir keritik ke trump yang kerahkan militer usai demo george floyd",
                "detikcom | 6 jam yang lalu",
                R.drawable.img_news7,
                "test data"),
            NewsHome("Mengapa aksi demo damai kasus george floyd bisa berubah jadi kerusuhan?",
                "detikcom | 8 jam yang lalu",
                R.drawable.img_news8,
                "test data"),
            NewsHome("2 opsi bagi calon jemaah haji yang tidak jadi berangkat tahun ini",
                "detikcom | 1 menit yang lalu",
                R.drawable.img_news9,
                "test data")

        )
    }
}