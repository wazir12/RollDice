package com.lwazir.deviceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button : Button = findViewById(R.id.roll_button)
        diceImage = findViewById(R.id.dice_image)
        button.setOnClickListener {
           // Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }

    }

    private fun rollDice() {

        var random: Int = Random().nextInt(6) + 1
        val drawableResource = when (random) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }
}
