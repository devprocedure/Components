package com.devprocedure.catalog.ui.detail.base.iconbutton.filledtonalicontogglebutton

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.composethemer.ProFilledTonalIconToggleButtonThemes
import com.devprocedure.ui.base.iconbutton.filledtonalicontogglebutton.ProFilledTonalIconToggleButton
import com.devprocedure.ui.catalog.catalogitem.CatalogItem
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.getThemeByName

/**
 * Created by emre bahadir on 10/13/2023
 */
internal fun LazyListScope.ProFilledTonalIconToggleButtonCatalog(themeName: String) {
    item {
        val themeType = ProFilledTonalIconToggleButtonThemes::class.getThemeByName(themeName)

        var checked by remember { mutableStateOf(false) }
        CatalogItem(
            title = "ProFilledTonalIconToggleButton",
            hasDivider = false
        ) {
            ProFilledTonalIconToggleButton(
                checked = checked,
                onCheckedChange = {
                    checked = it
                },
                icon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                theme = themeType.theme
            )

            ProFilledTonalIconToggleButton(
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