package com.example.roommieapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.roommieapp.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.btnLogin.setOnClickListener {
            val email = binding.etEmail.text.toString().trim()
            val password = binding.etPassword.text.toString().trim()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                auth.signInWithEmailAndPassword(email, password)
                    .addOnSuccessListener {
                        Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
<<<<<<< HEAD
                        // TODO: Create SwipeActivity first before enabling this!
                        // startActivity(Intent(this, SwipeActivity::class.java))
=======
                        startActivity(Intent(this, SwipeActivity::class.java))
>>>>>>> b0db30e (login)
                        finish()
                    }
                    .addOnFailureListener {
                        Toast.makeText(this, "Login failed: ${it.message}", Toast.LENGTH_SHORT).show()
                    }
            }
        }

        binding.btnSignup.setOnClickListener {
            val email = binding.etEmail.text.toString().trim()
            val password = binding.etPassword.text.toString().trim()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                auth.createUserWithEmailAndPassword(email, password)
                    .addOnSuccessListener {
                        Toast.makeText(this, "Account created", Toast.LENGTH_SHORT).show()
                    }
                    .addOnFailureListener {
                        Toast.makeText(this, "Sign up failed: ${it.message}", Toast.LENGTH_SHORT).show()
                    }
            }
        }
    }
}
