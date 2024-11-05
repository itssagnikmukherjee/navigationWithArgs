package com.sagnikmukherjee.testapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.sagnikmukherjee.testapp.ui.navigation.ScreenB
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Serializable
data class UserData(val name: String, val age: Int)

@Composable
fun ScreenAUI(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var name by remember { mutableStateOf(TextFieldValue("")) }
        var age by remember { mutableStateOf(TextFieldValue("")) }
        Text("Screen A")
        TextField(name, onValueChange = {name=it})
        TextField(age, onValueChange = {age=it})
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            navController.navigate(
                ScreenB(
                    name = name.text,
                    age = age.text.toInt()
                )
            )
        }) {
            Text("Go to Screen B")
        }
    }
}

