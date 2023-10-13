package com.devprocedure.ui.base.iconbutton.outlinediconbutton

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.OutlinedIconButton
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
fun ProOutlinedIconButton(
    onClick: () -> Unit,
    icon: ProImageVector,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    theme: ProOutlinedIconButtonTheme = ProIconButtonDefaults.outlinedIconButtonTheme()
) {
    OutlinedIconButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = ProIconButtonDefaults.outlinedIconButtonColors(theme = theme),
        border = theme.border().value
    ) {
        ProIcon(
            imageVector = icon
        )
    }
}

@UiThemePreview
@Composable
fun ProOutlinedIconButtonPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        Surface {
            ProOutlinedIconButton(
                onClick = {},
                icon = ProImageVector(
                    imageVector = Icons.Default.Add
                )
            )
        }
    }
}
