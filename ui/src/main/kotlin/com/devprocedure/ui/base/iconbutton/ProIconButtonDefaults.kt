package com.devprocedure.ui.base.iconbutton

import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.Composable
import com.composethemer.ProFilledIconButtonThemes
import com.composethemer.ProFilledTonalIconButtonThemes
import com.composethemer.ProFilledTonalIconToggleButtonThemes
import com.composethemer.ProIconButtonThemes
import com.composethemer.ProIconToggleButtonThemes
import com.composethemer.ProOutlinedIconButtonThemes
import com.composethemer.ProOutlinedIconToggleButtonThemes
import com.devprocedure.ui.base.iconbutton.fillediconbutton.ProFilledIconButtonTheme
import com.devprocedure.ui.base.iconbutton.filledtonaliconbutton.ProFilledTonalIconButtonTheme
import com.devprocedure.ui.base.iconbutton.filledtonalicontogglebutton.ProFilledTonalIconToggleButtonTheme
import com.devprocedure.ui.base.iconbutton.iconbutton.ProIconButtonTheme
import com.devprocedure.ui.base.iconbutton.icontogglebutton.ProIconToggleButtonTheme
import com.devprocedure.ui.base.iconbutton.outlinediconbutton.ProOutlinedIconButtonTheme
import com.devprocedure.ui.base.iconbutton.outlinedicontogglebutton.ProOutlinedIconToggleButtonTheme

/**
 * Created by emre bahadir on 10/13/2023
 */
object ProIconButtonDefaults {
    @Composable
    internal fun iconButtonTheme() = ProIconButtonThemes.Transparent.theme

    @Composable
    internal fun iconToggleButtonTheme() = ProIconToggleButtonThemes.Primary.theme

    @Composable
    internal fun filledIconButtonTheme() = ProFilledIconButtonThemes.Primary.theme

    @Composable
    internal fun filledTonalIconButtonTheme() = ProFilledTonalIconButtonThemes.SecondaryContainer.theme

    @Composable
    internal fun filledTonalIconToggleButtonTheme() = ProFilledTonalIconToggleButtonThemes.SecondaryContainer.theme

    @Composable
    internal fun outlinedIconButtonTheme() = ProOutlinedIconButtonThemes.Transparent.theme

    @Composable
    internal fun outlinedIconToggleButtonTheme() = ProOutlinedIconToggleButtonThemes.InverseSurface.theme

    @Composable
    internal fun iconButtonColors(
        theme: ProIconButtonTheme
    ) = IconButtonDefaults.iconButtonColors(
        containerColor = theme.containerColor().value,
        contentColor = theme.contentColor().value,
        disabledContainerColor = theme.disabledContainerColor().value,
        disabledContentColor = theme.disabledContentColor().value
    )

    @Composable
    internal fun iconToggleButtonColors(
        theme: ProIconToggleButtonTheme
    ) = IconButtonDefaults.iconToggleButtonColors(
        containerColor = theme.containerColor().value,
        contentColor = theme.contentColor().value,
        disabledContainerColor = theme.disabledContainerColor().value,
        disabledContentColor = theme.disabledContentColor().value,
        checkedContainerColor = theme.checkedContainerColor().value,
        checkedContentColor = theme.checkedContentColor().value
    )

    @Composable
    internal fun filledIconButtonColors(
        theme: ProFilledIconButtonTheme
    ) = IconButtonDefaults.filledIconButtonColors(
        containerColor = theme.containerColor().value,
        contentColor = theme.contentColor().value,
        disabledContainerColor = theme.disabledContainerColor().value,
        disabledContentColor = theme.disabledContentColor().value
    )

    @Composable
    internal fun filledTonalIconButtonColors(
        theme: ProFilledTonalIconButtonTheme
    ) = IconButtonDefaults.filledTonalIconButtonColors(
        containerColor = theme.containerColor().value,
        contentColor = theme.contentColor().value,
        disabledContainerColor = theme.disabledContainerColor().value,
        disabledContentColor = theme.disabledContentColor().value
    )

    @Composable
    internal fun filledTonalIconToggleButtonColors(
        theme: ProFilledTonalIconToggleButtonTheme
    ) = IconButtonDefaults.filledTonalIconToggleButtonColors(
        containerColor = theme.containerColor().value,
        contentColor = theme.contentColor().value,
        disabledContainerColor = theme.disabledContainerColor().value,
        disabledContentColor = theme.disabledContentColor().value,
        checkedContainerColor = theme.checkedContainerColor().value,
        checkedContentColor = theme.checkedContentColor().value
    )

    @Composable
    internal fun outlinedIconButtonColors(
        theme: ProOutlinedIconButtonTheme
    ) = IconButtonDefaults.outlinedIconButtonColors(
        containerColor = theme.containerColor().value,
        contentColor = theme.contentColor().value,
        disabledContainerColor = theme.disabledContainerColor().value,
        disabledContentColor = theme.disabledContentColor().value
    )

    @Composable
    internal fun outlinedIconToggleButtonColors(
        theme: ProOutlinedIconToggleButtonTheme
    ) = IconButtonDefaults.outlinedIconToggleButtonColors(
        containerColor = theme.containerColor().value,
        contentColor = theme.contentColor().value,
        disabledContainerColor = theme.disabledContainerColor().value,
        disabledContentColor = theme.disabledContentColor().value,
        checkedContainerColor = theme.checkedContainerColor().value,
        checkedContentColor = theme.checkedContentColor().value
    )
}
