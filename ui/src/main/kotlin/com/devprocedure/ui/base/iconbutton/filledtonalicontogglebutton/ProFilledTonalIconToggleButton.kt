package com.devprocedure.ui.base.iconbutton.filledtonalicontogglebutton

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FilledTonalIconToggleButton
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.devprocedure.designsystem.theme.CatalogTheme
import com.devprocedure.ui.base.icon.icon.ProIcon
import com.devprocedure.ui.base.iconbutton.ProIconButtonDefaults
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.UiThemePreview

/**
 * Created by emre bahadir on 10/13/2023
 */
@Composable
fun ProFilledTonalIconToggleButton(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    icon: ProImageVector,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    theme: ProFilledTonalIconToggleButtonTheme = ProIconButtonDefaults.filledTonalIconToggleButtonTheme(),
) {
    FilledTonalIconToggleButton(
        checked = checked,
        onCheckedChange = onCheckedChange,
        modifier = modifier,
        enabled = enabled,
        colors = ProIconButtonDefaults.filledTonalIconToggleButtonColors(theme = theme)
    ) {
        ProIcon(
            imageVector = icon
        )
    }
}

@UiThemePreview
@Composable
fun ProFilledTonalIconToggleButtonPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        Surface {
            ProFilledTonalIconToggleButton(
                checked = false,
                onCheckedChange = {},
                icon = ProImageVector(
                    imageVector = Icons.Default.Add
                )
            )
        }
    }
}

@UiThemePreview
@Composable
fun ProFilledTonalIconToggleButtonCheckedPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        Surface {
            ProFilledTonalIconToggleButton(
                checked = true,
                onCheckedChange = {},
                icon = ProImageVector(
                    imageVector = Icons.Default.Add
                )
            )
        }
    }
}