package com.devprocedure.catalog.ui.detail.base.topappbar.largetopappbar

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import com.composethemer.ProLargeTopAppBarThemes
import com.devprocedure.ui.base.topappbar.largetopappbar.ProLargeTopAppBar
import com.devprocedure.ui.catalog.catalogitem.CatalogItem
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.getThemeByName

/**
 * Created by emre bahadir on 10/16/2023
 */
@OptIn(ExperimentalMaterial3Api::class)
internal fun LazyListScope.ProLargeTopAppBarCatalog(themeName: String) {
    item {
        val themeType = ProLargeTopAppBarThemes::class.getThemeByName(themeName)

        CatalogItem(
            title = "ProLargeTopAppBar"
        ) {
            ProLargeTopAppBar(
                title = "ProLargeTopAppBar",
                theme = themeType.theme
            )
        }

        CatalogItem(
            title = "ProLargeTopAppBar with navigation icon"
        ) {
            ProLargeTopAppBar(
                title = "ProLargeTopAppBar",
                navigationIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                theme = themeType.theme
            )
        }

        CatalogItem(
            title = "ProLargeTopAppBar with actions"
        ) {
            ProLargeTopAppBar(
                title = "ProLargeTopAppBar",
                actions = mapOf(
                    "action1" to ProImageVector(
                        imageVector = Icons.Rounded.Add
                    ),
                    "action2" to ProImageVector(
                        imageVector = Icons.Rounded.MoreVert
                    )
                ),
                theme = themeType.theme
            )
        }

        CatalogItem(
            title = "ProLargeTopAppBar with navigation icon and actions",
            hasDivider = false
        ) {
            ProLargeTopAppBar(
                title = "ProLargeTopAppBar",
                navigationIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                actions = mapOf(
                    "action1" to ProImageVector(
                        imageVector = Icons.Rounded.Add
                    ),
                    "action2" to ProImageVector(
                        imageVector = Icons.Rounded.MoreVert
                    )
                ),
                theme = themeType.theme
            )
        }
    }
}
