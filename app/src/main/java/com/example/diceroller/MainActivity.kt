package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button2)
        rollButton.setOnClickListener {
            val resultTextView: TextView = findViewById(R.id.textView2)
            resultTextView.text = rollDice()
        }
    }
}
class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}

private fun rollDice(): String {
    val dice =  Dice(6)
    val rollNum: Int = dice.roll()
    return rollNum.toString()
}