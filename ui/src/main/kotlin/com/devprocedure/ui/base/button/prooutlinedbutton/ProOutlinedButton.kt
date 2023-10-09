package com.devprocedure.ui.base.button.prooutlinedbutton

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.devprocedure.designsystem.theme.CatalogTheme
import com.devprocedure.ui.base.button.ProButtonContent
import com.devprocedure.ui.base.button.ProButtonDefaults
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.UiThemePreview

/**
 * Created by emre bahadir on 10/6/2023
 */
@Composable
private fun ProOutlinedButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: ButtonColors,
    border: BorderStroke,
    contentPadding: PaddingValues = ProButtonDefaults.buttonContentPadding(),
    content: @Composable () -> Unit
) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = colors,
        border = border,
        contentPadding = contentPadding
    ) {
        content()
    }
}

@Composable
fun ProOutlinedButton(
    text: String,
    leadingIcon: ProImageVector? = null,
    trailingIcon: ProImageVector? = null,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    theme: ProOutlinedButtonTheme = ProButtonDefaults.outlinedButtonTheme()
) {
    ProOutlinedButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = ProButtonDefaults.outlinedButtonColors(theme = theme),
        border = theme.border().value,
        content = {
            ProButtonContent(
                text = text,
                textStyle = theme.textStyle().value,
                leadingIcon = leadingIcon,
                trailingIcon = trailingIcon
            )
        }
    )
}

@UiThemePreview
@Composable
fun ProOutlinedButtonPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProOutlinedButton(
            onClick = {},
            text = "Button"
        )
    }
}

@UiThemePreview
@Composable
fun ProOutlinedButtonWithLeadingIconPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProOutlinedButton(
            onClick = {},
            text = "Button",
            leadingIcon = ProImageVector(Icons.Default.Add)
        )
    }
}

@UiThemePreview
@Composable
fun ProOutlinedButtonWithTrailingIconPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProOutlinedButton(
            onClick = {},
            text = "Button",
            trailingIcon = ProImageVector(Icons.Default.Add)
        )
    }
}

@UiThemePreview
@Composable
fun ProOutlinedButtonWithLeadingAndTrailingIconPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProOutlinedButton(
            onClick = {},
            text = "Button",
            leadingIcon = ProImageVector(Icons.Default.Add),
            trailingIcon = ProImageVector(Icons.Default.Add)
        )
    }
}

@UiThemePreview
@Composable
fun ProOutlinedButtonDisabledPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProOutlinedButton(
            onClick = {},
            text = "Button",
            enabled = false
        )
    }
}
