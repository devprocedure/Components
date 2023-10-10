package com.devprocedure.ui.base.dropdownmenu.dropdownmenu

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import com.devprocedure.ui.base.dropdownmenu.dropdownmenuitem.ProDropdownMenuItemTheme
import com.proeb.composethemer.core.annotation.ComponentTheme

/**
 * Created by emre bahadir on 10/6/2023
 */
@ComponentTheme
interface ProDropdownMenuTheme {
    @Composable
    fun dropdownMenuItemTheme(): State<ProDropdownMenuItemTheme>
}
