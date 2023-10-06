package com.devprocedure.ui.base.card

import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import com.composethemer.ProCardThemes
import com.composethemer.ProElevatedCardThemes
import com.composethemer.ProOutlinedCardThemes
import com.devprocedure.ui.base.card.procard.ProCardTheme
import com.devprocedure.ui.base.card.proelevatedcard.ProElevatedCardTheme
import com.devprocedure.ui.base.card.prooutlinedcard.ProOutlinedCardTheme

/**
 * Created by emre bahadir on 10/6/2023
 */
object ProCardDefaults {
    @Composable
    internal fun cardTheme() = ProCardThemes.SurfaceVariant.theme

    @Composable
    internal fun elevatedCardTheme() = ProElevatedCardThemes.Surface.theme

    @Composable
    internal fun outlinedCardTheme() = ProOutlinedCardThemes.Surface.theme

    @Composable
    internal fun cardColors(
        theme: ProCardTheme
    ) = CardDefaults.cardColors(
        containerColor = theme.containerColor().value,
        contentColor = theme.contentColor().value,
        disabledContainerColor = theme.disabledContainerColor().value,
        disabledContentColor = theme.disabledContentColor().value
    )

    @Composable
    internal fun cardElevation(
        theme: ProCardTheme
    ) = CardDefaults.cardElevation(
        defaultElevation = theme.defaultElevation().value,
        pressedElevation = theme.pressedElevation().value,
        focusedElevation = theme.focusedElevation().value,
        hoveredElevation = theme.hoveredElevation().value,
        draggedElevation = theme.draggedElevation().value,
        disabledElevation = theme.disabledElevation().value
    )

    @Composable
    internal fun elevatedCardColors(
        theme: ProElevatedCardTheme
    ) = CardDefaults.elevatedCardColors(
        containerColor = theme.containerColor().value,
        contentColor = theme.contentColor().value,
        disabledContainerColor = theme.disabledContainerColor().value,
        disabledContentColor = theme.disabledContentColor().value
    )

    @Composable
    internal fun elevatedCardElevation(
        theme: ProElevatedCardTheme
    ) = CardDefaults.elevatedCardElevation(
        defaultElevation = theme.defaultElevation().value,
        pressedElevation = theme.pressedElevation().value,
        focusedElevation = theme.focusedElevation().value,
        hoveredElevation = theme.hoveredElevation().value,
        draggedElevation = theme.draggedElevation().value,
        disabledElevation = theme.disabledElevation().value
    )

    @Composable
    internal fun outlinedCardColors(
        theme: ProOutlinedCardTheme
    ) = CardDefaults.outlinedCardColors(
        containerColor = theme.containerColor().value,
        contentColor = theme.contentColor().value,
        disabledContainerColor = theme.disabledContainerColor().value,
        disabledContentColor = theme.disabledContentColor().value
    )

    @Composable
    internal fun outlinedCardElevation(
        theme: ProOutlinedCardTheme
    ) = CardDefaults.outlinedCardElevation(
        defaultElevation = theme.defaultElevation().value,
        pressedElevation = theme.pressedElevation().value,
        focusedElevation = theme.focusedElevation().value,
        hoveredElevation = theme.hoveredElevation().value,
        draggedElevation = theme.draggedElevation().value,
        disabledElevation = theme.disabledElevation().value
    )
}