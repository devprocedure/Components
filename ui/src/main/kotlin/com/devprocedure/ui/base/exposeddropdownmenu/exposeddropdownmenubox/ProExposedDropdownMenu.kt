package com.devprocedure.ui.base.exposeddropdownmenu.exposeddropdownmenubox

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.devprocedure.ui.base.dropdownmenu.dropdownmenuitem.DropdownMenuItem
import com.devprocedure.ui.base.dropdownmenu.dropdownmenuitem.ProDropdownMenuItem
import com.devprocedure.ui.base.exposeddropdownmenu.ProExposedDropdownMenuDefaults
import com.devprocedure.ui.base.exposeddropdownmenu.exposeddropdownmenu.ProExposedDropdownMenuTheme

/**
 * Created by emre bahadir on 10/9/2023
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExposedDropdownMenuBoxScope.ProExposedDropdownMenu(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    onItemClicked: (Int) -> Unit,
    modifier: Modifier = Modifier,
    items: List<DropdownMenuItem>,
    theme: ProExposedDropdownMenuTheme = ProExposedDropdownMenuDefaults.dropdownMenuTheme()
) {
    ExposedDropdownMenu(
        expanded = expanded,
        onDismissRequest = onDismissRequest,
        modifier = modifier
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
