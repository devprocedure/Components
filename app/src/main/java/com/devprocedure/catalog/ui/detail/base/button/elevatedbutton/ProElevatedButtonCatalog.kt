package com.devprocedure.catalog.ui.detail.base.button.elevatedbutton

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import com.composethemer.ProElevatedButtonThemes
import com.devprocedure.ui.base.button.elevatedbutton.ProElevatedButton
import com.devprocedure.ui.catalog.catalogitem.CatalogItem
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.getThemeByName

/**
 * Created by emre bahadir on 10/13/2023
 */
internal fun LazyListScope.ProElevatedButtonCatalog(themeName: String) {
    item {
        val themeType = ProElevatedButtonThemes::class.getThemeByName(themeName)

        CatalogItem(
            title = "ProElevatedButton"
        ) {
            ProElevatedButton(
                text = "ProElevatedButton",
                onClick = {},
                theme = themeType.theme
            )

            ProElevatedButton(
                text = "ProElevatedButton",
                onClick = {},
                enabled = false,
                theme = themeType.theme
            )
        }

        CatalogItem(
            title = "ProElevatedButton with leading icon"
        ) {
            ProElevatedButton(
                text = "ProElevatedButton",
                onClick = {},
                leadingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                theme = themeType.theme
            )

            ProElevatedButton(
                text = "ProElevatedButton",
                onClick = {},
                leadingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                enabled = false,
                theme = themeType.theme
            )
        }

        CatalogItem(
            title = "ProElevatedButton with trailing icon"
        ) {
            ProElevatedButton(
                text = "ProElevatedButton",
                onClick = {},
                trailingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                theme = themeType.theme
            )

            ProElevatedButton(
                text = "ProElevatedButton",
                onClick = {},
                trailingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                enabled = false,
                theme = themeType.theme
            )
        }

        CatalogItem(
            title = "ProElevatedButton with leading and trailing icon",
            hasDivider = false
        ) {
            ProElevatedButton(
                text = "ProElevatedButton",
                onClick = {},
                leadingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                trailingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                theme = themeType.theme
            )

            ProElevatedButton(
                text = "ProElevatedButton",
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
