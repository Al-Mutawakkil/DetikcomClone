package com.tugas.detikoffline.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tugas.detikoffline.itemkategori.HealthNewsActivity
import com.tugas.detikoffline.R
import com.tugas.detikoffline.itemkategori.TechNewsActivity
import kotlinx.android.synthetic.main.fragment_category.*

class CategoryFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_category, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnItemTech.setOnClickListener {
            val intentTech = Intent(context, TechNewsActivity::class.java)
            startActivity(intentTech)
        }

        btnItemHealth.setOnClickListener {
            val intentHealth = Intent(context, HealthNewsActivity::class.java)
            startActivity(intentHealth)
        }

    }
}