package com.sagnikmukherjee.testapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.sagnikmukherjee.testapp.ui.navigation.ScreenA

@Composable
fun ScreenBUI(navController: NavController, name: String?, age: Int?) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Screen B")
        Spacer(modifier = Modifier.height(16.dp))
        Text("$name")
        Text("$age")
        Button(onClick = { navController.navigate(ScreenA) }) {
            Text("Go to Screen A")
        }
    }
}

