package com.example.composedemoapp.ui.home

import androidx.compose.runtime.Composable
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController

sealed interface DemoNavScreenSpec {

    companion object {
        fun getAllDemoNavScreenSpec() = listOf(
            HomeScreenSpec
        )
    }

    val route: String

    val arguments: List<NamedNavArgument> get() = emptyList()

    @Composable
    fun Content(
        navController: NavController,
        navBackStackEntry: NavBackStackEntry
    )
}

/**
 * ホームナビゲーション仕様
 */
object HomeScreenSpec : DemoNavScreenSpec {

    override val route = "home_screen"

    @Composable
    override fun Content(
        navController: NavController,
        navBackStackEntry: NavBackStackEntry
    ) {
        DemoScreen()
    }
}
