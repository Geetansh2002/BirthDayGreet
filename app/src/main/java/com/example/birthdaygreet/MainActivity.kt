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

        val age=findViewById<EditText>(R.id.age).text.toString()

        val name=findViewById<EditText>(R.id.name).editableText.toString()

        button.setOnClickListener{
            val intent=Intent(this,greeting::class.java)
            intent.putExtra("name",name)
            intent.putExtra("age", age)
            startActivity(intent)
        }
    }
}