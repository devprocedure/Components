package com.devprocedure.ui.base.textfield.protextfield

import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.VisualTransformation
import com.devprocedure.ui.base.icon.proicon.ProIcon
import com.devprocedure.ui.base.text.ProText
import com.devprocedure.ui.base.textfield.ProTextFieldDefaults
import com.devprocedure.ui.util.ProImageVector

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
