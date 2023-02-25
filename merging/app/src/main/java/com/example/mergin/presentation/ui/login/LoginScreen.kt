package com.example.mergin.presentation.ui.login

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusManager
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mergin.designsystem.component.MergingButton
import com.example.mergin.designsystem.component.MergingTextField
import com.example.mergin.designsystem.theme.ComponentColor
import com.example.mergin.designsystem.theme.ContainerColor
import com.example.mergin.designsystem.theme.MainColor
import com.example.mergin.designsystem.theme.WhiteColor

@Composable
fun LoginScreen() {
    val focusManager = LocalFocusManager.current
    var testValue by remember { mutableStateOf("") }

    Scaffold {
        Column() {
            MergingTextField(
                value = testValue,
                onValueChange = { testValue = it },
                hint = "이름을 입력해주세요.",
                keyboardActions = KeyboardActions(
                    onDone = { focusManager.clearFocus() }
                ),
            )
            Spacer(modifier = Modifier.weight(1f))
            MergingButton(
                enabled = true,
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
    Scaffold(
        modifier = Modifier.padding(horizontal = 16.dp)
    ) {
        LoginScreen()
    }
}
