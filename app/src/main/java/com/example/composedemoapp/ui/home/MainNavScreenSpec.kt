package com.example.composedemoapp.ui.home

import androidx.compose.runtime.Composable
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import com.example.composedemoapp.ui.demo.material.MaterialDemoCompose

sealed interface MainNavScreenSpec {

    companion object {
        fun getAllDemoNavScreenSpec() = listOf(
            MaterialDemoScreenSpec
        )
    }

    val title: String

    val route: String

    val arguments: List<NamedNavArgument> get() = emptyList()

    fun requestNavigationRoute(): String

    @Composable
    fun Content(
        navController: NavController,
        navBackStackEntry: NavBackStackEntry
    )
}

/**
 * ホーム画面ナビゲーション仕様
 */
object HomeNavScreenSpec : MainNavScreenSpec {

    override val title = ""

    override val route = "home_screen"

    override fun requestNavigationRoute() = route

    @Composable
    override fun Content(
        navController: NavController,
        navBackStackEntry: NavBackStackEntry
    ) {
        DemoScreen(navController = navController)
    }
}

/**
 * Material Demoナビゲーション仕様
 */
object MaterialDemoScreenSpec : MainNavScreenSpec {

    override val title = "Material Demo"

    override val route = "material_demo_screen"

    override fun requestNavigationRoute() = route

    @Composable
    override fun Content(
        navController: NavController,
        navBackStackEntry: NavBackStackEntry
    ) {
        MaterialDemoCompose()
    }
}
