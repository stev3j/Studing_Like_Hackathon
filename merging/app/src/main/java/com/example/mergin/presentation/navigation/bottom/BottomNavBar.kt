package com.example.mergin.presentation.navigation.bottom

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.mergin.designsystem.theme.ComponentColor
import com.example.mergin.designsystem.theme.MainColor

@Composable
fun BottomNavBar(navController: NavController) {
    val items = listOf (
        Screen.Home,
        Screen.Rank,
        Screen.Community,
        Screen.Profile,
    )
    BottomNavigation(
        backgroundColor = MaterialTheme.colors.surface
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()

        items.forEach { item ->
            val currentDestination = navBackStackEntry?.destination?.route
            val selected = currentDestination == item.screenRoute

            BottomNavigationItem(
                icon = {
                    Icon(
                        painter = painterResource(id = item.icon),
                        contentDescription = item.title,
                        modifier = Modifier
                            .width(26.dp)
                            .height(26.dp),
                        tint = if (selected) MainColor else ComponentColor
                    )
                },
                selectedContentColor = MainColor,
                unselectedContentColor = ComponentColor,
                selected = currentDestination == item.screenRoute,
                onClick = {
                    navController.navigate(item.screenRoute) {
                        navController.graph.startDestinationRoute?.let {
                            popUpTo(it) { saveState = true }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BottomNavigationPreview() {
    val navController = rememberNavController()
    BottomNavBar(navController = navController)
}