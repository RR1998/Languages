package com.example.course_4

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class NumbersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numbers)
        val words: ArrayList<Word> = ArrayList()
        words.add(Word("One", "Uno"))
        words.add(Word("Two", "Dos"))
        words.add(Word("Three", "Tres"))
        words.add(Word("Four", "Cuatro"))
        words.add(Word("Five", "Cinco"))
        words.add(Word("Six", "Seis"))
        words.add(Word("Seven", "Siete"))
        words.add(Word("Eight", "Ocho"))
        words.add(Word("Nine", "Nueve"))
        words.add(Word("Ten", "Diez"))


        val adapter = WordAdapter(this,android.R.layout.simple_list_item_1, words)
        //val itemsAdapter: ArrayAdapter<Word> = ArrayAdapter<Word>(this, android.R.layout.simple_list_item_1, words)
        val listView = findViewById<ListView>(R.id.list)
        listView.adapter = adapter
        }
    }