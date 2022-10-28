package dev.quewui.authenticationflow.ui.viewmodel

import androidx.lifecycle.ViewModel

class Auth : ViewModel() {
    lateinit var navigateTo: (String) -> Unit

    fun showSignUp(){
        navigateTo("signUp")
    }

    fun showLogin(){
        navigateTo("login")
    }

    fun signUp() {
        navigateTo("verify")
    }

    fun verifyCode() {
        navigateTo("login")
    }

    fun login(){
        navigateTo("home")
    }

    fun logout(){
        navigateTo("login")
    }
}