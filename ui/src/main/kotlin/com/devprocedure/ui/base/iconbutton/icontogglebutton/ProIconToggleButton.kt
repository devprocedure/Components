package com.devprocedure.ui.base.iconbutton.icontogglebutton

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.IconToggleButton
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
fun ProIconToggleButton(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    icon: ProImageVector,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    theme: ProIconToggleButtonTheme = ProIconButtonDefaults.iconToggleButtonTheme()
) {
    IconToggleButton(
        checked = checked,
        onCheckedChange = onCheckedChange,
        modifier = modifier,
        enabled = enabled,
        colors = ProIconButtonDefaults.iconToggleButtonColors(theme = theme)
    ) {
        ProIcon(
            imageVector = icon
        )
    }
}

@UiThemePreview
@Composable
fun ProToggleIconButtonPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        Surface {
            ProIconToggleButton(
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
fun ProToggleIconButtonCheckedPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        Surface {
            ProIconToggleButton(
                checked = true,
                onCheckedChange = {},
                icon = ProImageVector(
                    imageVector = Icons.Default.Add
                )
            )
        }
    }
}
