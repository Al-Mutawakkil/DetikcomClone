package com.tugas.detikoffline

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.tugas.detikoffline.fragment.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_nav.setOnNavigationItemSelectedListener(onBottomNavListener)

        val frag = supportFragmentManager.beginTransaction()
        frag.add(R.id.container, HomeFragment())
        frag.commit()
    }

    private val onBottomNavListener = BottomNavigationView.OnNavigationItemSelectedListener {i->
        var selectedFragment: Fragment = HomeFragment()

        when(i.itemId) {
            R.id.itemHome -> {
                selectedFragment = HomeFragment()
            }
            R.id.itemExplore -> {
                selectedFragment = ExploreFragment()
            }
            R.id.itemCategory -> {
                selectedFragment = CategoryFragment()
            }
            R.id.itemVideo -> {
                selectedFragment = VideoFragment()
            }
        }
        val frag = supportFragmentManager.beginTransaction()
        frag.replace(R.id.container, selectedFragment)
        frag.commit()

        true
    }

}