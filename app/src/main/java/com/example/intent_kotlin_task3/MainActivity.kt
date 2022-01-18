package com.example.intent_kotlin_task3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn_main)
        btn.setOnClickListener {
            val user = User("Samandar","18")
            openSecondActivity(user)
        }
    }
    private fun openSecondActivity(user: User) {
        val intent = Intent(this,SecondActivity::class.java)
        intent.putExtra("key",user)
        startActivity(intent)
    }
}