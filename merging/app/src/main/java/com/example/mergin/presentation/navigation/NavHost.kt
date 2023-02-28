package com.example.mergin.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mergin.presentation.ui.login.LoginScreen
import com.example.mergin.presentation.ui.main.MainScreen

@Composable
fun MergingNavHost() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "first_login_screen") {
        composable("first_login_screen") {
             LoginScreen(navController)
        }
//        composable("second_login_screen") {
//            SecondLoginScreen(navController)
//        }
        composable("main_screen") {
            MainScreen()
        }
    }
}