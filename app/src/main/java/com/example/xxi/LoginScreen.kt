package com.example.xxi

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.compose.ui.platform.LocalContext

@Composable
fun LoginScreen(navController: NavHostController){
    Column(
        modifier= Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.a), contentDescription = "Login Image",
            modifier = Modifier
                .width(390.dp)
                .height(125.dp))

        Text(text = "Sign In", fontSize = 28.sp, fontWeight = FontWeight.Bold, color = Color(0xff00554c),
        modifier = Modifier
            //.align(Alignment.Start)
            .padding(30.dp))

        Spacer(modifier = Modifier.height(4.dp))

        OutlinedTextField(value = "", onValueChange = {}, label ={ Text(text = "Email address") },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                textColor = Color.Black, // Warna teksasad
                focusedLabelColor = Color(0xff00554c),
                focusedBorderColor = Color(0xff00554c), // Warna garis bawah saat fokus
                unfocusedBorderColor = Color(0xff00554c), // Warna garis bawah saat tidak fokus
                unfocusedLabelColor = Color(0xff00554c),
                cursorColor = Color(0xff00554c)
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = "", onValueChange = {}, label ={ Text(text = "Password") },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                textColor = Color.Black, // Warna teksasad
                focusedLabelColor = Color(0xff00554c),
                focusedBorderColor = Color(0xff00554c), // Warna garis bawah saat fokus
                unfocusedBorderColor = Color(0xff00554c), // Warna garis bawah saat tidak fokus
                unfocusedLabelColor = Color(0xff00554c),
                cursorColor = Color(0xff00554c)
            )
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "Forgot Password?", color = Color(0xff00554c), modifier = Modifier
            .clickable {}
            .align(Alignment.Start)
            .padding(start = 57.dp))

        Spacer(modifier = Modifier.height(25.dp))

        Button(onClick = { navController.navigate("home") },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xff00554c),
                    contentColor = Color(0xffF2DB95)),
                modifier = Modifier.size(width = 250.dp, height = 40.dp)
        ) {
            Text(text = "Sign In", fontWeight = FontWeight.Bold)
        }

        Spacer(modifier = Modifier.height(65.dp))

        Text(text = "Or sign in with", color = Color(0xff00554c))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(40.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Image(painter = painterResource(id = R.drawable.gmail), contentDescription = "Facebook",
                modifier = Modifier
                    .size(60.dp)
                    .clickable {

                    })

            Image(painter = painterResource(id = R.drawable.fb), contentDescription = "Google",
                modifier = Modifier
                    .size(60.dp)
                    .clickable {

                    })

            Image(painter = painterResource(id = R.drawable.x), contentDescription = "Instagram",
                modifier = Modifier
                    .size(60.dp)
                    .clickable {

                    })
        }
    }
}
