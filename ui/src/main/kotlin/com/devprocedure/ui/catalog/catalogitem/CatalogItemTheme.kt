package com.devprocedure.ui.catalog.catalogitem

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.text.TextStyle
import com.proeb.composethemer.core.annotation.ComponentTheme

/**
 * Created by emre bahadir on 10/10/2023
 */
@ComponentTheme
interface CatalogItemTheme {
    @Composable
    fun titleStyle(): State<TextStyle>
}
