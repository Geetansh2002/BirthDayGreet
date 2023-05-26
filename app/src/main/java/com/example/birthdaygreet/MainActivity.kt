package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button =findViewById<Button>(R.id.button1)
        val name2=findViewById<EditText>(R.id.name)
        val age2=findViewById<EditText>(R.id.age)
        val name=name2.text.toString()
        val age=age2.text.toString()


        button.setOnClickListener{
            val intent=Intent(this,greeting::class.java)
            intent.putExtra("name",name)
            intent.putExtra("age",age)
            startActivity(intent)
        }
    }
}