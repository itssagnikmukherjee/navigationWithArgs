package com.sagnikmukherjee.testapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sagnikmukherjee.testapp.ui.screens.ScreenAUI
import com.sagnikmukherjee.testapp.ui.screens.ScreenBUI

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = ScreenA){
        composable<ScreenA> { ScreenAUI(navController) }
        composable<ScreenB> {
            val name = it.arguments?.getString("name")
            val age = it.arguments?.getInt("age")
            ScreenBUI(navController, name, age)
        }
    }
}

