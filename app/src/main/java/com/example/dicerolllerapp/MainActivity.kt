package com.example.dicerolllerapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * TODO
 *
 * MainActivity class
 *
 * This class has the onCreate function for dice roller app
 * Shows default results onscreen
 */
class MainActivity : AppCompatActivity() {

    /**
     * TODO
     *onCreate() method yo create layout for main activity
     *
     * calls the rollDice() method after btn is clicked using onClickListener
     *
     * @param savedInstanceState
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)  //btn class

        //setOnClickListener is called when button is clicked
        rollButton.setOnClickListener { rollDice() } // will be executed on roll
    }

    /**
     * TODO
     *
     * method to roll the dice
     *
     * calls the roll method of dice class to generate random number and show in main activity
     */
    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll() //roll method of dice class generated random number
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()//update the text in screen
    }

    /**
     * TODO
     *
     * Dice class to roll dice
     *
     * @property numSides
     */
    class Dice(private val numSides: Int) {

        /**
         * TODO
         *generated a random number between 1 and specified integer
         *
         * @return a random number between 1 and 6 (or any value passed from constructor)
         */
        fun roll(): Int { //fun for function
            return (1..numSides).random()
        }
    }
}