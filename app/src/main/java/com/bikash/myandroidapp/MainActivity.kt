package com.bikash.myandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View;
import android.widget.Toast;

class MainActivity : AppCompatActivity()  {

    val buttonArray = arrayOf("Send", "ZipOne", "ZipTwo", "ZipThree", "ZipFour")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun showText(view: View) {
        val button = view as Button
        val context = applicationContext
        val duration = Toast.LENGTH_SHORT
        val text = button.text

        val btnText = Toast.makeText(context, text, duration).show()
    }


}