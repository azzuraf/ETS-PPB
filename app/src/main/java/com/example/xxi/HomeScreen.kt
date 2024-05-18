package com.example.xxi

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navController: NavHostController) {

    Column(
        modifier= Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.top_app), contentDescription = "Top App",
            modifier = Modifier
                .width(390.dp)
                .height(95.dp))

        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "Upcoming", fontSize = 28.sp, fontWeight = FontWeight.Bold, color = Color(0xff00554c),
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 30.dp)
                .clickable{navController.navigate("synopsis")})
    }
        // Tampilan utama di dalam Scaffold
        Column(
            modifier = Modifier
                .padding(top = 180.dp)
                .fillMaxSize()
                .clickable{navController.navigate("synopsis")}
        ) {
            // Tampilkan daftar film dalam dua kolom card
            val movies = listOf(
                Movie("The Architecture of Love", R.drawable.taol),
                Movie("Cash Out", R.drawable.cash_out),
                Movie("The Architecture of Love", R.drawable.taol),
                Movie("Cash Out", R.drawable.cash_out)
            )
            TwoColumnMovieList(movies = movies)
        }
    }


//@Preview
//@Composable
//fun PreviewTwoColumnMovieList() {
//    val movies = listOf(
//        Movie("The Architecture of Love", R.drawable.taol),
//        Movie("Cash Out", R.drawable.cash_out),
//        Movie("Dilan 1983: Wo Ai Ni ", R.drawable.dilan),
//        Movie("Civil War", R.drawable.civil_war)
//    )
//    HomeScreen(movies = movies)
//}
