package com.devprocedure.ui.base.dropdownmenu.prodropdownmenuitem

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.devprocedure.designsystem.theme.CatalogTheme
import com.devprocedure.ui.base.dropdownmenu.ProDropdownMenuDefaults
import com.devprocedure.ui.base.icon.proicon.ProIcon
import com.devprocedure.ui.base.text.ProText
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.UiThemePreview

/**
 * Created by emre bahadir on 10/6/2023
 */
@Composable
fun ProDropdownMenuItem(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    leadingIcon: ProImageVector? = null,
    trailingIcon: ProImageVector? = null,
    enabled: Boolean = true,
    theme: ProDropdownMenuItemTheme = ProDropdownMenuDefaults.dropdownMenuItemTheme()
) {
    DropdownMenuItem(
        text = {
            ProText(
                text = text
            )
        },
        onClick = onClick,
        modifier = modifier,
        leadingIcon = leadingIcon?.let {
            {
                ProIcon(
                    imageVector = it
                )
            }
        },
        trailingIcon = trailingIcon?.let {
            {
                ProIcon(
                    imageVector = it
                )
            }
        },
        enabled = enabled,
        colors = ProDropdownMenuDefaults.dropdownMenuItemColors(
            theme = theme
        )
    )
}

@UiThemePreview
@Composable
fun ProDropdownMenuItemPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProDropdownMenuItem(
            text = "ProDropdownMenuItem",
            onClick = {}
        )
    }
}

@UiThemePreview
@Composable
fun ProDropdownMenuItemWithLeadingIconPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProDropdownMenuItem(
            text = "ProDropdownMenuItem",
            onClick = {},
            leadingIcon = ProImageVector(
                imageVector = Icons.Default.Add
            )
        )
    }
}

@UiThemePreview
@Composable
fun ProDropdownMenuItemWithTrailingIconPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProDropdownMenuItem(
            text = "ProDropdownMenuItem",
            onClick = {},
            trailingIcon = ProImageVector(
                imageVector = Icons.Default.Add
            )
        )
    }
}

@UiThemePreview
@Composable
fun ProDropdownMenuItemWithLeadingAndTrailingIconPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProDropdownMenuItem(
            text = "ProDropdownMenuItem",
            onClick = {},
            leadingIcon = ProImageVector(
                imageVector = Icons.Default.Add
            ),
            trailingIcon = ProImageVector(
                imageVector = Icons.Default.Add
            )
        )
    }
}

@UiThemePreview
@Composable
fun ProDropdownMenuItemDisabledPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProDropdownMenuItem(
            text = "ProDropdownMenuItem",
            onClick = {},
            enabled = false
        )
    }
}
