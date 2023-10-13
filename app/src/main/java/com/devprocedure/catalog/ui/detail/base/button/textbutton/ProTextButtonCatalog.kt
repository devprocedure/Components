package com.devprocedure.catalog.ui.detail.base.button.textbutton

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import com.composethemer.ProTextButtonThemes
import com.devprocedure.ui.base.button.textbutton.ProTextButton
import com.devprocedure.ui.catalog.catalogitem.CatalogItem
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.getThemeByName

/**
 * Created by emre bahadir on 10/10/2023
 */
internal fun LazyListScope.ProTextButtonCatalog(themeName: String) {
    item {
        val themeType = ProTextButtonThemes::class.getThemeByName(themeName)

        if (themeType == null) {
            error("Theme not found")
        }

        CatalogItem(
            title = "ProTextButton"
        ) {
            ProTextButton(
                text = "ProTextButton",
                onClick = {},
                theme = themeType.theme
            )

            ProTextButton(
                text = "ProTextButton",
                onClick = {},
                enabled = false,
                theme = themeType.theme
            )
        }

        CatalogItem(
            title = "ProTextButton with leading icon"
        ) {
            ProTextButton(
                text = "ProTextButton",
                onClick = {},
                leadingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                theme = themeType.theme
            )

            ProTextButton(
                text = "ProTextButton",
                onClick = {},
                leadingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                enabled = false,
                theme = themeType.theme
            )
        }

        CatalogItem(
            title = "ProTextButton with trailing icon"
        ) {
            ProTextButton(
                text = "ProTextButton",
                onClick = {},
                trailingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                theme = themeType.theme
            )

            ProTextButton(
                text = "ProTextButton",
                onClick = {},
                trailingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                enabled = false,
                theme = themeType.theme
            )
        }

        CatalogItem(
            title = "ProTextButton with leading and trailing icon",
            hasDivider = false
        ) {
            ProTextButton(
                text = "ProTextButton",
                onClick = {},
                leadingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                trailingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                theme = themeType.theme
            )

            ProTextButton(
                text = "ProTextButton",
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