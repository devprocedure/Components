package com.devprocedure.catalog.ui.detail.base.floatingactionbutton.largefloatingactionbutton

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import com.composethemer.ProLargeFloatingActionButtonThemes
import com.devprocedure.ui.base.floatingactionbutton.largefloatingactionbutton.ProLargeFloatingActionButton
import com.devprocedure.ui.catalog.catalogitem.CatalogItem
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.getThemeByName

/**
 * Created by emre bahadir on 10/13/2023
 */
internal fun LazyListScope.ProLargeFloatingActionButtonCatalog(themeName: String) {
    item {
        val themeType = ProLargeFloatingActionButtonThemes::class.getThemeByName(themeName)

        CatalogItem(
            title = "ProLargeFloatingActionButton",
            hasDivider = false
        ) {
            ProLargeFloatingActionButton(
                icon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                onClick = {},
                theme = themeType.theme
            )
        }
    }
}
