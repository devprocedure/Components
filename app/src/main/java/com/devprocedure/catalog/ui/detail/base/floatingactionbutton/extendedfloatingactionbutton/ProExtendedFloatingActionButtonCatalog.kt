package com.devprocedure.catalog.ui.detail.base.floatingactionbutton.extendedfloatingactionbutton

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import com.composethemer.ProExtendedFloatingActionButtonThemes
import com.devprocedure.ui.base.floatingactionbutton.extendedfloatingactionbutton.ProExtendedFloatingActionButton
import com.devprocedure.ui.catalog.catalogitem.CatalogItem
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.getThemeByName

/**
 * Created by emre bahadir on 10/13/2023
 */
internal fun LazyListScope.ProExtendedFloatingActionButtonCatalog(themeName: String) {
    item {
        val themeType = ProExtendedFloatingActionButtonThemes::class.getThemeByName(themeName)

        CatalogItem(
            title = "ProExtendedFloatingActionButton",
            hasDivider = false
        ) {
            ProExtendedFloatingActionButton(
                text = "ProExtendedFloatingActionButton",
                icon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                onClick = {},
                theme = themeType.theme
            )

            ProExtendedFloatingActionButton(
                text = "ProExtendedFloatingActionButton",
                icon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                onClick = {},
                expanded = false,
                theme = themeType.theme
            )
        }
    }
}
