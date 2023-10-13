package com.devprocedure.catalog.ui.catalog

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.devprocedure.catalog.util.Screens
import com.devprocedure.designsystem.theme.CatalogTheme
import com.devprocedure.ui.catalog.cataloglistitem.CatalogListItem
import com.devprocedure.ui.data.Components
import com.devprocedure.ui.util.UiThemePreview

/**
 * Created by emre bahadir on 10/9/2023
 */
@Composable
fun CatalogScreen(
    navController: NavController
) {
    Scaffold { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(Components.values()) { component ->
                CatalogListItem(
                    title = component.componentName,
                    shortName = component.componentGroup.shortName,
                    onClick = {
                        navController.navigate("${Screens.Detail.route}?componentName=${component.componentName}")
                    }
                )
            }
        }
    }
}

@UiThemePreview
@Composable
fun CatalogScreenPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        CatalogScreen(navController = rememberNavController())
    }
}
