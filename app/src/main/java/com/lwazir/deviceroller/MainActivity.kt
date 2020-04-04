package com.lwazir.deviceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button : Button = findViewById(R.id.roll_button)
        button.text = "Lets Roll"
        button.setOnClickListener {
           // Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }

    }

    private fun rollDice() {
        val result_view : TextView = findViewById(R.id.result_view)
        var random: Int = Random().nextInt(6) + 1
        result_view.text = random.toString()
    }
}
