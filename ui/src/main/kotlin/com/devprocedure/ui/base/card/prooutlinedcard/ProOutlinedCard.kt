package com.devprocedure.ui.base.card.prooutlinedcard

import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedCard
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
fun ProOutlinedCard(
    modifier: Modifier = Modifier,
    theme: ProOutlinedCardTheme = ProCardDefaults.outlinedCardTheme(),
    content: @Composable () -> Unit
) {
    OutlinedCard(
        modifier = modifier,
        colors = ProCardDefaults.outlinedCardColors(theme),
        elevation = ProCardDefaults.outlinedCardElevation(theme),
        border = theme.border().value
    ) {
        content()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProOutlinedCard(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    theme: ProOutlinedCardTheme = ProCardDefaults.outlinedCardTheme(),
    content: @Composable () -> Unit
) {
    OutlinedCard(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = ProCardDefaults.outlinedCardColors(theme),
        elevation = ProCardDefaults.outlinedCardElevation(theme),
        border = theme.border().value
    ) {
        content()
    }
}

@UiThemePreview
@Composable
fun ProOutlinedCardPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProOutlinedCard(
            modifier = Modifier
                .size(150.dp)
        ) {
        }
    }
}
