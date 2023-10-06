package com.devprocedure.ui.base.button.prooutlinedbutton

import androidx.compose.foundation.BorderStroke
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import com.proeb.composethemer.core.annotation.ComponentTheme

/**
 * Created by emre bahadir on 10/6/2023
 */
@ComponentTheme
interface ProOutlinedButtonTheme {
    @Composable
    fun containerColor(): State<Color>

    @Composable
    fun contentColor(): State<Color>

    @Composable
    fun disabledContainerColor(): State<Color>

    @Composable
    fun disabledContentColor(): State<Color>

    @Composable
    fun border(): State<BorderStroke>

    @Composable
    fun textStyle(): State<TextStyle>
}
