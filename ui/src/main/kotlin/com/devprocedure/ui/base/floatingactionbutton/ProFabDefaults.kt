package com.devprocedure.ui.base.floatingactionbutton

import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.runtime.Composable
import com.composethemer.ProFabThemes
import com.devprocedure.ui.base.floatingactionbutton.profab.ProFabTheme

/**
 * Created by emre bahadir on 10/6/2023
 */
object ProFabDefaults {
    @Composable
    internal fun floatingActionButtonTheme() = ProFabThemes.PrimaryContainer.theme

    @Composable
    internal fun floatingActionButtonElevation(
        theme: ProFabTheme
    ) = FloatingActionButtonDefaults.elevation(
        defaultElevation = theme.defaultElevation().value,
        pressedElevation = theme.pressedElevation().value,
        focusedElevation = theme.focusedElevation().value,
        hoveredElevation = theme.hoveredElevation().value
    )
}