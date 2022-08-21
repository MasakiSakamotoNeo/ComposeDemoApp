package com.example.composedemoapp.ui.demo.material

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composedemoapp.ui.home.AppBarIcons

@Composable
fun MaterialDemoCompose() {
    val navController = rememberNavController()

    MaterialDemoNavHost(navController)
}

@Composable
fun MaterialDemoNavHost(
    navController: NavHostController,
    startDestination: String = MaterialDemoTopScreenSpec.route
) {
    NavHost(navController = navController, startDestination = startDestination) {
        composable(
            route = MaterialDemoTopScreenSpec.route
        ) {
            MaterialDemoTopScreenSpec.Content(
                navController = navController,
                navBackStackEntry = it
            )
        }
        MaterialDemoNavScreenSpec.getAllMaterialDemoNavScreenSpec().forEach { spec ->
            composable(
                route = spec.route,
                arguments = spec.arguments
            ) {
                spec.Content(
                    navController = navController,
                    navBackStackEntry = it
                )
            }
        }
    }
}

@Composable
fun MaterialDemoScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Material Demo")
                },
                navigationIcon = { },
                actions = {
                    AppBarIcons.Back {
                        // TODO: クリック処理未実装
                    }
                }
            )
        }
    ) {
        MaterialDemoContent(navController)
    }
}

@Composable
@OptIn(ExperimentalMaterialApi::class)
fun MaterialDemoContent(navController: NavController? = null) {
    Column(Modifier.verticalScroll(rememberScrollState())) {
        MaterialDemoNavScreenSpec.getAllMaterialDemoNavScreenSpec().forEach { spec ->
            ListItem(
                text = {
                    Text(
                        modifier = Modifier
                            .height(56.dp)
                            .wrapContentSize(Alignment.Center),
                        text = spec.title
                    )
                },
                modifier = Modifier.clickable {
                    navController?.navigate(spec.requestNavigationRoute())
                }
            )
            Divider()
        }
    }
}