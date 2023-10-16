package com.devprocedure.catalog.ui.detail.base.topappbar.mediumtopappbar

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import com.composethemer.ProMediumTopAppBarThemes
import com.devprocedure.ui.base.topappbar.mediumtopappbar.ProMediumTopAppBar
import com.devprocedure.ui.catalog.catalogitem.CatalogItem
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.getThemeByName

/**
 * Created by emre bahadir on 10/16/2023
 */
@OptIn(ExperimentalMaterial3Api::class)
internal fun LazyListScope.ProMediumTopAppBarCatalog(themeName: String) {
    item {
        val themeType = ProMediumTopAppBarThemes::class.getThemeByName(themeName)

        CatalogItem(
            title = "ProMediumTopAppBar"
        ) {
            ProMediumTopAppBar(
                title = "ProMediumTopAppBar",
                theme = themeType.theme
            )
        }

        CatalogItem(
            title = "ProMediumTopAppBar with navigation icon"
        ) {
            ProMediumTopAppBar(
                title = "ProMediumTopAppBar",
                navigationIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                theme = themeType.theme
            )
        }

        CatalogItem(
            title = "ProMediumTopAppBar with actions"
        ) {
            ProMediumTopAppBar(
                title = "ProMediumTopAppBar",
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
            title = "ProMediumTopAppBar with navigation icon and actions",
            hasDivider = false
        ) {
            ProMediumTopAppBar(
                title = "ProMediumTopAppBar",
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
