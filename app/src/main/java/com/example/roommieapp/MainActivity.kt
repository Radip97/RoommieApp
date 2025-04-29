package com.example.roommieapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
<<<<<<< HEAD
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
=======
import androidx.compose.runtime.*
>>>>>>> b0db30e (login)
import com.example.roommieapp.ui.theme.RoommieAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
<<<<<<< HEAD
        enableEdgeToEdge()
        setContent {
            RoommieAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
=======
        setContent {
            RoommieAppTheme {
                var currentScreen by remember { mutableStateOf("login") }

                when (currentScreen) {
                    "login" -> LoginScreen(
                        onLoginSuccess = {
                            // TODO: Navigate to Swipe screen
                        },
                        onNavigateToSignUp = {
                            currentScreen = "signup"
                        }
                    )
                    "signup" -> SignupScreen(
                        onSignupSuccess = {
                            currentScreen = "login" // Or navigate to Swipe screen
                        },
                        onBackToLogin = {
                            currentScreen = "login"
                        }
>>>>>>> b0db30e (login)
                    )
                }
            }
        }
    }
}
<<<<<<< HEAD

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RoommieAppTheme {
        Greeting("Android")
    }
}
=======
>>>>>>> b0db30e (login)
