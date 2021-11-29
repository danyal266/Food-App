package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUp_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        supportActionBar?.setTitle("Sign Up")
    }

    fun Register(view: android.view.View) {
    val user = UserName.editableText.toString()
        val pass = password.editableText.toString()
        val email = email.editableText.toString()
          val phone = PhoneNumber.editableText.toString()
        when {
            user.isEmpty() -> {
                Toast.makeText(this, "Please enter the UserName", Toast.LENGTH_SHORT).show()
            }
            pass.isEmpty() -> {
                Toast.makeText(this, "Please enter the Password", Toast.LENGTH_SHORT).show()
            }
            email.isEmpty() -> {
                Toast.makeText(this, "Please Enter the email.", Toast.LENGTH_SHORT).show()
            }
            phone.isEmpty() -> {
                Toast.makeText(this, "please Enter the PhoneNumber", Toast.LENGTH_SHORT).show()
            }
            else -> {
                val intent = Intent(this,coofee_picture::class.java)
                startActivity(intent)
            }
        }
            }





    fun facebook(view: android.view.View) {
        Toast.makeText(this, "Facebook Button was Clicked.", Toast.LENGTH_SHORT).show()
    }
    fun google(view: android.view.View) {
        Toast.makeText(this, "Google Button was Clicked.", Toast.LENGTH_SHORT).show()
    }
    fun already_have_login(view: android.view.View) {
        val intent = Intent(this,coofee_picture::class.java)
        startActivity(intent)
    }
}