package com.example.xxi

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    LaunchedEffect(Unit) {
        delay(2000)
        navController.navigate("login")
    }

    Surface(
        modifier = Modifier.fillMaxSize()
//        color = MaterialTheme.colors.background
    ) {
        // Gambar latar belakang
        Image(
            painter = painterResource(id = R.drawable.splashbg),
            contentDescription = null, // Tidak perlu deskripsi untuk gambar latar belakang
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )

        // Konten di tengah (logo)
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.xxi_logo),
                contentDescription = "Logo", // Deskripsi untuk gambar logo
                modifier = Modifier.size(300.dp), // Ukuran logo
                contentScale = ContentScale.Fit
            )
        }
    }
}
