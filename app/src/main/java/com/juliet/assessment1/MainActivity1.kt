package com.juliet.assessment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.juliet.assessment1.databinding.ActivityMain1Binding
import com.juliet.assessment1.databinding.ActivityMainBinding

class MainActivity1 : AppCompatActivity() {
    lateinit var binding: ActivityMain1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        validateSignup()


    }


    fun validateSignup() {
        val username = binding.etUsername.text.toString()
        val email = binding.etEmail.text.toString()
        val password = binding.etPassword.text.toString()
        val confirmpassword = binding.etConfirmpassword.text.toString()
        var error = false

        if (username.isBlank()) {
            binding.tilUsername.error = "First name is required"
            error = true

        }

        if (email.isBlank()) {
            binding.tilEmail.error = "First name is required"
            error = true

        }
        if (password.isBlank()) {
            binding.tilPassword.error = "First name is required"
            error = true

        }
        if (confirmpassword.isBlank()) {
            binding.tilConfirmpassword.error = "First name is required"
            error = true

        }
        if (password != confirmpassword) {
            binding.tilConfirmpassword.error = "Confirmation password does not match"
            error = true
        }
        if (!error) {
            Toast.makeText(this, "Congradulations Joy on your sign up", Toast.LENGTH_SHORT)
                .show()
        }

    }
}
