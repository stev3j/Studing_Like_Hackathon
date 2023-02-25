package com.example.mergin.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mergin.designsystem.theme.ComponentColor
import com.example.mergin.designsystem.theme.ContainerColor
import com.example.mergin.designsystem.theme.MainColor
import com.example.mergin.designsystem.theme.WhiteColor

sealed interface InputType {
    object Default : InputType
    object Focus : InputType
}

@Composable
fun MergingTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    textStyle: TextStyle = MaterialTheme.typography.body1,
    textColor: Color = Color.Black,
    hint: String = "",
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions(),
    singleLine: Boolean = true,
    maxLines: Int = 1,
) {
    val mergedTextStyle = textStyle.merge(TextStyle(color = textColor))
    val focusRequester by remember { mutableStateOf(FocusRequester()) }

    var isFocused by remember { mutableStateOf(false) }

    val currentInputType: InputType by remember { mutableStateOf(if (isFocused) InputType.Focus else InputType.Default) }

    val cursorColor = when (currentInputType) {
        is InputType.Focus -> MainColor
        is InputType.Default -> Color.Gray
    }

    Column {
        BasicTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = modifier
                .background(
                    color = Color.Transparent,
                    shape = MaterialTheme.shapes.small
                )
                .focusRequester(focusRequester = focusRequester)
                .onFocusChanged { isFocused = it.isFocused },
            enabled = enabled,
            textStyle = mergedTextStyle,
            cursorBrush = SolidColor(cursorColor),
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            singleLine = singleLine,
            maxLines = maxLines,
            decorationBox = @Composable {
                InputDecoration(
                    value = value,
                    hint = hint,
                )
            }
        )
    }
}

@Composable
private fun InputDecoration(
    value: String,
    hint: String,
) {

    Surface(
        shape = RoundedCornerShape(10.dp),
        color = ContainerColor,
        modifier = Modifier
            .height(50.dp)
            .fillMaxWidth()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .padding(vertical = 5.dp)
            ) {
                if (value.isEmpty()) {
                    Text(text = hint, color = ComponentColor)
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun TextFieldPreview() {
    val focusManager = LocalFocusManager.current
    var testValue by remember { mutableStateOf("") }

    Surface(modifier = Modifier.padding(16.dp)) {
        MergingTextField(
            value = testValue,
            onValueChange = { testValue = it },
            hint = "이름을 입력해주세요.",
            keyboardActions = KeyboardActions(
                onDone = { focusManager.clearFocus() }
            ),
        )
    }
}