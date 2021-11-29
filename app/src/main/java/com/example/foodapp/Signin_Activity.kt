package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_signin.*

class Signin_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        supportActionBar?.setTitle("Sign In")
    }

    fun facebook(view: android.view.View) {
        Toast.makeText(this, "Facebook Button was Clicked", Toast.LENGTH_SHORT).show()
    }
    fun google(view: android.view.View) {
        Toast.makeText(this, "Google Button was Clicked", Toast.LENGTH_SHORT).show()
    }
    fun want_to_Create(view: android.view.View) {
        val intent = Intent(this,SignUp_Activity::class.java)
        startActivity(intent)
    }

    fun Sign_In(view: android.view.View) {
        val email = email_sign.editableText.toString()
        val pass = password.editableText.toString()
        when {
            email.isEmpty() -> {
                Toast.makeText(this, "Pleas enter the email.", Toast.LENGTH_SHORT).show()
            }
            pass.isEmpty() -> {
                Toast.makeText(this, "Pleas enter the password.", Toast.LENGTH_SHORT).show()
            }
            else -> {
                val intent = Intent(this,coofee_picture::class.java)
                startActivity(intent)
            }
        }
    }
}