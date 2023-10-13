package com.devprocedure.ui.base.button.elevatedbutton

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.ElevatedButton
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
private fun ProElevatedButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: ButtonColors,
    elevation: ButtonElevation,
    contentPadding: PaddingValues = ProButtonDefaults.buttonContentPadding(),
    content: @Composable () -> Unit
) {
    ElevatedButton(
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
fun ProElevatedButton(
    text: String,
    leadingIcon: ProImageVector? = null,
    trailingIcon: ProImageVector? = null,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    theme: ProElevatedButtonTheme = ProButtonDefaults.elevatedButtonTheme()
) {
    ProElevatedButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = ProButtonDefaults.elevatedButtonColors(theme = theme),
        elevation = ProButtonDefaults.elevatedButtonElevation(theme = theme),
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
fun ProElevatedButtonPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProElevatedButton(
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
        ProElevatedButton(
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
        ProElevatedButton(
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
        ProElevatedButton(
            onClick = {},
            text = "Button",
            leadingIcon = ProImageVector(Icons.Default.Add),
            trailingIcon = ProImageVector(Icons.Default.Add)
        )
    }
}
