package com.example.juurisintentschallenge2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    private lateinit var btnContact: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnContact = findViewById(R.id.btnContact)

        btnContact.setOnClickListener {
            val intent = Intent(this, ContactPage::class.java)
            startActivity(intent)
        }


    }
}