package com.example.myfirstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfirstapp.ui.theme.MyFirstAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstAppTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    var message by remember { mutableStateOf("Hello World!") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFBBDEFB)), // Light Blue background
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = message,
                fontSize = 24.sp,
                color = Color.DarkGray
            )

            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = {
                message = "Task 1 Successfully Completed"
            }) {
                Text("Surprise")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MyFirstAppTheme {
        MainScreen()
    }
}
