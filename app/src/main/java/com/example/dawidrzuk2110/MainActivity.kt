package com.example.dawidrzuk2110

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etykieta = findViewById<TextView>(R.id.textView)
        val napis = findViewById<EditText>(R.id.editTextTextPersonName)
        val dodaj = findViewById<Button>(R.id.button)
        val przywroc = findViewById<Button>(R.id.button2)

        dodaj.setOnClickListener {
            etykieta.text = etykieta.text.toString() + napis.text.toString()
        }
        przywroc.setOnClickListener {
            etykieta.text = "Dawid Żuk"
        }
    }
}