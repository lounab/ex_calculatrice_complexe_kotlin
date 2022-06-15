package com.example.iimapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var isNewOperator = true
    var edt1 : EditText? = null
    var operator = "+"
    var initialNumber = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun numberEvent(view: View) {
        if (isNewOperator) editText.setText("")
        isNewOperator = false

        var number: String = editText.text.toString()

        if (view.id === btnOne.id) {
            number += "1"
        }
        else if (view.id === btnTwo.id) {
            number += "2"
        }
        else if (view.id === btnThree.id) {
            number += "3"
        }
        else if (view.id === btnFour.id) {
            number += "4"
        }
        else if (view.id === btnFive.id) {
            number += "5"
        }
        else if (view.id === btnSix.id) {
            number += "6"
        }
        else if (view.id === btnSeven.id) {
            number += "7"
        }
        else if (view.id === btnEight.id) {
            number += "8"
        }
        else if (view.id === btnNine.id) {
            number += "9"
        }
        else if (view.id === btnZero.id) {
            number += "0"
        }
        else if (view.id === btnPoint.id) {
            number += "."
        }
        editText.setText(number)
    }

    fun operatorEvent(view: View) {
        isNewOperator = true
        initialNumber = editText.text.toString()

        if (view.id === btnMultiplication.id) {
            operator = "*"
        }
        else if (view.id === btnSoustraction.id) {
            operator = "-"
        }
        else if (view.id === btnDivision.id) {
            operator = "/"
        }
        else if (view.id === btnAddition.id) {
            operator = "+"
        }
    }

    fun egaliteEvent(view: View?){
        val newNumber: String = editText.text.toString()
        var output = 0.0

        if (operator === "+") output = initialNumber.toDouble() + newNumber.toDouble()
        if (operator === "/") output = initialNumber.toDouble() / newNumber.toDouble()
        if (operator === "*") output = initialNumber.toDouble() * newNumber.toDouble()
        if (operator === "-") output = initialNumber.toDouble() - newNumber.toDouble()

        editText.setText(output.toString() + "")
    }

    fun clearEvent(view: View?) {
        editText.setText("0")
        isNewOperator = true
    }

    fun pourcentEvent(view: View?) {
        val num: Double = editText.text.toString().toDouble() / 100
        editText.setText(num.toString() + "")
        isNewOperator = true
    }
}