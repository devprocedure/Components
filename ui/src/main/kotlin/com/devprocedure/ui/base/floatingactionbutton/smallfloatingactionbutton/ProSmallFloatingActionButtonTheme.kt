package com.devprocedure.ui.base.floatingactionbutton.smallfloatingactionbutton

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.proeb.composethemer.core.annotation.ComponentTheme

/**
 * Created by emre bahadir on 10/6/2023
 */
@ComponentTheme
interface ProSmallFloatingActionButtonTheme {
    @Composable
    fun containerColor(): State<Color>

    @Composable
    fun contentColor(): State<Color>

    @Composable
    fun defaultElevation(): State<Dp>

    @Composable
    fun pressedElevation(): State<Dp>

    @Composable
    fun focusedElevation(): State<Dp>

    @Composable
    fun hoveredElevation(): State<Dp>
}
