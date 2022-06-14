package com.example.iimapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addnumber(view: View) {
        var number1: Int = if (first_number.text.toString().isEmpty()) 0 else first_number.text.toString().toInt()
        var number2: Int = if (second_number.text.toString().isEmpty()) 0 else second_number.text.toString().toInt()

        if (number1 == 0 && number2 == 0) {
            Toast.makeText(applicationContext,"Veuillez rentrer des valeurs",Toast.LENGTH_LONG).show()
        }
        else {
            var result: Int = number1 + number2
            textView2.setText(result.toString())
        }

    }

    fun sousnumber(view: View) {
        var number1: Int = if (first_number.text.toString().isEmpty()) 0 else first_number.text.toString().toInt()
        var number2: Int = if (second_number.text.toString().isEmpty()) 0 else second_number.text.toString().toInt()

        if (number1 == 0 && number2 == 0) {
            Toast.makeText(applicationContext,"Veuillez rentrer des valeurs",Toast.LENGTH_LONG).show()
        }
        else {
            var result: Int = number1 - number2
            textView2.setText(result.toString())
        }

    }

    fun divnumber(view: View) {
        var number1: Int = if (first_number.text.toString().isEmpty()) 0 else first_number.text.toString().toInt()
        var number2: Int = if (second_number.text.toString().isEmpty()) 0 else second_number.text.toString().toInt()

        if (number1 == 0 && number2 == 0) {
            Toast.makeText(applicationContext,"Veuillez rentrer des valeurs",Toast.LENGTH_LONG).show()
        }
        else {
            var result: Int = number1 / number2
            textView2.setText(result.toString())
        }

    }

    fun multnumber(view: View) {
        var number1: Int = if (first_number.text.toString().isEmpty()) 0 else first_number.text.toString().toInt()
        var number2: Int = if (second_number.text.toString().isEmpty()) 0 else second_number.text.toString().toInt()

        if (number1 == 0 && number2 == 0) {
            Toast.makeText(applicationContext,"Veuillez rentrer des valeurs",Toast.LENGTH_LONG).show()
        }
        else {
            var result: Int = number1 * number2
            textView2.setText(result.toString())
        }

    }
}