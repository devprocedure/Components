package com.devprocedure.ui.base.button.probutton

import androidx.compose.foundation.layout.PaddingValues
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
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    text: String,
    leadingIcon: ProImageVector? = null,
    trailingIcon: ProImageVector? = null,
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
