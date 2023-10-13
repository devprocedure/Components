package com.devprocedure.catalog.ui.detail.base.floatingactionbutton.floatingactionbutton

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import com.composethemer.ProFloatingActionButtonThemes
import com.devprocedure.ui.base.floatingactionbutton.floatingactionbutton.ProFloatingActionButton
import com.devprocedure.ui.catalog.catalogitem.CatalogItem
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.getThemeByName

/**
 * Created by emre bahadir on 10/13/2023
 */
internal fun LazyListScope.ProFloatingActionButtonCatalog(themeName: String) {
    item {
        val themeType = ProFloatingActionButtonThemes::class.getThemeByName(themeName)

        CatalogItem(
            title = "ProFloatingActionButton",
            hasDivider = false
        ) {
            ProFloatingActionButton(
                icon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                onClick = {},
                theme = themeType.theme
            )
        }
    }
}
