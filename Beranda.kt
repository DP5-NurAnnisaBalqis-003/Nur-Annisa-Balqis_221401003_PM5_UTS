package com.example.appkuisbrainboost

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Beranda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_beranda)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val enterButton = findViewById<Button>(R.id.enter_button)

        // Menambahkan listener untuk menangani klik tombol
        enterButton.setOnClickListener {
            // Membuat Intent untuk berpindah dari Beranda ke Soal
            val intent = Intent(this, Soal::class.java)
            startActivity(intent) // Memulai activity Soal
        }
    }
}