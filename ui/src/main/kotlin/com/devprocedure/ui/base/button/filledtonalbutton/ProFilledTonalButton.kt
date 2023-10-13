package com.devprocedure.ui.base.button.filledtonalbutton

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.devprocedure.designsystem.theme.CatalogTheme
import com.devprocedure.ui.base.button.ProButtonContent
import com.devprocedure.ui.base.button.ProButtonDefaults
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.UiThemePreview

/**
 * Created by emre bahadir on 10/13/2023
 */
@Composable
private fun ProFilledTonalButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: ButtonColors,
    elevation: ButtonElevation,
    contentPadding: PaddingValues = ProButtonDefaults.buttonContentPadding(),
    content: @Composable () -> Unit
) {
    FilledTonalButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = colors,
        elevation = elevation,
        contentPadding = contentPadding
    ) {
        content()
    }
}

@Composable
fun ProFilledTonalButton(
    text: String,
    leadingIcon: ProImageVector? = null,
    trailingIcon: ProImageVector? = null,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    theme: ProFilledTonalButtonTheme = ProButtonDefaults.filledTonalButtonTheme()
) {
    ProFilledTonalButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = ProButtonDefaults.filledTonalButtonColors(theme = theme),
        elevation = ProButtonDefaults.filledTonalButtonElevation(theme = theme),
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
fun ProFilledTonalButtonPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProFilledTonalButton(
            onClick = {},
            text = "Button"
        )
    }
}

@UiThemePreview
@Composable
fun ProFilledTonalWithLeadingIconPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProFilledTonalButton(
            onClick = {},
            text = "Button",
            leadingIcon = ProImageVector(Icons.Default.Add)
        )
    }
}

@UiThemePreview
@Composable
fun ProFilledTonalWithTrailingIconPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProFilledTonalButton(
            onClick = {},
            text = "Button",
            trailingIcon = ProImageVector(Icons.Default.Add)
        )
    }
}

@UiThemePreview
@Composable
fun ProFilledTonalWithLeadingAndTrailingIconPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProFilledTonalButton(
            onClick = {},
            text = "Button",
            leadingIcon = ProImageVector(Icons.Default.Add),
            trailingIcon = ProImageVector(Icons.Default.Add)
        )
    }
}
