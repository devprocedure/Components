package com.devprocedure.ui.base.card.card

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.devprocedure.designsystem.theme.CatalogTheme
import com.devprocedure.ui.base.card.ProCardDefaults
import com.devprocedure.ui.util.UiThemePreview

/**
 * Created by emre bahadir on 10/6/2023
 */
@Composable
fun ProCard(
    modifier: Modifier = Modifier,
    theme: ProCardTheme = ProCardDefaults.cardTheme(),
    content: @Composable () -> Unit
) {
    Card(
        modifier = modifier,
        colors = ProCardDefaults.cardColors(theme),
        elevation = ProCardDefaults.cardElevation(theme)
    ) {
        content()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProCard(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    theme: ProCardTheme = ProCardDefaults.cardTheme(),
    content: @Composable () -> Unit
) {
    Card(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = ProCardDefaults.cardColors(theme),
        elevation = ProCardDefaults.cardElevation(theme)
    ) {
        content()
    }
}

@UiThemePreview
@Composable
fun ProCardPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProCard(
            modifier = Modifier
                .size(150.dp)
        ) {
        }
    }
}
