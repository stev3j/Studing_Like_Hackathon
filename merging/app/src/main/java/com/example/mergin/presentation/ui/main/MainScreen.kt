package com.example.mergin.presentation.ui.main

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mergin.designsystem.theme.BackgroundColor
import com.example.mergin.R
import com.example.mergin.designsystem.theme.WhiteColor

@Composable
fun MainScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "") },
                backgroundColor = BackgroundColor,
                elevation = 0.dp,
                actions = {
                    IconButton(onClick = { /* TODO: implement action */ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_notification),
                            contentDescription = null
                        )
                    }
                }
            )
        },
        backgroundColor = BackgroundColor
    ) {
        Row(
            verticalAlignment = Alignment.Bottom,
            modifier = Modifier.padding(horizontal = 16.dp)
        ){
            Text(text = "stev3j님\n커밋하세요!")
            Spacer(modifier = Modifier.weight(1f))
            IconButton(onClick = { /* TODO: implement action */ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_info_circle),
                    contentDescription = null,
                    modifier = Modifier.width(24.dp).height(24.dp)
                )
            }
        }
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(15.dp))

            // Todo( add surface )
        }
    }
}

@Composable
fun FirstSurface() {
    Surface(
        color = WhiteColor,
        elevation = 10.dp,
        shape = RoundedCornerShape(10.dp)
    ) {

    }
}