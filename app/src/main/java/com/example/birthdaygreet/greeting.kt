package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class greeting : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)
        val name=intent.getStringExtra("name")
        val age=intent.getStringExtra("age")

        val text=findViewById<TextView>(R.id.message)
        text.text=name
    }
}