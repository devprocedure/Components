package com.devprocedure.ui.base.floatingactionbutton.extendedfloatingactionbutton

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.devprocedure.designsystem.theme.CatalogTheme
import com.devprocedure.ui.base.floatingactionbutton.ProFabDefaults
import com.devprocedure.ui.base.icon.icon.ProIcon
import com.devprocedure.ui.base.text.ProText
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.UiThemePreview

/**
 * Created by emre bahadir on 10/6/2023
 */
@Composable
fun ProExtendedFloatingActionButton(
    text: String,
    icon: ProImageVector,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    expanded: Boolean = true,
    theme: ProExtendedFloatingActionButtonTheme = ProFabDefaults.extendedFloatingActionButtonTheme()
) {
    ExtendedFloatingActionButton(
        text = {
            ProText(
                text = text
            )
        },
        icon = {
            ProIcon(
                imageVector = icon
            )
        },
        onClick = onClick,
        modifier = modifier,
        containerColor = theme.containerColor().value,
        contentColor = theme.contentColor().value,
        elevation = ProFabDefaults.extendedFloatingActionButtonElevation(theme),
        expanded = expanded
    )
}

@UiThemePreview
@Composable
fun ProExtendedFabPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProExtendedFloatingActionButton(
            text = "Extended",
            icon = ProImageVector(
                imageVector = Icons.Default.Add
            ),
            onClick = {}
        )
    }
}

@UiThemePreview
@Composable
fun ProExtendedFabNotExpandedPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProExtendedFloatingActionButton(
            text = "Extended",
            icon = ProImageVector(
                imageVector = Icons.Default.Add
            ),
            onClick = {},
            expanded = false
        )
    }
}
