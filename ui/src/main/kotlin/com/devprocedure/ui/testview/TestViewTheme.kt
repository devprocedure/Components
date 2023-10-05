package com.devprocedure.ui.testview

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import com.proeb.composethemer.core.annotation.ComponentTheme

/**
 * Created by emre bahadir on 9/28/2023
 */
@ComponentTheme
interface TestViewTheme {
    @Composable
    fun textColor(): State<Color>

    @Composable
    fun backgroundColor(): State<Color>

    @Composable
    fun textStyle(): State<TextStyle>

    @Composable
    fun border(): State<BorderStroke>

    @Composable
    fun padding(): State<PaddingValues>
}