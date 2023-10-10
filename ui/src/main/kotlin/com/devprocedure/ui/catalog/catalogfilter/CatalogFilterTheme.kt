package com.devprocedure.ui.catalog.catalogfilter

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.text.TextStyle
import com.devprocedure.ui.base.textfield.outlinedtextfield.ProOutlinedTextFieldTheme
import com.proeb.composethemer.core.annotation.ComponentTheme

/**
 * Created by emre bahadir on 10/10/2023
 */
@ComponentTheme
interface CatalogFilterTheme {
    @Composable
    fun titleStyle(): State<TextStyle>

    @Composable
    fun textFieldTheme(): State<ProOutlinedTextFieldTheme>
}
