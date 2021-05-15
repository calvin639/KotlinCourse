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
            val result1: TextView =findViewById(R.id.res1)
            val result2: TextView =findViewById(R.id.res2)
            val win: TextView =findViewById(R.id.winner)
            val die = Dice(6) //Create a new class from Dice
            val die1 = die.roll() //Roll it and save output
            val die2 = die.roll() //Roll it and save output
            result1.text = die1.toString() //Convert to a string
            result2.text = die2.toString()
            if (die1==die2){
                win.text ="You got a pair\n" +
                        "YOU WIN!!!"
            } else {
                win.text ="No pair\n" +
                        "YOU LOSE!!!"}
        }



    }
}