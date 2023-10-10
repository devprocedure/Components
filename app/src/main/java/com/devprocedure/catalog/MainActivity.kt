package com.devprocedure.catalog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.devprocedure.catalog.ui.catalog.CatalogScreen
import com.devprocedure.catalog.ui.detail.DetailScreen
import com.devprocedure.catalog.util.Screens
import com.devprocedure.designsystem.theme.CatalogTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CatalogTheme(
                dynamicColor = false
            ) {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Screens.Catalog.route
                    ) {
                        composable(Screens.Catalog.route) {
                            CatalogScreen(navController)
                        }

                        composable(
                            route = Screens.Detail.route +
                                "?componentName={componentName}",
                            arguments = listOf(
                                navArgument("componentName") {
                                    type = NavType.StringType
                                }
                            )
                        ) {
                            val componentName = it.arguments?.getString("componentName")
                            DetailScreen(
                                componentName = componentName.orEmpty()
                            )
                        }
                    }
                }
            }
        }
    }
}
