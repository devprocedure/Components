package com.devprocedure.ui.catalog.catalogfilter

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material.icons.rounded.ExpandLess
import androidx.compose.material.icons.rounded.ExpandMore
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.unit.dp
import com.composethemer.CatalogFilterThemes
import com.devprocedure.ui.base.dropdownmenu.dropdownmenuitem.DropdownMenuItem
import com.devprocedure.ui.base.exposeddropdownmenu.exposeddropdownmenu.ProExposedDropdownMenuBox
import com.devprocedure.ui.base.exposeddropdownmenu.exposeddropdownmenubox.ProExposedDropdownMenu
import com.devprocedure.ui.base.text.ProText
import com.devprocedure.ui.base.textfield.outlinedtextfield.ProOutlinedTextField
import com.devprocedure.ui.util.ProImageVector

/**
 * Created by emre bahadir on 10/10/2023
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
inline fun <reified THEME> CatalogFilter(
    title: String,
    selectedTheme: THEME,
    crossinline onThemeClick: (THEME) -> Unit,
    theme: CatalogFilterTheme = CatalogFilterThemes.Default.theme
) {
    var selectedIndex by remember {
        mutableIntStateOf(THEME::class.sealedSubclasses.indexOfFirst { it.objectInstance == selectedTheme })
    }

    var menuExpanded by remember {
        mutableStateOf(false)
    }

    var selectedThemeName by remember {
        mutableStateOf((THEME::class.sealedSubclasses[selectedIndex].objectInstance as THEME))
    }

    var focusManager = LocalFocusManager.current

    Column(
        modifier = Modifier
            .padding(PaddingValues(bottom = 16.dp)),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        ProText(
            text = title,
            style = theme.titleStyle().value
        )

        ProExposedDropdownMenuBox(
            expanded = menuExpanded,
            onExpandedChange = {
                menuExpanded = !menuExpanded
            }
        ) {
            ProOutlinedTextField(
                modifier = Modifier
                    .menuAnchor(),
                value = selectedThemeName?.let {
                    it::class.simpleName.orEmpty()
                } ?: "",
                onValueChange = {},
                readOnly = true,
                trailingIcon = ProImageVector(
                    imageVector = if (!menuExpanded) Icons.Rounded.ExpandMore else Icons.Rounded.ExpandLess
                ),
                theme = theme.textFieldTheme().value
            )

            ProExposedDropdownMenu(
                expanded = menuExpanded,
                onDismissRequest = {
                    menuExpanded = false
                    focusManager.clearFocus()
                },
                onItemClicked = {
                    selectedIndex = it
                    selectedThemeName = THEME::class.sealedSubclasses[selectedIndex].objectInstance as THEME
                    menuExpanded = false
                    focusManager.clearFocus()
                    onThemeClick(selectedThemeName)
                },
                items = THEME::class.sealedSubclasses.mapIndexed { index, themeClass ->
                    DropdownMenuItem(
                        id = index,
                        text = themeClass?.objectInstance?.let {
                            it::class.simpleName.orEmpty()
                        } ?: "",
                        trailingIcon = if (index == selectedIndex) ProImageVector(
                            imageVector = Icons.Rounded.Check
                        ) else null
                    )
                }
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        HorizontalDivider()
    }
}
