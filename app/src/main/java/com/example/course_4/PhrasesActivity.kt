package com.example.course_4

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import java.util.ArrayList

class PhrasesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numbers)
        val words: ArrayList<Word> = ArrayList()
        words.add(Word("Where are you going?", "A donde vas?"))
        words.add(Word("How old are you?", "Que edad tienes?"))
        words.add(Word("Where are you from?", "De donde eres?"))
        words.add(Word("Im going to de mall", "Voy al centro comercial"))
        words.add(Word("Im hungry", "Tengo hambre"))
        words.add(Word("Whats your name?", "Cual es tu nombre?"))
        words.add(Word("Are you at work?", "Estas en el trabajo?"))
        words.add(Word("Where are you?", "Donde estas?"))
        words.add(Word("Can you buy me something?", "Me compras comprar algo?"))
        words.add(Word("I want some cofee", "Quiero cafe"))


        val adapter = WordAdapter(this, android.R.layout.simple_list_item_1, words)
        //val itemsAdapter: ArrayAdapter<Word> = ArrayAdapter<Word>(this, android.R.layout.simple_list_item_1, words)
        val listView = findViewById<ListView>(R.id.list)
        listView.adapter = adapter
    }
}