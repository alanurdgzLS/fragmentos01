package com.example.practicafragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.mainFragment, MainFragment()).commit()
        findViewById<Button>(R.id.btnFragmentoA).setOnClickListener{}
        findViewById<Button>(R.id.btnFragmentoB).setOnClickListener{}
    }
}