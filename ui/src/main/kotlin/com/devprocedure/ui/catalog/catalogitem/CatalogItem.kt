package com.devprocedure.ui.catalog.catalogitem

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.composethemer.CatalogItemThemes
import com.devprocedure.designsystem.theme.CatalogTheme
import com.devprocedure.ui.base.button.button.ProButton
import com.devprocedure.ui.base.text.ProText
import com.devprocedure.ui.util.UiThemePreview

/**
 * Created by emre bahadir on 10/10/2023
 */
@Composable
fun CatalogItem(
    title: String,
    theme: CatalogItemTheme = CatalogItemThemes.Default.theme,
    content: @Composable ColumnScope.() -> Unit
) {
    Column(
        horizontalAlignment = Alignment.Start
    ) {
        ProText(
            text = title,
            style = theme.titleStyle().value
        )

        Spacer(modifier = Modifier.height(8.dp))

        content()
    }
}

@UiThemePreview
@Composable
fun CatalogItemPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        CatalogItem(
            title = "Catalog Item",
            content = {
                ProButton(
                    text = "ProButton",
                    onClick = {}
                )
            }
        )
    }
}
