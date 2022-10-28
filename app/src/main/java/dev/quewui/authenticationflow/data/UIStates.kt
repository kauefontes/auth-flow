package dev.quewui.authenticationflow.data

data class SignupState(
    var username: String= "",
    var email: String = "",
    var password: String = ""
)

data class LoginState(
    var username: String = "",
    var password: String = ""
)

data class VerificationState(
    var username: String = "",
    var code: String = ""
)

data class HomeState(
    var username: String = ""
)
