package com.lab.tugas1praktikum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.lab.tugas1praktikum.R.id.main

class tugas_praktikum3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tugas_praktikum3)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(main)) { v, insets ->
            //untuk mengatur /menyesuakian margin agar tidak bertumpuk
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            //menapatkan ukuran margin
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets//mengatur jarak atau padding
        }

    }
}