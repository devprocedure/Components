package com.devprocedure.catalog.ui.detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.composethemer.ProButtonThemes
import com.composethemer.ProCardThemes
import com.composethemer.ProElevatedCardThemes
import com.composethemer.ProExtendedFloatingActionButtonThemes
import com.composethemer.ProFloatingActionButtonThemes
import com.composethemer.ProIconThemes
import com.composethemer.ProLargeFloatingActionButtonThemes
import com.composethemer.ProOutlinedCardThemes
import com.composethemer.ProOutlinedTextFieldThemes
import com.composethemer.ProSmallFloatingActionButtonThemes
import com.composethemer.ProTextButtonThemes
import com.composethemer.ProTextFieldThemes
import com.devprocedure.catalog.ui.detail.base.button.button.ProButtonCatalog
import com.devprocedure.catalog.ui.detail.base.button.outlinedbutton.ProOutlinedButtonCatalog
import com.devprocedure.catalog.ui.detail.base.button.textbutton.ProTextButtonCatalog
import com.devprocedure.ui.catalog.catalogfilter.CatalogFilter
import com.devprocedure.ui.data.Components
import com.devprocedure.ui.util.getThemeList

/**
 * Created by emre bahadir on 10/9/2023
 */
@Composable
fun DetailScreen(
    componentName: String
) {
    val component = Components.getComponentByName(componentName)

    if (component == null) {
        error("Component not found")
    }

    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
        ) {
            var selectedTheme by remember {
                mutableStateOf(component.defaultThemeName)
            }

            CatalogFilter(
                title = "$componentName Themes",
                selectedTheme = selectedTheme,
                items = getThemeList(component),
                onThemeClick = {
                    selectedTheme = it
                }
            )

            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                when (component) {
                    Components.Button -> ProButtonCatalog(selectedTheme)
                    Components.OutlinedButton -> ProOutlinedButtonCatalog(selectedTheme)
                    Components.TextButton -> ProTextButtonCatalog(selectedTheme)
                    Components.Card -> TODO()
                    Components.ElevatedCard -> TODO()
                    Components.OutlinedCard -> TODO()
                    Components.FloatingActionButton -> TODO()
                    Components.LargeFloatingActionButton -> TODO()
                    Components.SmallFloatingActionButton -> TODO()
                    Components.ExtendedFloatingActionButton -> TODO()
                    Components.Icon -> TODO()
                    Components.TextField -> TODO()
                    Components.OutlinedTextField -> TODO()
                }
            }
        }
    }
}

private fun getThemeList(component: Components) = when (component) {
    Components.Button -> ProButtonThemes::class.getThemeList()
    Components.OutlinedButton -> ProTextButtonThemes::class.getThemeList()
    Components.TextButton -> ProTextButtonThemes::class.getThemeList()
    Components.Card -> ProCardThemes::class.getThemeList()
    Components.ElevatedCard -> ProElevatedCardThemes::class.getThemeList()
    Components.OutlinedCard -> ProOutlinedCardThemes::class.getThemeList()
    Components.FloatingActionButton -> ProFloatingActionButtonThemes::class.getThemeList()
    Components.LargeFloatingActionButton -> ProLargeFloatingActionButtonThemes::class.getThemeList()
    Components.SmallFloatingActionButton -> ProSmallFloatingActionButtonThemes::class.getThemeList()
    Components.ExtendedFloatingActionButton -> ProExtendedFloatingActionButtonThemes::class.getThemeList()
    Components.Icon -> ProIconThemes::class.getThemeList()
    Components.TextField -> ProTextFieldThemes::class.getThemeList()
    Components.OutlinedTextField -> ProOutlinedTextFieldThemes::class.getThemeList()
}
