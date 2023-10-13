package com.devprocedure.catalog.ui.detail.base.iconbutton.fillediconbutton

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import com.composethemer.ProFilledIconButtonThemes
import com.devprocedure.ui.base.iconbutton.fillediconbutton.ProFilledIconButton
import com.devprocedure.ui.catalog.catalogitem.CatalogItem
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.getThemeByName

/**
 * Created by emre bahadir on 10/13/2023
 */
internal fun LazyListScope.ProFilledIconButtonCatalog(themeName: String) {
    item {
        val themeType = ProFilledIconButtonThemes::class.getThemeByName(themeName)

        CatalogItem(
            title = "ProFilledIconButton",
            hasDivider = false
        ) {
            ProFilledIconButton(
                onClick = {},
                icon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                theme = themeType.theme
            )

            ProFilledIconButton(
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