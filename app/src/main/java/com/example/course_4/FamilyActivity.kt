package com.example.course_4

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import java.util.ArrayList

class FamilyActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numbers)
        val words: ArrayList<Word> = ArrayList()
        words.add(Word("Dad", "Papá"))
        words.add(Word("Mom", "Mamá"))
        words.add(Word("Grandmother", "Abuela"))
        words.add(Word("Grandfather", "Abuelo"))
        words.add(Word("Brother", "Hermano"))
        words.add(Word("Sister", "Hermana"))
        words.add(Word("Uncle", "Tío"))
        words.add(Word("Aunt", "Tía"))
        words.add(Word("Cousin", "Primo"))
        words.add(Word("Son", "Hijo"))


        val adapter = WordAdapter(this,android.R.layout.simple_list_item_1, words)
        //val itemsAdapter: ArrayAdapter<Word> = ArrayAdapter<Word>(this, android.R.layout.simple_list_item_1, words)
        val listView = findViewById<ListView>(R.id.list)
        listView.adapter = adapter
    }
}