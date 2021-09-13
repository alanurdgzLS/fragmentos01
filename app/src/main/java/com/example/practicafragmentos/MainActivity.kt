package com.example.practicafragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.fragmentContainerView, MainFragment()).commit()
        findViewById<Button>(R.id.btnFragmentoA).setOnClickListener{
            replaceFragment(fragmentA())
        }
        findViewById<Button>(R.id.btnFragmentoB).setOnClickListener{
            replaceFragment(fragmentB())
        }
    }
    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.mainFragment, fragment)
            commit()
        }
    }
}