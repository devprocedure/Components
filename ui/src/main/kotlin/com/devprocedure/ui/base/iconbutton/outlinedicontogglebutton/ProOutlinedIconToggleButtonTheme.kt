package com.devprocedure.ui.base.iconbutton.outlinedicontogglebutton

import androidx.compose.foundation.BorderStroke
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.graphics.Color
import com.proeb.composethemer.core.annotation.ComponentTheme

/**
 * Created by emre bahadir on 10/13/2023
 */
@ComponentTheme
interface ProOutlinedIconToggleButtonTheme {
    @Composable
    fun containerColor(): State<Color>

    @Composable
    fun contentColor(): State<Color>

    @Composable
    fun disabledContainerColor(): State<Color>

    @Composable
    fun disabledContentColor(): State<Color>

    @Composable
    fun checkedContainerColor(): State<Color>

    @Composable
    fun checkedContentColor(): State<Color>

    @Composable
    fun border(): State<BorderStroke>
}
