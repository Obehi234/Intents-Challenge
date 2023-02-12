package com.example.juurisintentschallenge2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ContactPage : AppCompatActivity() {
    private  val green = findViewById<ImageView>(R.id.green)
    private val yellow = findViewById<ImageView>(R.id.yellow)
    private val red = findViewById<ImageView>(R.id.red)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_page)

        val intent = Intent(this, ContactDisplay::class.java)

        green.setOnClickListener {
            intent.putExtra("image", R.drawable.green)
            startActivity(intent)
        }

        red.setOnClickListener {
            intent.putExtra("image", R.drawable.red)
            startActivity(intent)
        }

        yellow.setOnClickListener {
            intent.putExtra("image", R.drawable.baseline_insert_emoticon_24)
            startActivity(intent)
        }

    }
}