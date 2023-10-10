package com.devprocedure.ui.catalog.cataloglistitem

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.composethemer.CatalogListItemThemes
import com.devprocedure.designsystem.theme.CatalogTheme
import com.devprocedure.ui.base.card.card.ProCard
import com.devprocedure.ui.base.card.elevatedcard.ProElevatedCard
import com.devprocedure.ui.base.icon.icon.ProIcon
import com.devprocedure.ui.base.text.ProText
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.UiThemePreview

/**
 * Created by emre bahadir on 10/9/2023
 */
@Composable
fun CatalogListItem(
    title: String,
    shortName: String,
    onClick: () -> Unit,
    theme: CatalogListItemTheme = CatalogListItemThemes.Default.theme
) {
    ProElevatedCard(
        modifier = Modifier
            .fillMaxWidth(),
        onClick = onClick
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier
                    .fillMaxWidth(0.9f)
            ) {
                ProCard(
                    modifier = Modifier
                        .size(theme.shortNameSize().value)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        ProText(
                            text = shortName,
                            style = theme.shortNameStyle().value
                        )
                    }
                }

                ProText(
                    modifier = Modifier,
                    text = title,
                    style = theme.titleStyle().value
                )
            }

            ProIcon(
                imageVector = ProImageVector(
                    imageVector = Icons.AutoMirrored.Rounded.KeyboardArrowRight
                )
            )
        }
    }
}

@UiThemePreview
@Composable
fun CatalogListItemPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        CatalogListItem(
            title = "Title",
            shortName = "T",
            onClick = {}
        )
    }
}
