package com.lab.tugas1praktikum

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lab.tugas1praktikum.R.id.button
import com.google.android.material.button.MaterialButton

class TugasPraktikum : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tugas_praktikum) //untuk mengatur tampilan aplikasi,
        // menggunakan file yg sdh dibuat

        val button = findViewById<MaterialButton>(button) //mencari tombol dgn id button
        button.setOnClickListener {
            val lanjut = Intent(this, tugas_praktikum2::class.java)
            startActivity(lanjut) //memulai aktivitas di file yg dihubungkan
        }
    }
}