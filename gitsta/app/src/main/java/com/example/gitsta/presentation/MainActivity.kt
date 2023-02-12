package com.example.gitsta.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.navigation.compose.rememberNavController
import com.example.gitsta.presentation.ui.theme.GitStaTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GitStaTheme {
                Surface(color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()
//                    NavHost(
//                        navController = navController,
//                        startDestination = Screen.HomeScreen.route
//                    ) {
//                        composable(
//                            route = Screen.HomeScreen.route
//                        ) {
//                            HomeScreen(navController)
//                        }
//                        composable(
//                            route = Screen.CoinDetailScreen.route + "/{coinId}"
//                        ) {
//                            CoinDetailScreen()
//                        }
//                    }
                }
            }
        }
    }
}