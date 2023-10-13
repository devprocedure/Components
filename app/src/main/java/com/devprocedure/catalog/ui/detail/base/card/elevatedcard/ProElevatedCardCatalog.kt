package com.devprocedure.catalog.ui.detail.base.card.elevatedcard

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.composethemer.ProElevatedCardThemes
import com.devprocedure.ui.base.card.elevatedcard.ProElevatedCard
import com.devprocedure.ui.base.text.ProText
import com.devprocedure.ui.catalog.catalogitem.CatalogItem
import com.devprocedure.ui.util.getThemeByName

/**
 * Created by emre bahadir on 10/13/2023
 */
internal fun LazyListScope.ProElevatedCardCatalog(themeName: String) {
    item {
        val themeType = ProElevatedCardThemes::class.getThemeByName(themeName)

        CatalogItem(
            title = "ProElevatedCard"
        ) {
            ProElevatedCard(
                theme = themeType.theme
            ) {
                ProText(
                    modifier = Modifier
                        .padding(16.dp),
                    text = "ProElevatedCard"
                )
            }
        }

        CatalogItem(
            title = "ProElevatedCard Clickable",
            hasDivider = false
        ) {
            ProElevatedCard(
                onClick = {},
                theme = themeType.theme
            ) {
                ProText(
                    modifier = Modifier
                        .padding(16.dp),
                    text = "ProElevatedCard"
                )
            }

            ProElevatedCard(
                onClick = {},
                enabled = false,
                theme = themeType.theme
            ) {
                ProText(
                    modifier = Modifier
                        .padding(16.dp),
                    text = "ProElevatedCard"
                )
            }
        }
    }
}
