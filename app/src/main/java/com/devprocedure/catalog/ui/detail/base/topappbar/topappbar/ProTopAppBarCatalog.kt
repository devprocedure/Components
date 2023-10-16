package com.devprocedure.catalog.ui.detail.base.topappbar.topappbar

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import com.composethemer.ProTopAppBarThemes
import com.devprocedure.ui.base.topappbar.topappbar.ProTopAppBar
import com.devprocedure.ui.catalog.catalogitem.CatalogItem
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.getThemeByName

/**
 * Created by emre bahadir on 10/16/2023
 */
@OptIn(ExperimentalMaterial3Api::class)
internal fun LazyListScope.ProTopAppBarCatalog(themeName: String) {
    item {
        val themeType = ProTopAppBarThemes::class.getThemeByName(themeName)

        CatalogItem(
            title = "ProTopAppBar"
        ) {
            ProTopAppBar(
                title = "ProTopAppBar",
                theme = themeType.theme
            )
        }

        CatalogItem(
            title = "ProTopAppBar with navigation icon"
        ) {
            ProTopAppBar(
                title = "ProTopAppBar",
                navigationIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                theme = themeType.theme
            )
        }

        CatalogItem(
            title = "ProTopAppBar with actions"
        ) {
            ProTopAppBar(
                title = "ProTopAppBar",
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
            title = "ProTopAppBar with navigation icon and actions",
            hasDivider = false
        ) {
            ProTopAppBar(
                title = "ProTopAppBar",
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
