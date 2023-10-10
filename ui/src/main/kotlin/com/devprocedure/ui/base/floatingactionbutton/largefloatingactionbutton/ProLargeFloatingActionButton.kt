@file:JvmName("ProLargeFloatingActionButtonThemeKt")

package com.devprocedure.ui.base.floatingactionbutton.largefloatingactionbutton

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.LargeFloatingActionButton
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
fun ProLargeFloatingActionButton(
    icon: ProImageVector,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    theme: ProLargeFloatingActionButtonTheme = ProFabDefaults.largeFloatingActionButtonTheme()
) {
    LargeFloatingActionButton(
        onClick = onClick,
        modifier = modifier,
        containerColor = theme.containerColor().value,
        contentColor = theme.contentColor().value,
        elevation = ProFabDefaults.largeFloatingActionButtonElevation(theme)
    ) {
        ProIcon(
            imageVector = icon
        )
    }
}

@UiThemePreview
@Composable
fun ProLargeFabPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProLargeFloatingActionButton(
            onClick = {},
            icon = ProImageVector(
                imageVector = Icons.Default.Add
            )
        )
    }
}
