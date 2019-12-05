package com.example.course_4

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import java.util.ArrayList

class ColorsActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numbers)
        val words: ArrayList<Word> = ArrayList()
        words.add(Word("Blue", "Azul"))
        words.add(Word("Brown", "Cafe"))
        words.add(Word("Red", "Rojo"))
        words.add(Word("Green", "Verde"))
        words.add(Word("Yellow", "Amarillo"))
        words.add(Word("Purple", "Purpura"))
        words.add(Word("Teal", "Celeste"))
        words.add(Word("White", "Blanco"))
        words.add(Word("Black", "Negro"))
        words.add(Word("Pink", "Rosado"))


        val adapter = WordAdapter(this,android.R.layout.simple_list_item_1, words)
        //val itemsAdapter: ArrayAdapter<Word> = ArrayAdapter<Word>(this, android.R.layout.simple_list_item_1, words)
        val listView = findViewById<ListView>(R.id.list)
        listView.adapter = adapter
    }
}