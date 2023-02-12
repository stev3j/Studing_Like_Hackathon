package com.example.gitsta.presentation

sealed class Screen(val route: String) {
    object HomeScreen: Screen("home_screen")
    object SearchScreen: Screen("search_screen")
    object CodeScreen: Screen("code_screen")
    object MyScreen: Screen("my_screen")
}
