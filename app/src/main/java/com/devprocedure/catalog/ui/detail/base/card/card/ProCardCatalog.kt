package com.devprocedure.catalog.ui.detail.base.card.card

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.composethemer.ProCardThemes
import com.devprocedure.ui.base.card.card.ProCard
import com.devprocedure.ui.base.text.ProText
import com.devprocedure.ui.catalog.catalogitem.CatalogItem
import com.devprocedure.ui.util.getThemeByName

/**
 * Created by emre bahadir on 10/13/2023
 */
internal fun LazyListScope.ProCardCatalog(themeName: String) {
    item {
        val themeType = ProCardThemes::class.getThemeByName(themeName)

        CatalogItem(
            title = "ProCard"
        ) {
            ProCard(
                onClick = {},
                theme = themeType.theme
            ) {
                ProText(
                    modifier = Modifier
                        .padding(16.dp),
                    text = "ProCard"
                )
            }
        }

        CatalogItem(
            title = "ProCard Clickable",
            hasDivider = false
        ) {
            ProCard(
                onClick = {},
                theme = themeType.theme
            ) {
                ProText(
                    modifier = Modifier
                        .padding(16.dp),
                    text = "ProCard"
                )
            }

            ProCard(
                onClick = {},
                enabled = false,
                theme = themeType.theme
            ) {
                ProText(
                    modifier = Modifier
                        .padding(16.dp),
                    text = "ProCard"
                )
            }
        }
    }
}
