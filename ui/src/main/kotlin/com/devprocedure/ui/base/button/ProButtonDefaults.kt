package com.devprocedure.ui.base.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.composethemer.ProButtonThemes
import com.composethemer.ProOutlinedButtonThemes
import com.devprocedure.ui.base.button.probutton.ProButtonTheme
import com.devprocedure.ui.base.button.prooutlinedbutton.ProOutlinedButtonTheme

/**
 * Created by emre bahadir on 10/5/2023
 */
object ProButtonDefaults {
    val ButtonHorizontalPadding = 24.dp
    val ButtonHorizontalIconPadding = 16.dp
    val ButtonVerticalPadding = 8.dp
    val ButtonIconSize = 24.dp
    val ButtonContentSpacing = 8.dp
    val ButtonContentZeroSpacing = 0.dp

    @Composable
    fun filledButtonTheme() = ProButtonThemes.Primary.theme

    @Composable
    fun outlinedButtonTheme() = ProOutlinedButtonThemes.Primary.theme

    internal fun buttonContentPadding(
        leadingIcon: Boolean = false,
        trailingIcon: Boolean = false
    ): PaddingValues = PaddingValues(
        start = when {
            leadingIcon -> ButtonHorizontalIconPadding
            else -> ButtonHorizontalPadding
        },
        top = ButtonVerticalPadding,
        end = when {
            trailingIcon -> ButtonHorizontalIconPadding
            else -> ButtonHorizontalPadding
        },
        bottom = ButtonVerticalPadding
    )

    @Composable
    internal fun filledButtonColors(
        theme: ProButtonTheme
    ) = ButtonDefaults.buttonColors(
        containerColor = theme.containerColor().value,
        contentColor = theme.contentColor().value,
        disabledContainerColor = theme.disabledContainerColor().value,
        disabledContentColor = theme.disabledContentColor().value
    )

    @Composable
    internal fun outlinedButtonColors(
        theme: ProOutlinedButtonTheme
    ) = ButtonDefaults.outlinedButtonColors(
        containerColor = theme.containerColor().value,
        contentColor = theme.contentColor().value,
        disabledContainerColor = theme.disabledContainerColor().value,
        disabledContentColor = theme.disabledContentColor().value
    )
}
