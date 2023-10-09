package com.devprocedure.ui.catalog.cataloglistitem

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.proeb.composethemer.core.annotation.ComponentTheme

/**
 * Created by emre bahadir on 10/9/2023
 */
@ComponentTheme
interface CatalogListItemTheme {
    @Composable
    fun headlineSize(): State<Dp>

    @Composable
    fun headlineTextStyle(): State<TextStyle>

    @Composable
    fun titleTextStyle(): State<TextStyle>
}
