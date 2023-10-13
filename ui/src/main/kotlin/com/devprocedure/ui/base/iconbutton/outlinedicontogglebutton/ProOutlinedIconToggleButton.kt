package com.devprocedure.ui.base.iconbutton.outlinedicontogglebutton

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.OutlinedIconToggleButton
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.composethemer.ProOutlinedIconToggleButtonThemes
import com.devprocedure.designsystem.theme.CatalogTheme
import com.devprocedure.ui.base.icon.icon.ProIcon
import com.devprocedure.ui.base.iconbutton.ProIconButtonDefaults
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.UiThemePreview

/**
 * Created by emre bahadir on 10/13/2023
 */
@Composable
fun ProOutlinedIconToggleButton(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    icon: ProImageVector,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    theme: ProOutlinedIconToggleButtonTheme = ProIconButtonDefaults.outlinedIconToggleButtonTheme()
) {
    OutlinedIconToggleButton(
        checked = checked,
        onCheckedChange = onCheckedChange,
        modifier = modifier,
        enabled = enabled,
        colors = ProIconButtonDefaults.outlinedIconToggleButtonColors(theme = theme),
        border = theme.border().value
    ) {
        ProIcon(
            imageVector = icon
        )
    }
}

@UiThemePreview
@Composable
fun ProOutlinedIconToggleButtonPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        Surface {
            ProOutlinedIconToggleButton(
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
fun ProOutlinedIconToggleButtonCheckedPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        Surface {
            ProOutlinedIconToggleButton(
                checked = true,
                onCheckedChange = {},
                icon = ProImageVector(
                    imageVector = Icons.Default.Add
                ),
                theme = ProOutlinedIconToggleButtonThemes.InverseSurfaceChecked.theme
            )
        }
    }
}
