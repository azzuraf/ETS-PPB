package com.example.xxi

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SynopsisScreen() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.top_app), contentDescription = "Top App",
            modifier = Modifier
                .width(390.dp)
                .height(95.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Cash Out",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xff00554c),
        )

        Spacer(modifier = Modifier.height(4.dp))

        Image(
            painter = painterResource(id = R.drawable.cash_out_ori), contentDescription = "poster",
            modifier = Modifier
                .width(140.dp)
                .height(250.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.trailer), contentDescription = "poster",
            modifier = Modifier
                .width(195.dp)
                .height(60.dp)
        )

        Text(
            text = "Professional thief Mason attempts his biggest heist with his brother, robbing a bank. When it goes wrong, they're trapped inside surrounded by law enforcement. Tension rises as Mason negotiates with his ex-lover, the lead negotiator. Every heist has its price.",
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            color = Color(0xff00554c),
            textAlign = TextAlign.Center,
            modifier = Modifier
                        .padding(10.dp)
        )

    }
}