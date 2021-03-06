package com.example.googlemapsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgLocation.setOnClickListener {
            val goToMaps = Intent(this, MapsActivity:: class.java)
            startActivity(goToMaps)
        }
        tvWelcome.setOnClickListener {
            startActivity(Intent(this, MapsActivity::class.java))
        }
    }
}
