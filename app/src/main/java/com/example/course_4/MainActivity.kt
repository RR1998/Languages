package com.example.course_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numbers = findViewById<TextView>(R.id.numbers)
        numbers.setOnClickListener {
            val intent = Intent(this, NumbersActivity::class.java)
            startActivity(intent)
        }
        val colors = findViewById<TextView>(R.id.colors)
        colors.setOnClickListener {
            val intent = Intent(this, ColorsActivity::class.java)
            startActivity(intent)
        }
        val family = findViewById<TextView>(R.id.family)
        family.setOnClickListener {
            val intent = Intent(this, FamilyActivity::class.java)
            startActivity(intent)
        }
        val phrases = findViewById<TextView>(R.id.phrases)
        phrases.setOnClickListener {
            val intent = Intent(this, PhrasesActivity::class.java)
            startActivity(intent)
        }
    }
}
