package com.devprocedure.catalog.ui.detail.base.topappbar.centertopappbar

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import com.composethemer.ProCenterTopAppBarThemes
import com.devprocedure.ui.base.topappbar.centertopappbar.ProCenterTopAppBar
import com.devprocedure.ui.catalog.catalogitem.CatalogItem
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.getThemeByName

/**
 * Created by emre bahadir on 10/16/2023
 */
@OptIn(ExperimentalMaterial3Api::class)
internal fun LazyListScope.ProCenterTopAppBarCatalog(themeName: String) {
    item {
        val themeType = ProCenterTopAppBarThemes::class.getThemeByName(themeName)

        CatalogItem(
            title = "ProCenterTopAppBar"
        ) {
            ProCenterTopAppBar(
                title = "ProCenterTopAppBar",
                theme = themeType.theme
            )
        }

        CatalogItem(
            title = "ProCenterTopAppBar with navigation icon"
        ) {
            ProCenterTopAppBar(
                title = "ProCenterTopAppBar",
                navigationIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                theme = themeType.theme
            )
        }

        CatalogItem(
            title = "ProCenterTopAppBar with actions"
        ) {
            ProCenterTopAppBar(
                title = "ProCenterTopAppBar",
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
            title = "ProCenterTopAppBar with navigation icon and actions",
            hasDivider = false
        ) {
            ProCenterTopAppBar(
                title = "ProCenterTopAppBar",
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
