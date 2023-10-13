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
import com.devprocedure.catalog.ui.detail.base.card.card.ProCardCatalog
import com.devprocedure.catalog.ui.detail.base.card.elevatedcard.ProElevatedCardCatalog
import com.devprocedure.catalog.ui.detail.base.card.outlinedcard.ProOutlinedCardCatalog
import com.devprocedure.catalog.ui.detail.base.floatingactionbutton.extendedfloatingactionbutton.ProExtendedFloatingActionButtonCatalog
import com.devprocedure.catalog.ui.detail.base.floatingactionbutton.floatingactionbutton.ProFloatingActionButtonCatalog
import com.devprocedure.catalog.ui.detail.base.floatingactionbutton.largefloatingactionbutton.ProLargeFloatingActionButtonCatalog
import com.devprocedure.catalog.ui.detail.base.floatingactionbutton.smallfloatingactionbutton.ProSmallFloatingActionButtonCatalog
import com.devprocedure.catalog.ui.detail.base.icon.icon.ProIconCatalog
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
                    Components.Card -> ProCardCatalog(selectedTheme)
                    Components.ElevatedCard -> ProElevatedCardCatalog(selectedTheme)
                    Components.OutlinedCard -> ProOutlinedCardCatalog(selectedTheme)
                    Components.FloatingActionButton -> ProFloatingActionButtonCatalog(selectedTheme)
                    Components.LargeFloatingActionButton -> ProLargeFloatingActionButtonCatalog(selectedTheme)
                    Components.SmallFloatingActionButton -> ProSmallFloatingActionButtonCatalog(selectedTheme)
                    Components.ExtendedFloatingActionButton -> ProExtendedFloatingActionButtonCatalog(selectedTheme)
                    Components.Icon -> ProIconCatalog(selectedTheme)
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
