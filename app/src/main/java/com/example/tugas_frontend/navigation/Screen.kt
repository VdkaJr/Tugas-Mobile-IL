package com.example.tugas_frontend.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Grid : Screen("grid")
    object About : Screen("about")
    object Detail : Screen("detail/{itemId}")

    fun createRoute(itemId: Int) = "detail/$itemId"
}