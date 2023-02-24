package com.example.mergin.presentation.ui.login

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mergin.designsystem.component.MergingButton
import com.example.mergin.designsystem.theme.ContainerColor
import com.example.mergin.designsystem.theme.MainColor
import com.example.mergin.designsystem.theme.WhiteColor

@Composable
fun LoginScreen() {
    Scaffold() {
        MergingButton(
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

@Composable
@Preview(showBackground = true)
fun Preview() {
    Scaffold(
        modifier = Modifier.padding(horizontal = 16.dp)
    ) {
        LoginScreen()
    }
}