package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)

        class Dice(val numSides: Int) {

            fun roll(): Int {
                return (1..numSides).random()
            }
        }

        rollButton.setOnClickListener{
            //Toasts are little pop up messages
            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()
            val resultTextView: TextView =findViewById(R.id.textView)
            val die = Dice(6) //Create a new class from Dice
            val dieRoll = die.roll() //Roll it and save output
            resultTextView.text = dieRoll.toString() //Convert to a string
        }



    }
}