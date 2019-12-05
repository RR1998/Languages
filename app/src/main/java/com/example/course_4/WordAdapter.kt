package com.example.course_4

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.TextView

class WordAdapter(
    context: Context,
    private val layoutResource: Int,
    private val words: ArrayList<Word>
) : ArrayAdapter<Word>(context, layoutResource, words) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return createViewFromResource(position, convertView, parent)
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        return createViewFromResource(position, convertView, parent)
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return words.size
    }

    private fun createViewFromResource(
        position: Int,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        val view: TextView = convertView as TextView? ?: LayoutInflater.from(context).inflate(
            layoutResource,
            parent,
            false
        ) as TextView
        view.setTextColor(context.resources.getColor(R.color.white))
        if (context is ColorsActivity) {
            view.setBackgroundColor(context.resources.getColor(R.color.category_colors))
        }
        if (context is FamilyActivity) {
            view.setBackgroundColor(context.resources.getColor(R.color.category_family))
        }
        if (context is NumbersActivity) {
            view.setBackgroundColor(context.resources.getColor(R.color.category_numbers))
        }
        if (context is PhrasesActivity) {
            view.setBackgroundColor(context.resources.getColor(R.color.category_phrases))
        }
        val Params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        view.id = (1)
        view.layoutParams
        view.text =
            ("Word: ${words[position].word} \nTranslation:${words[position].translationWord}")
        val linearLayout: LinearLayout = view.findViewById(R.id.list)
        linearLayout.layoutParams = Params
        linearLayout.addView(view)
        return linearLayout
    }
}