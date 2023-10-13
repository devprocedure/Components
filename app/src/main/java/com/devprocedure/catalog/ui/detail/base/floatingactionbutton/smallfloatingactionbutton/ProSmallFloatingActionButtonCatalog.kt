package com.devprocedure.catalog.ui.detail.base.floatingactionbutton.smallfloatingactionbutton

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import com.composethemer.ProSmallFloatingActionButtonThemes
import com.devprocedure.ui.base.floatingactionbutton.smallfloatingactionbutton.ProSmallFloatingActionButton
import com.devprocedure.ui.catalog.catalogitem.CatalogItem
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.getThemeByName

/**
 * Created by emre bahadir on 10/13/2023
 */
internal fun LazyListScope.ProSmallFloatingActionButtonCatalog(themeName: String) {
    item {
        val themeType = ProSmallFloatingActionButtonThemes::class.getThemeByName(themeName)

        CatalogItem(
            title = "ProSmallFloatingActionButton",
            hasDivider = false
        ) {
            ProSmallFloatingActionButton(
                icon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                onClick = {},
                theme = themeType.theme
            )
        }
    }
}
