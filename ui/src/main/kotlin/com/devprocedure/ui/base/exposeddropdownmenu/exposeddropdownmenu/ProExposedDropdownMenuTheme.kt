package com.devprocedure.ui.base.exposeddropdownmenu.exposeddropdownmenu

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import com.devprocedure.ui.base.dropdownmenu.dropdownmenuitem.ProDropdownMenuItemTheme
import com.proeb.composethemer.core.annotation.ComponentTheme

/**
 * Created by emre bahadir on 10/9/2023
 */
@ComponentTheme
interface ProExposedDropdownMenuTheme {
    @Composable
    fun dropdownMenuItemTheme(): State<ProDropdownMenuItemTheme>
}
