package com.example.xxi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "splash") {
                composable("splash"){ SplashScreen(navController)}
                composable("login") { LoginScreen(navController) }
                composable("home") { HomeScreen(navController) }
                composable("synopsis") { SynopsisScreen() }
            }
        }
    }
}