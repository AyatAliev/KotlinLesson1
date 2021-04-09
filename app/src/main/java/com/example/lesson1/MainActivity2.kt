package com.example.lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        clicker.setOnClickListener {
            count.text = String.format("Количество ${++number}")
        }

       MainActivity.showMessage("Ayat",this)

    }
}