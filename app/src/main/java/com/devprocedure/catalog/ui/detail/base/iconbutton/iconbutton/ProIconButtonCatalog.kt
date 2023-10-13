package com.devprocedure.catalog.ui.detail.base.iconbutton.iconbutton

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import com.composethemer.ProIconButtonThemes
import com.devprocedure.ui.base.iconbutton.iconbutton.ProIconButton
import com.devprocedure.ui.catalog.catalogitem.CatalogItem
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.getThemeByName

/**
 * Created by emre bahadir on 10/13/2023
 */
internal fun LazyListScope.ProIconButtonCatalog(themeName: String) {
    item {
        val themeType = ProIconButtonThemes::class.getThemeByName(themeName)

        CatalogItem(
            title = "ProIconButton",
            hasDivider = false
        ) {
            ProIconButton(
                onClick = {},
                icon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                theme = themeType.theme
            )

            ProIconButton(
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
