package dev.quewui.authenticationflow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.quewui.authenticationflow.ui.screens.Home
import dev.quewui.authenticationflow.ui.screens.Login
import dev.quewui.authenticationflow.ui.screens.SignUp
import dev.quewui.authenticationflow.ui.screens.VerificationCode
import dev.quewui.authenticationflow.ui.theme.AuthenticationFlowTheme
import dev.quewui.authenticationflow.ui.viewmodel.Auth

class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<Auth>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AuthenticationFlowTheme {
                AppNavigator()
            }
        }
    }

    @Composable
    private fun AppNavigator(){
        val navController = rememberNavController()
        viewModel.navigateTo = {
            navController.navigate(it)
        }
        
        NavHost(navController = navController, startDestination = "login" ) {
            composable("login") {
                Login(viewModel)
            }
            composable("signUp"){
                SignUp(viewModel)
            }
            composable("verify"){
                VerificationCode(viewModel)
            }
            composable("home"){
                Home(viewModel)
            }
        }
    }


}