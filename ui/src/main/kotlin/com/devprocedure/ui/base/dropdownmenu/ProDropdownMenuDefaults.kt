package com.devprocedure.ui.base.dropdownmenu

import androidx.compose.material3.MenuDefaults
import androidx.compose.runtime.Composable
import com.composethemer.ProDropdownMenuItemThemes
import com.composethemer.ProDropdownMenuThemes
import com.devprocedure.ui.base.dropdownmenu.dropdownmenuitem.ProDropdownMenuItemTheme

/**
 * Created by emre bahadir on 10/6/2023
 */
object ProDropdownMenuDefaults {
    @Composable
    internal fun dropdownMenuTheme() = ProDropdownMenuThemes.OnSurface.theme

    @Composable
    internal fun dropdownMenuItemTheme() = ProDropdownMenuItemThemes.OnSurface.theme

    @Composable
    internal fun dropdownMenuItemColors(
        theme: ProDropdownMenuItemTheme
    ) = MenuDefaults.itemColors(
        textColor = theme.textColor().value,
        leadingIconColor = theme.leadingIconColor().value,
        trailingIconColor = theme.trailingIconColor().value,
        disabledTextColor = theme.disabledTextColor().value,
        disabledLeadingIconColor = theme.disabledLeadingIconColor().value,
        disabledTrailingIconColor = theme.disabledTrailingIconColor().value
    )
}
