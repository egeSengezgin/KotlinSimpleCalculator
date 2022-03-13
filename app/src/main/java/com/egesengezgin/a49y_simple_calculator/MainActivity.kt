package com.egesengezgin.a49y_simple_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var number1 : Int? = null
    var number2 : Int? = null
    var result : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mySum(view : View){
        number1 = editText.text.toString().toIntOrNull()
        number2 = editText2.text.toString().toIntOrNull()

        if(number1 == null || number2 == null){

            resultText.text = "Error!"
        }
        else {
            result = number1!! + number2!!
            resultText.text = "Result: $result"
        }
    }
    fun mySub(view : View){
        number1 = editText.text.toString().toIntOrNull()
        number2 = editText2.text.toString().toIntOrNull()

        if(number1 == null || number2 == null){

            resultText.text = "Error!"
        }
        else {
            result = number1!! - number2!!
            resultText.text = "Result: $result"
        }

    }
    fun myMul(view : View){
        number1 = editText.text.toString().toIntOrNull()
        number2 = editText2.text.toString().toIntOrNull()

        if(number1 == null || number2 == null){

            resultText.text = "Error!"
        }
        else {
            result = number1!! * number2!!
            resultText.text = "Result: $result"
        }

    }
    fun myDiv(view : View){
        number1 = editText.text.toString().toIntOrNull()
        number2 = editText2.text.toString().toIntOrNull()

        if(number1 == null || number2 == null){

            resultText.text = "Error!"
        }
        else if(number2 == 0){
            resultText.text="You can't divide with 0"
        }
        /* else if(number1 % number2 != 0 ){
            var resultDouble = result.toDouble()
            resultText.text = "Result: $resultDouble"

        }
            *Baştaki tanımlamalardan dolayı olmadı sanırım,
            denemeye değerdi!
         */
        else {
            result = number1!! / number2!!
            resultText.text = "Result: $result"
        }

    }
}