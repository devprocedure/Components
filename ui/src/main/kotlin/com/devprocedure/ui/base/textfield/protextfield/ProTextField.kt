package com.devprocedure.ui.base.textfield.protextfield

import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.VisualTransformation
import com.devprocedure.designsystem.theme.ComponentsTheme
import com.devprocedure.ui.base.icon.proicon.ProIcon
import com.devprocedure.ui.base.text.ProText
import com.devprocedure.ui.base.textfield.ProTextFieldDefaults
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.UiThemePreview

/**
 * Created by emre bahadir on 10/9/2023
 */
@Composable
fun ProTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    label: String? = null,
    placeholder: String? = null,
    leadingIcon: ProImageVector? = null,
    trailingIcon: ProImageVector? = null,
    prefix: String? = null,
    suffix: String? = null,
    supportingText: String? = null,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = true,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    theme: ProTextFieldTheme = ProTextFieldDefaults.textFieldTheme()
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        readOnly = readOnly,
        textStyle = theme.textStyle().value,
        label = label?.let {
            {
                ProText(
                    text = label
                )
            }
        },
        placeholder = placeholder?.let {
            {
                ProText(
                    text = placeholder
                )
            }
        },
        leadingIcon = leadingIcon?.let {
            {
                ProIcon(
                    imageVector = leadingIcon
                )
            }
        },
        trailingIcon = trailingIcon?.let {
            {
                ProIcon(
                    imageVector = trailingIcon
                )
            }
        },
        prefix = prefix?.let {
            {
                ProText(
                    text = prefix
                )
            }
        },
        suffix = suffix?.let {
            {
                ProText(
                    text = suffix
                )
            }
        },
        supportingText = supportingText?.let {
            {
                ProText(
                    text = supportingText
                )
            }
        },
        isError = isError,
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        singleLine = singleLine,
        maxLines = maxLines,
        minLines = minLines,
        colors = ProTextFieldDefaults.textFieldColors(theme)
    )
}

@UiThemePreview
@Composable
fun ProOutlinedTextFieldPreview() {
    ComponentsTheme(
        dynamicColor = false
    ) {
        ProTextField(
            value = "",
            onValueChange = {},
            label = "Label"
        )
    }
}

@UiThemePreview
@Composable
fun ProOutlinedTextFieldPreviewError() {
    ComponentsTheme(
        dynamicColor = false
    ) {
        ProTextField(
            value = "",
            onValueChange = {},
            label = "Label",
            isError = true
        )
    }
}

@UiThemePreview
@Composable
fun ProOutlinedTextFieldPreviewWithValue() {
    ComponentsTheme(
        dynamicColor = false
    ) {
        ProTextField(
            value = "Value",
            onValueChange = {},
            label = "Label"
        )
    }
}

@UiThemePreview
@Composable
fun ProOutlinedTextFieldPreviewWithSupportingText() {
    ComponentsTheme(
        dynamicColor = false
    ) {
        ProTextField(
            value = "",
            onValueChange = {},
            label = "Label",
            supportingText = "Supporting Text"
        )
    }
}

@UiThemePreview
@Composable
fun ProOutlinedTextFieldPreviewWithPrefixAndSuffix() {
    ComponentsTheme(
        dynamicColor = false
    ) {
        ProTextField(
            value = "Value",
            onValueChange = {},
            label = "Label",
            prefix = "PRE",
            suffix = "SUF"
        )
    }
}

@UiThemePreview
@Composable
fun ProOutlinedTextFieldPreviewWithLeadingAndTrailingIcon() {
    ComponentsTheme(
        dynamicColor = false
    ) {
        ProTextField(
            value = "",
            onValueChange = {},
            label = "Label",
            leadingIcon = ProImageVector(
                imageVector = Icons.Default.Add
            ),
            trailingIcon = ProImageVector(
                imageVector = Icons.Default.Add
            )
        )
    }
}
