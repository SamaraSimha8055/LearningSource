package com.example.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var skip: TextView
    private lateinit var arrowBack: ImageView
    private lateinit var product: LinearLayout
    private lateinit var campus: LinearLayout
    private lateinit var glam: LinearLayout
    private lateinit var sample: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        skip = findViewById(R.id.skip)
        arrowBack = findViewById(R.id.arrowBack)
        product = findViewById(R.id.product)
        campus = findViewById(R.id.campus)
        glam = findViewById(R.id.glam)
        sample = findViewById(R.id.sample)

        skip.setOnClickListener {
            val intent = Intent(this@MainActivity,Main::class.java)
            startActivity(intent)
        }

        arrowBack.setOnClickListener {
            val intent = Intent(this@MainActivity,Main::class.java)
            startActivity(intent)
        }
    }
}