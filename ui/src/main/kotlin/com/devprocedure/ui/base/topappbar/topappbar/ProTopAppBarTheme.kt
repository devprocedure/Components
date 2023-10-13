package com.devprocedure.ui.base.topappbar.topappbar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.text.TextStyle
import com.proeb.composethemer.core.annotation.ComponentTheme

/**
 * Created by emre bahadir on 10/13/2023
 */
@ComponentTheme
interface ProTopAppBarTheme {
    @Composable
    fun titleStyle(): State<TextStyle>
}