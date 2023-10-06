package com.devprocedure.ui.base.dropdownmenu.prodropdownmenuitem

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.graphics.Color
import com.proeb.composethemer.core.annotation.ComponentTheme

/**
 * Created by emre bahadir on 10/6/2023
 */
@ComponentTheme
interface ProDropdownMenuItemTheme {
    @Composable
    fun textColor(): State<Color>

    @Composable
    fun leadingIconColor(): State<Color>

    @Composable
    fun trailingIconColor(): State<Color>

    @Composable
    fun disabledTextColor(): State<Color>

    @Composable
    fun disabledLeadingIconColor(): State<Color>

    @Composable
    fun disabledTrailingIconColor(): State<Color>

    @Composable
    fun contentPadding(): State<PaddingValues>
}
