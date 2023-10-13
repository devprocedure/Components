package com.devprocedure.ui.catalog.catalogfilter

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material.icons.rounded.ExpandLess
import androidx.compose.material.icons.rounded.ExpandMore
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.unit.dp
import com.composethemer.CatalogFilterThemes
import com.devprocedure.designsystem.theme.CatalogTheme
import com.devprocedure.ui.base.dropdownmenu.dropdownmenuitem.DropdownMenuItem
import com.devprocedure.ui.base.exposeddropdownmenu.exposeddropdownmenu.ProExposedDropdownMenuBox
import com.devprocedure.ui.base.exposeddropdownmenu.exposeddropdownmenubox.ProExposedDropdownMenu
import com.devprocedure.ui.base.text.ProText
import com.devprocedure.ui.base.textfield.outlinedtextfield.ProOutlinedTextField
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.UiThemePreview

/**
 * Created by emre bahadir on 10/10/2023
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CatalogFilter(
    title: String,
    selectedTheme: String,
    items: List<String>,
    onThemeClick: (String) -> Unit,
    theme: CatalogFilterTheme = CatalogFilterThemes.Default.theme
) {
    var menuExpanded by remember {
        mutableStateOf(false)
    }

    var selectedThemeName by remember {
        mutableStateOf(selectedTheme)
    }

    val focusManager = LocalFocusManager.current

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
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
                value = selectedThemeName,
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
                    selectedThemeName = items.get(it)
                    menuExpanded = false
                    focusManager.clearFocus()
                    onThemeClick(selectedThemeName)
                },
                items = items.mapIndexed { index, themeName ->
                    DropdownMenuItem(
                        id = index,
                        text = themeName,
                        trailingIcon = if (themeName == selectedThemeName) ProImageVector(
                            imageVector = Icons.Rounded.Check
                        ) else null
                    )
                }
            )
        }
    }
}

@UiThemePreview
@Composable
fun CatalogFilterPreview() {
    CatalogTheme(
        darkTheme = false
    ) {
        Surface {
            CatalogFilter(
                title = "Button Themes",
                selectedTheme = "Default",
                items = listOf("Default", "Primary", "Secondary"),
                onThemeClick = {}
            )
        }
    }
}
