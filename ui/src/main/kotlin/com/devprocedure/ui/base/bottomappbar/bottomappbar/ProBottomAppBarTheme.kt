package com.devprocedure.ui.base.bottomappbar.bottomappbar

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.devprocedure.ui.base.floatingactionbutton.floatingactionbutton.ProFloatingActionButtonTheme
import com.proeb.composethemer.core.annotation.ComponentTheme

/**
 * Created by emre bahadir on 10/16/2023
 */
@ComponentTheme
interface ProBottomAppBarTheme {
    @Composable
    fun containerColor(): State<Color>

    @Composable
    fun contentColor(): State<Color>

    @Composable
    fun tonalElevation(): State<Dp>

    @Composable
    fun contentPadding(): State<PaddingValues>

    @Composable
    fun floatingActionButtonTheme(): State<ProFloatingActionButtonTheme>
}
