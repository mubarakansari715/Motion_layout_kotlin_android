package com.example.motion_layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun funNext(view: android.view.View) {
        startActivity(Intent(this,Youtube_motion::class.java))
    }
}