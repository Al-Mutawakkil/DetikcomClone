package com.tugas.detikoffline.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tugas.detikoffline.DetailActivity
import com.tugas.detikoffline.R
import com.tugas.detikoffline.model.TechNews
import kotlinx.android.synthetic.main.list_berita.view.*

class RvTechNewsAdapter(val context: Context, private val listNews: List<TechNews>) : RecyclerView.Adapter<TechNewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TechNewsViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_berita, parent, false)
        return TechNewsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listNews.size
    }

    override fun onBindViewHolder(holder: TechNewsViewHolder, position: Int) {
        val dataNews = listNews[position]
        holder.setData(dataNews, position)

        holder.itemView.setOnClickListener {
            val intentDetail = Intent(context, DetailActivity::class.java)
            intentDetail.putExtra(DetailActivity.judulDetailBerita, dataNews.title)
            intentDetail.putExtra(DetailActivity.contentDetailBerita, dataNews.detail)
            intentDetail.putExtra(DetailActivity.photoDetailBerita, dataNews.photo.toString())
            context.startActivity(intentDetail)
        }
    }
}

class TechNewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var techNews: TechNews? = null
        var currentPosition: Int = 0

        fun setData(data: TechNews, positieon: Int) {
            itemView.txtTitle.text = data.title
            itemView.txtDesc.text = data.desc
            itemView.imageNews.setImageResource(data.photo)
        }

}
