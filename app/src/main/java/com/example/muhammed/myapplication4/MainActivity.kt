package com.example.muhammed.myapplication4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var editText : EditText

    lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.button)
        editText = findViewById(R.id.firstname)

        btn.setOnClickListener{
            var intent:Intent = Intent(applicationContext,Main2Activity::class.java)
         var firstname = editText.text.toString()
         intent.putExtra("firstname",firstname)
       startActivity(intent)
        }
    }



}


