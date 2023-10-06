package com.devprocedure.ui.base.button.probutton

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.devprocedure.designsystem.theme.ComponentsTheme
import com.devprocedure.ui.base.button.ProButtonContent
import com.devprocedure.ui.base.button.ProButtonDefaults
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.UiThemePreview

/**
 * Created by emre bahadir on 10/5/2023
 */
@Composable
private fun ProButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: ButtonColors,
    contentPadding: PaddingValues = ProButtonDefaults.buttonContentPadding(),
    content: @Composable () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = colors,
        contentPadding = contentPadding
    ) {
        content()
    }
}

@Composable
fun ProButton(
    text: String,
    leadingIcon: ProImageVector? = null,
    trailingIcon: ProImageVector? = null,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    theme: ProButtonTheme = ProButtonDefaults.filledButtonTheme()
) {
    ProButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = ProButtonDefaults.filledButtonColors(theme = theme),
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
fun ProButtonPreview() {
    ComponentsTheme(
        dynamicColor = false
    ) {
        ProButton(
            onClick = {},
            text = "Button"
        )
    }
}

@UiThemePreview
@Composable
fun ProButtonWithLeadingIconPreview() {
    ComponentsTheme(
        dynamicColor = false
    ) {
        ProButton(
            onClick = {},
            text = "Button",
            leadingIcon = ProImageVector(Icons.Default.Add)
        )
    }
}

@UiThemePreview
@Composable
fun ProButtonWithTrailingIconPreview() {
    ComponentsTheme(
        dynamicColor = false
    ) {
        ProButton(
            onClick = {},
            text = "Button",
            trailingIcon = ProImageVector(Icons.Default.Add)
        )
    }
}

@UiThemePreview
@Composable
fun ProButtonWithLeadingAndTrailingIconPreview() {
    ComponentsTheme(
        dynamicColor = false
    ) {
        ProButton(
            onClick = {},
            text = "Button",
            leadingIcon = ProImageVector(Icons.Default.Add),
            trailingIcon = ProImageVector(Icons.Default.Add)
        )
    }
}

@UiThemePreview
@Composable
fun ProButtonDisabledPreview() {
    ComponentsTheme(
        dynamicColor = false
    ) {
        ProButton(
            onClick = {},
            text = "Button",
            enabled = false
        )
    }
}
