package com.devprocedure.ui.base.card.proelevatedcard

import androidx.compose.foundation.layout.size
import androidx.compose.material3.ElevatedCard
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
fun ProElevatedCard(
    modifier: Modifier = Modifier,
    theme: ProElevatedCardTheme = ProCardDefaults.elevatedCardTheme(),
    content: @Composable () -> Unit
) {
    ElevatedCard(
        modifier = modifier,
        colors = ProCardDefaults.elevatedCardColors(theme),
        elevation = ProCardDefaults.elevatedCardElevation(theme)
    ) {
        content()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProElevatedCard(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    theme: ProElevatedCardTheme = ProCardDefaults.elevatedCardTheme(),
    content: @Composable () -> Unit
) {
    ElevatedCard(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = ProCardDefaults.elevatedCardColors(theme),
        elevation = ProCardDefaults.elevatedCardElevation(theme)
    ) {
        content()
    }
}

@UiThemePreview
@Composable
fun ProElevatedCardPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProElevatedCard(
            modifier = Modifier
                .size(150.dp)
        ) {
        }
    }
}
