package com.devprocedure.ui.base.floatingactionbutton.prosmallfab

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.devprocedure.designsystem.theme.ComponentsTheme
import com.devprocedure.ui.base.floatingactionbutton.ProFabDefaults
import com.devprocedure.ui.base.icon.proicon.ProIcon
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.UiThemePreview

/**
 * Created by emre bahadir on 10/6/2023
 */
@Composable
fun ProSmallFab(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    theme: ProSmallFabTheme = ProFabDefaults.smallFloatingActionButtonTheme(),
    icon: ProImageVector
) {
    SmallFloatingActionButton(
        onClick = onClick,
        modifier = modifier,
        containerColor = theme.containerColor().value,
        contentColor = theme.contentColor().value,
        elevation = ProFabDefaults.smallFloatingActionButtonElevation(theme)
    ) {
        ProIcon(
            imageVector = icon
        )
    }
}

@UiThemePreview
@Composable
fun ProSmallFabPreview() {
    ComponentsTheme(
        dynamicColor = false
    ) {
        ProSmallFab(
            onClick = {},
            icon = ProImageVector(
                imageVector = Icons.Default.Add
            )
        )
    }
}
