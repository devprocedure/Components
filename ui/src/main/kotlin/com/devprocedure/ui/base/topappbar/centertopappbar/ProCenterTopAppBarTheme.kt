package com.devprocedure.ui.base.topappbar.centertopappbar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import com.proeb.composethemer.core.annotation.ComponentTheme

/**
 * Created by emre bahadir on 10/16/2023
 */
@ComponentTheme
interface ProCenterTopAppBarTheme {
    @Composable
    fun titleStyle(): State<TextStyle>

    @Composable
    fun containerColor(): State<Color>

    @Composable
    fun scrolledContainerColor(): State<Color>

    @Composable
    fun navigationIconContentColor(): State<Color>

    @Composable
    fun titleContentColor(): State<Color>

    @Composable
    fun actionIconContentColor(): State<Color>
}
