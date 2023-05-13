package com.example.home.greeting

data class GreetingUiState(
    val usersName: String
) {
    companion object {
        val INITIAL = GreetingUiState(
            usersName = ""
        )
    }
}
