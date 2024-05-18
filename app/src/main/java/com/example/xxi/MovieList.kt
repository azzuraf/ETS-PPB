package com.example.xxi

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

// Data film (contoh)
data class Movie(val title: String, val imageResId: Int)

@Composable
fun TwoColumnMovieList(movies: List<Movie>) {
    Column {
        // Memecah data film menjadi dua kolom
        val firstColumnMovies = movies.subList(0, movies.size / 2)
        val secondColumnMovies = movies.subList(movies.size / 2, movies.size)

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // Kolom pertama
            Column {
                firstColumnMovies.forEach { movie ->
                    MovieCard(movie = movie)
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }

            // Kolom kedua
            Column {
                secondColumnMovies.forEach { movie ->
                    MovieCard(movie = movie)
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }
        }
    }
}

@Composable
fun MovieCard(movie: Movie) {
    Row(
        modifier = Modifier.width(390.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = movie.imageResId),
            contentDescription = movie.title,
            modifier = Modifier
                .width(140.dp)
                .height(250.dp)
                .clickable{}
            ,
            contentScale = ContentScale.Crop
        )
        Image(
            painter = painterResource(id = movie.imageResId),
            contentDescription = movie.title,
            modifier = Modifier
                .width(140.dp)
                .height(250.dp),
            contentScale = ContentScale.Crop
        )
    }
//    Card(
//        modifier = Modifier
//            .fillMaxWidth()
//            .height(500.dp),
//        //elevation = 4.dp
//    ) {
//        Column(
//            modifier = Modifier.padding(16.dp)
//        ) {
//            Image(
//                painter = painterResource(id = movie.imageResId),
//                contentDescription = movie.title,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(400.dp),
//                contentScale = ContentScale.Crop
//            )
//            Spacer(modifier = Modifier.height(16.dp))
//            Text(
//                text = movie.title,
//                style = MaterialTheme.typography.bodyMedium,
//                modifier = Modifier.align(Alignment.CenterHorizontally)
//            )
//        }
//    }
}