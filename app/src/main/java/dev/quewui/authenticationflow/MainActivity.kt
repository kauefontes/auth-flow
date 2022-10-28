package dev.quewui.authenticationflow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import dev.quewui.authenticationflow.ui.theme.AuthenticationFlowTheme
import dev.quewui.authenticationflow.ui.viewmodel.Auth

class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<Auth>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AuthenticationFlowTheme {
                AppNavigator(viewModel)
            }
        }
    }
}