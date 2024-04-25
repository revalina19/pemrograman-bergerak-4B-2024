package com.lab.tugas1praktikum

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class tugas_praktikum2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tugas_praktikum2) //untuk menghubungkan dengan
        // file yg sudah dibuat

        val button = findViewById<ImageView>(R.id.imageView) //mencari id imageview yang ada
        button.setOnClickListener {//agar gambar bisa di klik
            val lanjut = Intent(this, tugas_praktikum3::class.java)
            startActivity(lanjut)
        }
    }
}