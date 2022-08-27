package com.example.composedemoapp.ui.demo.material.checkbox

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Checkbox
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CheckBoxScreen() {
    MaterialTheme {
        Column {
            CheckBoxSample()
        }
    }
}

@Composable
fun CheckBoxSample() {
    val checkedState = remember { mutableStateOf(true)}
    Checkbox(
        checked = checkedState.value,
        onCheckedChange = { checkedState.value = it }
    )
}

@Preview
@Composable
fun CheckBoxScreenPreview() {
    CheckBoxScreen()
}
