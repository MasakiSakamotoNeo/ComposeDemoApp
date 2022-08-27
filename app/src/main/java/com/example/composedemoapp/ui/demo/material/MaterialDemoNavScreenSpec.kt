package com.example.composedemoapp.ui.demo.material

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import com.example.composedemoapp.ui.demo.material.alertdialog.AlertDialogScreen
import com.example.composedemoapp.ui.demo.material.button.ButtonScreen
import com.example.composedemoapp.ui.demo.material.card.CardScreen
import com.example.composedemoapp.ui.demo.material.checkbox.CheckBoxScreen
import com.example.composedemoapp.ui.demo.material.circularprogress.CircularProgressIndicatorScreen
import com.example.composedemoapp.ui.home.MaterialDemoScreenSpec

sealed interface MaterialDemoNavScreenSpec {

    companion object {
        fun getAllMaterialDemoNavScreenSpec() = listOf(
            AlertDialogScreenSpec,
            ButtonScreenSpec,
            CardScreenSpec,
            CheckBoxScreenSpec,
            CircularProgressIndicatorScreenSpec
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
        ButtonScreen()
    }
}

/**
 * Card画面ナビゲーション仕様
 */
object CardScreenSpec : MaterialDemoNavScreenSpec {

    override val title = "Card Demo"

    override val route = "material_card_screen"

    override fun requestNavigationRoute() = route

    @Composable
    override fun Content(
        navController: NavController,
        navBackStackEntry: NavBackStackEntry
    ) {
        CardScreen()
    }
}

/**
 * CheckBox画面ナビゲーション仕様
 */
object CheckBoxScreenSpec : MaterialDemoNavScreenSpec {

    override val title = "CheckBox Demo"

    override val route = "material_checkbox_screen"

    override fun requestNavigationRoute() = route

    @Composable
    override fun Content(
        navController: NavController,
        navBackStackEntry: NavBackStackEntry
    ) {
        CheckBoxScreen()
    }
}

/**
 * CircularProgressIndicator画面ナビゲーション仕様
 */
object CircularProgressIndicatorScreenSpec : MaterialDemoNavScreenSpec {

    override val title = "CircularProgressIndicator Demo"

    override val route = "material_circular_progress_indicator_screen"

    override fun requestNavigationRoute() = route

    @Composable
    override fun Content(
        navController: NavController,
        navBackStackEntry: NavBackStackEntry
    ) {
        CircularProgressIndicatorScreen()
    }
}
