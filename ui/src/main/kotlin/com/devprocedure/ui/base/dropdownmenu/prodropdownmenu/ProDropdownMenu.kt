package com.devprocedure.ui.base.dropdownmenu.prodropdownmenu

import androidx.compose.material3.DropdownMenu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.devprocedure.ui.base.dropdownmenu.ProDropdownMenuDefaults
import com.devprocedure.ui.base.dropdownmenu.prodropdownmenuitem.DropdownMenuItem
import com.devprocedure.ui.base.dropdownmenu.prodropdownmenuitem.ProDropdownMenuItem

/**
 * Created by emre bahadir on 10/6/2023
 */
@Composable
fun ProDropdownMenu(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    onItemClicked: (Int) -> Unit,
    modifier: Modifier = Modifier,
    items: List<DropdownMenuItem>,
    theme: ProDropdownMenuTheme = ProDropdownMenuDefaults.dropdownMenuTheme()
) {
    DropdownMenu(
        expanded = expanded,
        onDismissRequest = onDismissRequest,
        modifier = modifier,
        offset = DpOffset(24.dp, 24.dp)
    ) {
        items.forEach { item ->
            ProDropdownMenuItem(
                text = item.text,
                onClick = { onItemClicked(item.id) },
                modifier = modifier,
                leadingIcon = item.leadingIcon,
                trailingIcon = item.trailingIcon,
                theme = theme.dropdownMenuItemTheme().value
            )
        }
    }
}
