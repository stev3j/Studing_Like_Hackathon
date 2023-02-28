package com.example.mergin.presentation.navigation.bottom

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mergin.presentation.ui.community.CommunityScreen
import com.example.mergin.presentation.ui.login.LoginScreen
import com.example.mergin.presentation.ui.main.MainScreen
import com.example.mergin.presentation.ui.my.MyScreen
import com.example.mergin.presentation.ui.rank.RankScreen

@Composable
fun BottomNavHost(navController: NavHostController) {

    NavHost(navController = navController, startDestination = Screen.Home.screenRoute) {
        composable(Screen.Home.screenRoute) {
            MainScreen()
        }
        composable(Screen.Rank.screenRoute) {
            RankScreen()
        }
        composable(Screen.Community.screenRoute) {
            CommunityScreen()
        }
        composable(Screen.Profile.screenRoute) {
            MyScreen()
        }
    }
}