package com.tugas.detikoffline.model

import com.tugas.detikoffline.R

class HealthNews(var title: String, var desc: String, var photo:Int, var detail: String) {

    object NewsModel {
        val newsList = listOf<HealthNews>(
            HealthNews("Perdokhi: Pemberangkatan Jemaah Haji via laut di Masa COVID-19 Perlu",
                "detikcom | 1 Jam yang lalu",
                R.drawable.img_news19,
                "Pandemi COVID-19 membuat Perhimpunan Kedokteran Haji Indonesia(PP Perdokhi) membahas kemungkinan perjalanan haji ke Arab Saudi via transportasi laut"),
            HealthNews("SUlit Dideteksi, Ortu Harus Lebih Peka terhadap Masalah kesehatan mental anak",
                "detikcom | 1 Jam yang lalu",
                R.drawable.img_news20,
                "Gangguan Pada kesehatan mental di usia anak dan remaja dapat mempengaruhi aspek kehidupan mereka bahkan hingga di masa dewasa"),
            HealthNews("Jaga Kesehatan mental saat pandemi, Psikolog: Yakinlah Ada Cahaya Di ujung",
                "detikcom | 2 jam yang lalu",
                R.drawable.img_news21,
                "Masalah Kesehatan mental menjadi salah satu yang harus diwaspadai di masa pandemi COVID-19. Semua kalangna bisa mengalaminya baik orang dewasa atau anak-anak"),
            HealthNews("140 Hari Achmad Yurianto Jadi Jubir COVID-19:Rahasia Batik dan Ketenangan di",
                "detikcom | 3 jam yang lalu",
                R.drawable.img_news22,
                "test data"),
            HealthNews("Mengenal Kondidi langka Moebius Syndrome",
                "detikcom | 4 jam yang lalu",
                R.drawable.img_news23,
                "test data"),
            HealthNews("Dokter Reisa: Pastikan anak terlindungi Selama Pandemi COVID-19",
                "detikcom | 5 jam yang lalu",
                R.drawable.img_news24,
                "test data"),
            HealthNews("Jaga Daya tahan Tubuh, Jokowi isi akhir pekan dengan bersepeda",
                "detikcom | 6 jam yang lalu",
                R.drawable.img_news25,
                "test data"),
            HealthNews("Tertinggi Se-indonesia, Jawa Timur catat 1.572 Kasus Meninggal COVID-19.",
                "detikcom | 8 jam yang lalu",
                R.drawable.img_news26,
                "test data"),
            HealthNews("12 Provinsi Laporkan Kasus Sembuh Lebih tinggi dari kasus baru COVid-19 per-25 juli",
                "detikcom | 1 menit yang lalu",
                R.drawable.img_news27,
                "test data")

        )
    }

}