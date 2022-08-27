package com.example.composedemoapp.ui.demo.material.alertdialog

import androidx.compose.foundation.layout.Column
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun AlertDialogScreen() {
    MaterialTheme {
        Column {
            val openDialog = remember { mutableStateOf(false) }

            Button(onClick = {
                openDialog.value = true
            }) {
                Text(text = "Click me")
            }

            if (openDialog.value) {
                AlertDialog(
                    onDismissRequest = { openDialog.value = false },
                    title = { Text(text = "Dialog Title") },
                    text = { Text(text = "Here is a text") },
                    confirmButton = {
                        Button(
                            onClick = {
                                openDialog.value = false
                            }
                        ) {
                            Text(text = "This is the Confirm Button")
                        }
                    },
                    dismissButton = {
                        Button(
                            onClick = {
                                openDialog.value = false
                            }
                        ) {
                            Text(text = "This is the dismiss Button")
                        }
                    }
                )
            }
        }
    }
}

@Preview
@Composable
fun AlertDialogScreenPreview() {
    AlertDialogScreen()
}
