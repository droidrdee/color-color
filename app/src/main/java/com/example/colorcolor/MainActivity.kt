package com.example.colorcolor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val page = findViewById<LinearLayout>(R.id.page)
        val white = findViewById<Button>(R.id.white)
        val black = findViewById<Button>(R.id.black)
        val blue = findViewById<Button>(R.id.blue)
        val red = findViewById<Button>(R.id.red)
        val green = findViewById<Button>(R.id.green)
        val purple = findViewById<Button>(R.id.purple)
        val pink = findViewById<Button>(R.id.pink)
        val orange = findViewById<Button>(R.id.orange)
        val yellow = findViewById<Button>(R.id.yellow)



        white.setOnClickListener {
            page.setBackgroundResource(R.color.white)
        }

        black.setOnClickListener {
            page.setBackgroundResource(R.color.black)
        }

        pink.setOnClickListener {
            page.setBackgroundResource(R.color.pink)
        }

        blue.setOnClickListener {
            page.setBackgroundResource(R.color.blue)
        }

        red.setOnClickListener {
            page.setBackgroundResource(R.color.red)
        }

        orange.setOnClickListener {
            page.setBackgroundResource(R.color.orange)
        }

        green.setOnClickListener {
            page.setBackgroundResource(R.color.green)
        }

        purple.setOnClickListener {
            page.setBackgroundResource(R.color.purple)
        }

        yellow.setOnClickListener {
            page.setBackgroundResource(R.color.yellow)
        }
    }
}