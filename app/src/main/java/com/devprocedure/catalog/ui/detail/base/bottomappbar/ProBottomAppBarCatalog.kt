package com.devprocedure.catalog.ui.detail.base.bottomappbar

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material.icons.rounded.Edit
import androidx.compose.material3.ExperimentalMaterial3Api
import com.composethemer.ProBottomAppBarThemes
import com.devprocedure.ui.base.bottomappbar.bottomappbar.ProBottomAppBar
import com.devprocedure.ui.catalog.catalogitem.CatalogItem
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.getThemeByName

/**
 * Created by emre bahadir on 10/16/2023
 */
@OptIn(ExperimentalMaterial3Api::class)
internal fun LazyListScope.ProBottomAppBarCatalog(themeName: String) {
    item {
        val themeType = ProBottomAppBarThemes::class.getThemeByName(themeName)

        CatalogItem(
            title = "ProBottomAppBar"
        ) {
            ProBottomAppBar(
                actions = mapOf(
                    "action1" to ProImageVector(
                        imageVector = Icons.Rounded.Add
                    ),
                    "action2" to ProImageVector(
                        imageVector = Icons.Rounded.Edit
                    )
                ),
                theme = themeType.theme
            )
        }

        CatalogItem(
            title = "ProBottomAppBar with floating action button",
            hasDivider = false
        ) {
            ProBottomAppBar(
                actions = mapOf(
                    "action1" to ProImageVector(
                        imageVector = Icons.Rounded.Edit
                    ),
                    "action2" to ProImageVector(
                        imageVector = Icons.Rounded.Delete
                    )
                ),
                floatingActionButtonIcon = ProImageVector(
                    imageVector = Icons.Rounded.Add
                ),
                theme = themeType.theme
            )
        }
    }
}
