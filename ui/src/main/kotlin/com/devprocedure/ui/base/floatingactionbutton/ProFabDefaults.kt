package com.devprocedure.ui.base.floatingactionbutton

import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.runtime.Composable
import com.composethemer.ProExtendedFabThemes
import com.composethemer.ProFabThemes
import com.composethemer.ProLargeFabThemes
import com.composethemer.ProSmallFabThemes
import com.devprocedure.ui.base.floatingactionbutton.proextendedfab.ProExtendedFabTheme
import com.devprocedure.ui.base.floatingactionbutton.profab.ProFabTheme
import com.devprocedure.ui.base.floatingactionbutton.prolargefab.ProLargeFabTheme
import com.devprocedure.ui.base.floatingactionbutton.prosmallfab.ProSmallFabTheme

/**
 * Created by emre bahadir on 10/6/2023
 */
object ProFabDefaults {
    @Composable
    internal fun floatingActionButtonTheme() = ProFabThemes.PrimaryContainer.theme

    @Composable
    internal fun smallFloatingActionButtonTheme() = ProSmallFabThemes.PrimaryContainer.theme

    @Composable
    internal fun largeFloatingActionButtonTheme() = ProLargeFabThemes.PrimaryContainer.theme

    @Composable
    internal fun extendedFloatingActionButtonTheme() = ProExtendedFabThemes.PrimaryContainer.theme

    @Composable
    internal fun floatingActionButtonElevation(
        theme: ProFabTheme
    ) = FloatingActionButtonDefaults.elevation(
        defaultElevation = theme.defaultElevation().value,
        pressedElevation = theme.pressedElevation().value,
        focusedElevation = theme.focusedElevation().value,
        hoveredElevation = theme.hoveredElevation().value
    )

    @Composable
    internal fun smallFloatingActionButtonElevation(
        theme: ProSmallFabTheme
    ) = FloatingActionButtonDefaults.elevation(
        defaultElevation = theme.defaultElevation().value,
        pressedElevation = theme.pressedElevation().value,
        focusedElevation = theme.focusedElevation().value,
        hoveredElevation = theme.hoveredElevation().value
    )

    @Composable
    internal fun largeFloatingActionButtonElevation(
        theme: ProLargeFabTheme
    ) = FloatingActionButtonDefaults.elevation(
        defaultElevation = theme.defaultElevation().value,
        pressedElevation = theme.pressedElevation().value,
        focusedElevation = theme.focusedElevation().value,
        hoveredElevation = theme.hoveredElevation().value
    )

    @Composable
    internal fun extendedFloatingActionButtonElevation(
        theme: ProExtendedFabTheme
    ) = FloatingActionButtonDefaults.elevation(
        defaultElevation = theme.defaultElevation().value,
        pressedElevation = theme.pressedElevation().value,
        focusedElevation = theme.focusedElevation().value,
        hoveredElevation = theme.hoveredElevation().value
    )
}
