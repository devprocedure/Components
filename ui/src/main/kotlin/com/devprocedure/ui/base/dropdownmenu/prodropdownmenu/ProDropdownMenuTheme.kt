package com.devprocedure.ui.base.dropdownmenu.prodropdownmenu

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import com.devprocedure.ui.base.dropdownmenu.prodropdownmenuitem.ProDropdownMenuItemTheme
import com.proeb.composethemer.core.annotation.ComponentTheme

/**
 * Created by emre bahadir on 10/6/2023
 */
@ComponentTheme
interface ProDropdownMenuTheme {
    @Composable
    fun dropdownMenuItemTheme(): State<ProDropdownMenuItemTheme>
}
