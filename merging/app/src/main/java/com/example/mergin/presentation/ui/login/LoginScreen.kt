package com.example.mergin.presentation.ui.login

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mergin.designsystem.component.MergingButton
import com.example.mergin.designsystem.theme.MainColor
import com.example.mergin.designsystem.theme.WhiteColor

@Composable
fun LoginScreen(
    navController: NavHostController
) {
    Scaffold {
        Column(
            modifier = Modifier.padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Surface(
                shape = CircleShape,
                color = MainColor,
                modifier = Modifier
                    .height(150.dp)
                    .width(150.dp)
            ) {}
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "머징에서 사용할 닉네임을 알려주세요")
            Spacer(modifier = Modifier.weight(1f))
            MergingButton(
                enabled = true,
                onClick = { navController.navigate("main_screen") },
                content = {
                    Surface(
                        shape = CircleShape,
                        color = WhiteColor,
                        modifier = Modifier
                            .height(30.dp)
                            .width(30.dp)
                    ) {}
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Log in with Github", color = WhiteColor)
                }
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun Preview() {
    val navController = rememberNavController()

    LoginScreen(navController)
}
