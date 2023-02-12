package com.example.juurisintentschallenge2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ContactDisplay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_display)

        val imageId = intent.getIntExtra("image", 0)
        val newface = findViewById<ImageView>(R.id.colorImage)
         newface.setImageResource(imageId)


    }
}