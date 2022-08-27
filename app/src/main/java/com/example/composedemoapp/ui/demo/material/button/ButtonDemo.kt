package com.example.composedemoapp.ui.demo.material.button

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ButtonScreen() {
    MaterialTheme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ButtonExample()

            Spacer(modifier = Modifier.height(100.dp))

            OutlinedButtonExample()

            Spacer(modifier = Modifier.height(100.dp))

            TextButtonExample()
        }
    }
}

@Composable
fun ButtonExample() {
    Button(
        onClick = {},
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = Color.Red
        )
    ) {
        Text(text = "Button")
    }
}

@Composable
fun OutlinedButtonExample() {
    OutlinedButton(onClick = {}) {
        Text(text = "I'm an Outlined Button")
    }
}

@Composable
fun TextButtonExample() {
    TextButton(onClick = {}) {
        Text(text = "I'm a Text Button")
    }
}

@Preview
@Composable
fun ButtonScreenPreview() {
    ButtonScreen()
}
