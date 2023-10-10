package com.devprocedure.ui.base.floatingactionbutton.floatingactionbutton

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.devprocedure.designsystem.theme.CatalogTheme
import com.devprocedure.ui.base.floatingactionbutton.ProFabDefaults
import com.devprocedure.ui.base.icon.icon.ProIcon
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.UiThemePreview

/**
 * Created by emre bahadir on 10/6/2023
 */
@Composable
fun ProFloatingActionButton(
    icon: ProImageVector,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    theme: ProFloatingActionButtonTheme = ProFabDefaults.floatingActionButtonTheme()
) {
    FloatingActionButton(
        onClick = onClick,
        modifier = modifier,
        containerColor = theme.containerColor().value,
        contentColor = theme.contentColor().value,
        elevation = ProFabDefaults.floatingActionButtonElevation(theme)
    ) {
        ProIcon(
            imageVector = icon
        )
    }
}

@UiThemePreview
@Composable
fun ProFabPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProFloatingActionButton(
            onClick = {},
            icon = ProImageVector(
                imageVector = Icons.Default.Add
            )
        )
    }
}
