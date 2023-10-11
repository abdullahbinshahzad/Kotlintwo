package com.example.kotlintwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var DiceView: TextView
    lateinit var RollBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DiceView = findViewById(R.id.dice_view)
        RollBtn = findViewById(R.id.roll_btn)

        RollBtn.setOnClickListener {
            rolldice()
        }
    }

    private fun rolldice() {
        val random_value = Random.nextInt(6) + 1
        DiceView.text = random_value.toString()
    }
}