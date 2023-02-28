package com.example.mergin.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.mergin.designsystem.theme.MerginTheme
import com.example.mergin.presentation.navigation.MergingNavHost
import com.example.mergin.presentation.navigation.bottom.BottomNavBar
import com.example.mergin.presentation.navigation.bottom.BottomNavHost

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MerginTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background,
    ) {
        Scaffold(
            bottomBar = { BottomNavBar(navController = navController) }
        ) {
            Box(Modifier.padding(it)){
                BottomNavHost(navController = navController)
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun MainPreview() {
    MyApp()
}