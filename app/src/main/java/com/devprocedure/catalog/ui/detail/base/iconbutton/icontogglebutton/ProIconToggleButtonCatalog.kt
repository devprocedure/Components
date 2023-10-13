package com.devprocedure.catalog.ui.detail.base.iconbutton.icontogglebutton

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.composethemer.ProIconToggleButtonThemes
import com.devprocedure.ui.base.iconbutton.icontogglebutton.ProIconToggleButton
import com.devprocedure.ui.catalog.catalogitem.CatalogItem
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.getThemeByName

/**
 * Created by emre bahadir on 10/13/2023
 */
internal fun LazyListScope.ProIconToggleButtonCatalog(themeName: String) {
    item {
        val themeType = ProIconToggleButtonThemes::class.getThemeByName(themeName)

        var checked by remember { mutableStateOf(false) }
        CatalogItem(
            title = "ProIconToggleButton",
            hasDivider = false
        ) {
            ProIconToggleButton(
                checked = checked,
                onCheckedChange = {
                    checked = it
                },
                icon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                theme = themeType.theme
            )

            ProIconToggleButton(
                checked = checked,
                onCheckedChange = {},
                icon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                enabled = false,
                theme = themeType.theme
            )
        }
    }
}