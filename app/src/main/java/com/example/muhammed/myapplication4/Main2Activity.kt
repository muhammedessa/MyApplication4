package com.example.muhammed.myapplication4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class Main2Activity : AppCompatActivity() {

    lateinit var btn : Button
    lateinit var textView : TextView


     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btn = findViewById(R.id.button2)
        textView = findViewById(R.id.viewfirstname)


        var myintent: Intent = intent

       var myfirstname = myintent.getStringExtra("firstname")
        textView.text = myfirstname

        btn.setOnClickListener{
            myintent  = Intent(applicationContext,MainActivity::class.java)
            startActivity(myintent)

        }
    }
}
