package com.example.p_kenya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val next = findViewById<Button>(R.id.next)
        next.setOnClickListener {
            val i = Intent(applicationContext, Login::class.java)
            startActivity(i)
        }
    }
}