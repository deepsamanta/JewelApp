package com.example.akashjewellers.ui.theme

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import  androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Preview
@Composable
fun EmailLogin(navController: NavController) {

    var text by remember { mutableStateOf("") }
    var number by remember { mutableStateOf("***") }
    val context = LocalContext.current

    Column(
        verticalArrangement = Arrangement.Top,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Sign in / Sign up",
            modifier = Modifier.padding(start = 10.dp, top = 50.dp),
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp
        )
        Text(
            text = "Sign up or Sign in to get updated about realtime gold, silver prices!",
            modifier = Modifier.padding(start = 10.dp, top = 10.dp),
            color = Color.Black, fontSize = 20.sp
        )
        Text(
            text = "Enter Your Email",
            modifier = Modifier.padding(start = 10.dp, top = 35.dp),
            color = Color.Black, fontWeight = FontWeight.SemiBold,
            fontSize = 25.sp

        )

        TextField(
            value = text,
            onValueChange = {
                text = it
            },
            modifier = Modifier
                .alpha(.1f)
                .fillMaxWidth()
                .padding(start = 10.dp, top = 5.dp, end = 10.dp)

        )
        Text(
            text = "Password",
            modifier = Modifier.padding(start = 10.dp, top = 50.dp),
            color = Color.Black, fontWeight = FontWeight.SemiBold,
            fontSize = 25.sp

        )

        TextField(
            value = number,
            onValueChange = {
                number = it
            },

            modifier = Modifier
                .alpha(.1f)
                .fillMaxWidth()
                .padding(start = 10.dp, top = 5.dp, end = 10.dp)

        )
        ElevatedButton(
            onClick = {
                Toast.makeText(
                    context,
                    "Button Clicked",
                    Toast.LENGTH_SHORT
                ).show()
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, top = 30.dp, end = 10.dp),
            colors = ButtonDefaults.run {
                elevatedButtonColors(containerColor = Color.LightGray)
            }) {
            Text("Log in", fontWeight = FontWeight.SemiBold)

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            HorizontalDivider(
                thickness = 1.dp,
                modifier = Modifier
                    .padding(top = 20.dp, start = 10.dp, end = 10.dp)
                    .weight(1f)
            )
            Text(
                "OR", modifier = Modifier
                    .padding(top = 12.dp, start = 10.dp, end = 10.dp)
            )
            HorizontalDivider(
                thickness = 1.dp,
                modifier = Modifier
                    .padding(top = 20.dp, start = 10.dp, end = 10.dp)
                    .weight(1f)
            )

        }
        ElevatedButton(
            onClick = {
                Toast.makeText(
                    context,
                    "Button Clicked",
                    Toast.LENGTH_SHORT
                ).show()
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, top = 30.dp, end = 10.dp),
            colors = ButtonDefaults.run {
                elevatedButtonColors(containerColor = Color.LightGray)
            }) {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = null,
                modifier = Modifier.padding(end = 10.dp)
            )

            Text("Register", fontWeight = FontWeight.SemiBold)

        }
    }

}