package dev.quewui.authenticationflow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dev.quewui.authenticationflow.ui.theme.AuthenticationFlowTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AuthenticationFlowTheme {
                Home()
            }
        }
    }
}