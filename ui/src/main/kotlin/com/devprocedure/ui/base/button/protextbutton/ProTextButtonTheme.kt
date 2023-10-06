package com.devprocedure.ui.base.button.protextbutton

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import com.proeb.composethemer.core.annotation.ComponentTheme

/**
 * Created by emre bahadir on 10/6/2023
 */
@ComponentTheme
interface ProTextButtonTheme {
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
}
