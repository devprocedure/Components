package com.devprocedure.catalog.ui.detail.base.button

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.composethemer.ProButtonThemes
import com.devprocedure.ui.base.button.button.ProButton
import com.devprocedure.ui.catalog.catalogfilter.CatalogFilter
import com.devprocedure.ui.catalog.catalogitem.CatalogItem
import com.devprocedure.ui.util.ProImageVector

/**
 * Created by emre bahadir on 10/10/2023
 */
internal fun LazyListScope.ProButtonCatalog() {
    item {
        var themeType by remember {
            mutableStateOf<ProButtonThemes>(ProButtonThemes.Primary)
        }

        CatalogFilter(
            title = "ProButton Themes",
            selectedTheme = themeType,
            onThemeClick = {
                themeType = it
            }
        )
        
        CatalogItem(
            title = "ProButton"
        ) {
            ProButton(
                text = "ProButton",
                onClick = {},
                theme = themeType.theme
            )

            ProButton(
                text = "ProButton",
                onClick = {},
                enabled = false,
                theme = themeType.theme
            )
        }

        CatalogItem(
            title = "ProButton with leading icon"
        ) {
            ProButton(
                text = "ProButton",
                onClick = {},
                leadingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add,
                ),
                theme = themeType.theme
            )

            ProButton(
                text = "ProButton",
                onClick = {},
                leadingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add,
                ),
                enabled = false,
                theme = themeType.theme
            )
        }

        CatalogItem(
            title = "ProButton with trailing icon"
        ) {
            ProButton(
                text = "ProButton",
                onClick = {},
                trailingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add,
                ),
                theme = themeType.theme
            )

            ProButton(
                text = "ProButton",
                onClick = {},
                trailingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add,
                ),
                enabled = false,
                theme = themeType.theme
            )
        }

        CatalogItem(
            title = "ProButton with leading and trailing icon"
        ) {
            ProButton(
                text = "ProButton",
                onClick = {},
                leadingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add,
                ),
                trailingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add,
                ),
                theme = themeType.theme
            )

            ProButton(
                text = "ProButton",
                onClick = {},
                leadingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add,
                ),
                trailingIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add,
                ),
                enabled = false,
                theme = themeType.theme
            )
        }
    }
}