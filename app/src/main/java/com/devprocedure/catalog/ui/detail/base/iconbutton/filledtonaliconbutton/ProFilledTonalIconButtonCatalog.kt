package com.devprocedure.catalog.ui.detail.base.iconbutton.filledtonaliconbutton

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import com.composethemer.ProFilledTonalIconButtonThemes
import com.devprocedure.ui.base.iconbutton.filledtonaliconbutton.ProFilledTonalIconButton
import com.devprocedure.ui.catalog.catalogitem.CatalogItem
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.getThemeByName

/**
 * Created by emre bahadir on 10/13/2023
 */
internal fun LazyListScope.ProFilledTonalIconButtonCatalog(themeName: String) {
    item {
        val themeType = ProFilledTonalIconButtonThemes::class.getThemeByName(themeName)

        CatalogItem(
            title = "ProFilledTonalIconButton",
            hasDivider = false
        ) {
            ProFilledTonalIconButton(
                onClick = {},
                icon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                theme = themeType.theme
            )

            ProFilledTonalIconButton(
                onClick = {},
                icon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                enabled = false,
                theme = themeType.theme
            )
        }
    }
}