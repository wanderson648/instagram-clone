package com.example.clone_instagram.login.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.clone_instagram.R
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<TextInputLayout>(R.id.login_edit_email_input)
            .error = "Esse email é inválido"
    }
}