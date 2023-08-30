package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.firstbutton)
        val textClick = findViewById<TextView>(R.id.text1)
        var timesClicked = 0

        btnClickMe.setOnClickListener {
            timesClicked += 1

            btnClickMe.text = "You clicked me:"
            textClick.text = timesClicked.toString()

            Toast.makeText(this, "Hey, Alina", Toast.LENGTH_LONG).show()
        }
    }
}