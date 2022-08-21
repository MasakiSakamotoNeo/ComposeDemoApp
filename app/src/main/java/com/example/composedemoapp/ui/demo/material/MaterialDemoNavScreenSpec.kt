package com.example.composedemoapp.ui.demo.material

import androidx.compose.runtime.Composable
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import com.example.composedemoapp.ui.demo.material.alertdialog.AlertDialogScreen
import com.example.composedemoapp.ui.home.MaterialDemoScreenSpec

sealed interface MaterialDemoNavScreenSpec {

    companion object {
        fun getAllMaterialDemoNavScreenSpec() = listOf(
            AlertDialogScreenSpec
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
 * Material Demo Top画面ナビゲーション仕様
 */
object MaterialDemoTopScreenSpec : MaterialDemoNavScreenSpec {

    override val title = ""

    override val route = "material_demo_top_screen"

    override fun requestNavigationRoute() = route

    @Composable
    override fun Content(
        navController: NavController,
        navBackStackEntry: NavBackStackEntry
    ) {
        MaterialDemoScreen(navController)
    }
}

/**
 * AlertDialog画面ナビゲーション仕様
 */
object AlertDialogScreenSpec : MaterialDemoNavScreenSpec {

    override val title = "Alert Dialog Demo"

    override val route = "material_alert_dialog_screen"

    override fun requestNavigationRoute() = route

    @Composable
    override fun Content(
        navController: NavController,
        navBackStackEntry: NavBackStackEntry
    ) {
        AlertDialogScreen()
    }
}

/**
 * Button画面ナビゲーション仕様
 */
object ButtonScreenSpec : MaterialDemoNavScreenSpec {

    override val title = "Button Demo"

    override val route = "material_button_screen"

    override fun requestNavigationRoute() = route

    @Composable
    override fun Content(
        navController: NavController,
        navBackStackEntry: NavBackStackEntry
    ) {
        // TODO: 
    }
}
