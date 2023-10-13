package com.devprocedure.catalog.ui.detail.base.button.outlinedbutton

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import com.composethemer.ProOutlinedButtonThemes
import com.devprocedure.ui.base.button.outlinedbutton.ProOutlinedButton
import com.devprocedure.ui.catalog.catalogitem.CatalogItem
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.getThemeByName

/**
 * Created by emre bahadir on 10/10/2023
 */
internal fun LazyListScope.ProOutlinedButtonCatalog(themeName: String) {
    item {
        val themeType = ProOutlinedButtonThemes::class.getThemeByName(themeName)

        if (themeType == null) {
            error("Theme not found")
        }

        CatalogItem(
            title = "ProOutlinedButton"
        ) {
            ProOutlinedButton(
                text = "ProOutlinedButton",
                onClick = {},
                theme = themeType.theme
            )

            ProOutlinedButton(
                text = "ProOutlinedButton",
                onClick = {},
                enabled = false,
                theme = themeType.theme
            )
        }

        CatalogItem(
            title = "ProOutlinedButton with leading icon"
        ) {
            ProOutlinedButton(
                text = "ProOutlinedButton",
                onClick = {},
                leadingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                theme = themeType.theme
            )

            ProOutlinedButton(
                text = "ProOutlinedButton",
                onClick = {},
                leadingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                enabled = false,
                theme = themeType.theme
            )
        }

        CatalogItem(
            title = "ProOutlinedButton with trailing icon"
        ) {
            ProOutlinedButton(
                text = "ProOutlinedButton",
                onClick = {},
                trailingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                theme = themeType.theme
            )

            ProOutlinedButton(
                text = "ProOutlinedButton",
                onClick = {},
                trailingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                enabled = false,
                theme = themeType.theme
            )
        }

        CatalogItem(
            title = "ProOutlinedButton with leading and trailing icon",
            hasDivider = false
        ) {
            ProOutlinedButton(
                text = "ProOutlinedButton",
                onClick = {},
                leadingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                trailingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                theme = themeType.theme
            )

            ProOutlinedButton(
                text = "ProOutlinedButton",
                onClick = {},
                leadingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                trailingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                enabled = false,
                theme = themeType.theme
            )
        }
    }
}