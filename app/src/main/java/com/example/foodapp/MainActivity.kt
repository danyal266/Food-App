package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
    }

    fun Register(view: android.view.View) {
        val intent = Intent(this,SignUp_Activity::class.java)
        startActivity(intent)
    }
    fun Skip(view: android.view.View) {
        val intent = Intent(this,coofee_picture::class.java)
        startActivity(intent)
    }
    fun LogIn(view: android.view.View) {
        val intent = Intent(this,Signin_Activity::class.java)
        startActivity(intent)
    }
}