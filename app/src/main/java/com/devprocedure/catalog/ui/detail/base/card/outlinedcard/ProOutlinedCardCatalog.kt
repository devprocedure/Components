package com.devprocedure.catalog.ui.detail.base.card.outlinedcard

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.composethemer.ProOutlinedCardThemes
import com.devprocedure.ui.base.card.outlinedcard.ProOutlinedCard
import com.devprocedure.ui.base.text.ProText
import com.devprocedure.ui.catalog.catalogitem.CatalogItem
import com.devprocedure.ui.util.getThemeByName

/**
 * Created by emre bahadir on 10/13/2023
 */
internal fun LazyListScope.ProOutlinedCardCatalog(themeName: String) {
    item {
        val themeType = ProOutlinedCardThemes::class.getThemeByName(themeName)

        CatalogItem(
            title = "ProOutlinedCard"
        ) {
            ProOutlinedCard(
                theme = themeType.theme
            ) {
                ProText(
                    modifier = Modifier
                        .padding(16.dp),
                    text = "ProOutlinedCard"
                )
            }
        }

        CatalogItem(
            title = "ProOutlinedCard clickable",
            hasDivider = false
        ) {
            ProOutlinedCard(
                onClick = {},
                theme = themeType.theme
            ) {
                ProText(
                    modifier = Modifier
                        .padding(16.dp),
                    text = "ProOutlinedCard"
                )
            }

            ProOutlinedCard(
                onClick = {},
                enabled = false,
                theme = themeType.theme
            ) {
                ProText(
                    modifier = Modifier
                        .padding(16.dp),
                    text = "ProOutlinedCard"
                )
            }
        }
    }
}
