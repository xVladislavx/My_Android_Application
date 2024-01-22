package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var spinnerColors: Spinner
    private lateinit var textViewDescriptionTemp: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinnerColors = findViewById(R.id.spinnerColors)

        textViewDescriptionTemp = findViewById(R.id.textViewDescriptionTemp)
    }

    fun showDescription(view: View) {
        val position = spinnerColors.selectedItemPosition
        val description = getDescriptionByPosition(position)
        textViewDescriptionTemp.text = description
    }

    fun getDescriptionByPosition(position: Int): String {
        val array: Array<out String> = resources.getStringArray(R.array.description_of_temp)
        return array[position]
    }
}