package com.devprocedure.catalog.ui.detail.base.iconbutton.outlinediconbutton

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import com.composethemer.ProOutlinedIconButtonThemes
import com.devprocedure.ui.base.iconbutton.outlinediconbutton.ProOutlinedIconButton
import com.devprocedure.ui.catalog.catalogitem.CatalogItem
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.getThemeByName

/**
 * Created by emre bahadir on 10/13/2023
 */
internal fun LazyListScope.ProOutlinedIconButtonCatalog(themeName: String) {
    item {
        val themeType = ProOutlinedIconButtonThemes::class.getThemeByName(themeName)

        CatalogItem(
            title = "ProOutlinedIconButton",
            hasDivider = false
        ) {
            ProOutlinedIconButton(
                onClick = {},
                icon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                theme = themeType.theme
            )

            ProOutlinedIconButton(
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
