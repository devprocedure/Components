package com.devprocedure.catalog.ui.detail.base.button.filledtonalbutton

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import com.composethemer.ProFilledTonalButtonThemes
import com.devprocedure.ui.base.button.filledtonalbutton.ProFilledTonalButton
import com.devprocedure.ui.catalog.catalogitem.CatalogItem
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.getThemeByName

/**
 * Created by emre bahadir on 10/13/2023
 */
internal fun LazyListScope.ProFilledTonalButtonCatalog(themeName: String) {
    item {
        val themeType = ProFilledTonalButtonThemes::class.getThemeByName(themeName)

        CatalogItem(
            title = "ProFilledTonalButton"
        ) {
            ProFilledTonalButton(
                text = "ProFilledTonalButton",
                onClick = {},
                theme = themeType.theme
            )

            ProFilledTonalButton(
                text = "ProFilledTonalButton",
                onClick = {},
                enabled = false,
                theme = themeType.theme
            )
        }

        CatalogItem(
            title = "ProFilledTonalButton with leading icon"
        ) {
            ProFilledTonalButton(
                text = "ProFilledTonalButton",
                onClick = {},
                leadingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                theme = themeType.theme
            )

            ProFilledTonalButton(
                text = "ProFilledTonalButton",
                onClick = {},
                leadingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                enabled = false,
                theme = themeType.theme
            )
        }

        CatalogItem(
            title = "ProFilledTonalButton with trailing icon"
        ) {
            ProFilledTonalButton(
                text = "ProFilledTonalButton",
                onClick = {},
                trailingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                theme = themeType.theme
            )

            ProFilledTonalButton(
                text = "ProFilledTonalButton",
                onClick = {},
                trailingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                enabled = false,
                theme = themeType.theme
            )
        }

        CatalogItem(
            title = "ProFilledTonalButton with leading and trailing icon",
            hasDivider = false
        ) {
            ProFilledTonalButton(
                text = "ProFilledTonalButton",
                onClick = {},
                leadingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                trailingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                theme = themeType.theme
            )

            ProFilledTonalButton(
                text = "ProFilledTonalButton",
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