package dev.quewui.authenticationflow

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.quewui.authenticationflow.ui.screens.Home
import dev.quewui.authenticationflow.ui.screens.Login
import dev.quewui.authenticationflow.ui.screens.SignUp
import dev.quewui.authenticationflow.ui.screens.VerificationCode
import dev.quewui.authenticationflow.ui.viewmodel.Auth

@Composable
fun AppNavigator(viewModel: Auth){
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