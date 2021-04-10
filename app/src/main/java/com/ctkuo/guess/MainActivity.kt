package com.ctkuo.guess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val secretNumber = SecretNumber()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Mainactivity", "onCreate: "+secretNumber.secretNumber)

    }
    fun check(view : View){
        val n=ed_number.text.toString().toInt()

        println("number      :  $n")
        //Log.d("Mainactivity", "number: " +n)
        var message = "You got it"
        val diff=secretNumber.validate(n)
        if (diff <0) {
            message = "Bigger"
        }else if (diff >0 ){
            message = "smaller"
        }
        AlertDialog.Builder(this)
                .setTitle("Message")
                .setMessage(message)
                .setPositiveButton("OK",null)
                .show()
    }
}