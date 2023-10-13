package com.devprocedure.catalog.ui.detail.base.icon.icon

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import com.composethemer.ProIconThemes
import com.devprocedure.ui.base.icon.icon.ProIcon
import com.devprocedure.ui.catalog.catalogitem.CatalogItem
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.getThemeByName

/**
 * Created by emre bahadir on 10/13/2023
 */
internal fun LazyListScope.ProIconCatalog(themeName: String) {
    item {
        val themeType = ProIconThemes::class.getThemeByName(themeName)

        CatalogItem(
            title = "ProIcon",
            hasDivider = false
        ) {
            ProIcon(
                imageVector = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                theme = themeType.theme
            )
        }
    }
}
