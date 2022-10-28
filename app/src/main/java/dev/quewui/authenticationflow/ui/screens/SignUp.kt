package dev.quewui.authenticationflow.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import dev.quewui.authenticationflow.ui.viewmodel.Auth

@Composable
fun SignUp(viewModel: Auth) {
    Column(
        verticalArrangement = Arrangement.spacedBy(
            10.dp,
            alignment = Alignment.CenterVertically
        ),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        TextField(
            value = "",
            onValueChange = {},
            placeholder = {
                Text("Username")
            }
        )
        TextField(
            value = "",
            onValueChange = {},
            placeholder = {
                Text("E-mail")
            }
        )
        TextField(
            value = "",
            onValueChange = {},
            placeholder = {
                Text("E-mail")
            }
        )
        TextField(
            value = "",
            onValueChange = {},
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            placeholder = {
                Text("Password")
            }
        )
        Button(onClick = viewModel::signUp) {
            Text("Sign up")
        }
        TextButton(onClick = viewModel::showLogin ) {
            Text("Already have an account? Login!")
        }
    }
}