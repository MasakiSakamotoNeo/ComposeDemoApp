package com.example.composedemoapp.ui.home

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composedemoapp.ui.theme.ComposeDemoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoAppTheme {
                Text(text = "Hello")
//                val navController = rememberNavController()
//
//                DemoNavHost(navController)
            }
        }
    }
}

@Composable
fun DemoNavHost(
    navController: NavHostController,
    startDestination: String = HomeScreenSpec.route
) {
    Text(text = "Hello")
//    NavHost(navController = navController, startDestination = startDestination) {
//        DemoNavScreenSpec.getAllDemoNavScreenSpec().forEach { spec ->
//            composable(
//                route = spec.route,
//                arguments = spec.arguments
//            ) {
//                spec.Content(
//                    navController = navController,
//                    navBackStackEntry = it
//                )
//            }
//        }
//    }
}

@Composable
fun DemoScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Jetpack Compose Demo")
                },
                navigationIcon = { },
                actions = {
                    AppBarIcons.Settings {
                        // TODO: クリック処理未実装
                    }
                }
            )
        }
    ) {
        DemoContent()
    }
}

@Composable
@OptIn(ExperimentalMaterialApi::class)
fun DemoContent() {
    Column(Modifier.verticalScroll(rememberScrollState())) {
        repeat(5) { // TODO:
            ListItem(
                text = {
                    Text(
                        modifier = Modifier
                            .height(56.dp)
                            .wrapContentSize(Alignment.Center),
                        text = "Sample"
                    )
                },
                modifier = Modifier.clickable {  }
            )
        }
    }
}

private object AppBarIcons {
    @Composable
    fun Back(onClick: () -> Unit) {
        val icon = when (LocalLayoutDirection.current) {
            LayoutDirection.Ltr -> Icons.Filled.ArrowBack
            LayoutDirection.Rtl -> Icons.Filled.ArrowForward
        }
        IconButton(onClick = onClick) {
            Icon(icon, null)
        }
    }

    @Composable
    fun Settings(onClick: () -> Unit) {
        IconButton(onClick = onClick) {
            Icon(Icons.Filled.Settings, null)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeDemoAppTheme {
        DemoContent()
    }
}
