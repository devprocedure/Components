package com.devprocedure.ui.base.button.filledtonalbutton

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.proeb.composethemer.core.annotation.ComponentTheme

/**
 * Created by emre bahadir on 10/13/2023
 */
@ComponentTheme
interface ProFilledTonalButtonTheme {
    @Composable
    fun containerColor(): State<Color>

    @Composable
    fun contentColor(): State<Color>

    @Composable
    fun disabledContainerColor(): State<Color>

    @Composable
    fun disabledContentColor(): State<Color>

    @Composable
    fun textStyle(): State<TextStyle>

    @Composable
    fun defaultElevation(): State<Dp>

    @Composable
    fun pressedElevation(): State<Dp>

    @Composable
    fun focusedElevation(): State<Dp>

    @Composable
    fun hoveredElevation(): State<Dp>

    @Composable
    fun disabledElevation(): State<Dp>
}