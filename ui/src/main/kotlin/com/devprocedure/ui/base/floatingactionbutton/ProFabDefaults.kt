package com.devprocedure.ui.base.floatingactionbutton

import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.runtime.Composable
import com.composethemer.ProExtendedFloatingActionButtonThemes
import com.composethemer.ProFloatingActionButtonThemes
import com.composethemer.ProLargeFloatingActionButtonThemes
import com.composethemer.ProSmallFloatingActionButtonThemes
import com.devprocedure.ui.base.floatingactionbutton.extendedfloatingactionbutton.ProExtendedFloatingActionButtonTheme
import com.devprocedure.ui.base.floatingactionbutton.floatingactionbutton.ProFloatingActionButtonTheme
import com.devprocedure.ui.base.floatingactionbutton.largefloatingactionbutton.ProLargeFloatingActionButtonTheme
import com.devprocedure.ui.base.floatingactionbutton.smallfloatingactionbutton.ProSmallFloatingActionButtonTheme

/**
 * Created by emre bahadir on 10/6/2023
 */
object ProFabDefaults {
    @Composable
    internal fun floatingActionButtonTheme() = ProFloatingActionButtonThemes.PrimaryContainer.theme

    @Composable
    internal fun smallFloatingActionButtonTheme() = ProSmallFloatingActionButtonThemes.PrimaryContainer.theme

    @Composable
    internal fun largeFloatingActionButtonTheme() = ProLargeFloatingActionButtonThemes.PrimaryContainer.theme

    @Composable
    internal fun extendedFloatingActionButtonTheme() = ProExtendedFloatingActionButtonThemes.PrimaryContainer.theme

    @Composable
    internal fun floatingActionButtonElevation(
        theme: ProFloatingActionButtonTheme
    ) = FloatingActionButtonDefaults.elevation(
        defaultElevation = theme.defaultElevation().value,
        pressedElevation = theme.pressedElevation().value,
        focusedElevation = theme.focusedElevation().value,
        hoveredElevation = theme.hoveredElevation().value
    )

    @Composable
    internal fun smallFloatingActionButtonElevation(
        theme: ProSmallFloatingActionButtonTheme
    ) = FloatingActionButtonDefaults.elevation(
        defaultElevation = theme.defaultElevation().value,
        pressedElevation = theme.pressedElevation().value,
        focusedElevation = theme.focusedElevation().value,
        hoveredElevation = theme.hoveredElevation().value
    )

    @Composable
    internal fun largeFloatingActionButtonElevation(
        theme: ProLargeFloatingActionButtonTheme
    ) = FloatingActionButtonDefaults.elevation(
        defaultElevation = theme.defaultElevation().value,
        pressedElevation = theme.pressedElevation().value,
        focusedElevation = theme.focusedElevation().value,
        hoveredElevation = theme.hoveredElevation().value
    )

    @Composable
    internal fun extendedFloatingActionButtonElevation(
        theme: ProExtendedFloatingActionButtonTheme
    ) = FloatingActionButtonDefaults.elevation(
        defaultElevation = theme.defaultElevation().value,
        pressedElevation = theme.pressedElevation().value,
        focusedElevation = theme.focusedElevation().value,
        hoveredElevation = theme.hoveredElevation().value
    )
}
