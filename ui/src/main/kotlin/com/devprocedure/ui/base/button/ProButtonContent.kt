package com.devprocedure.ui.base.button

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import com.devprocedure.ui.base.text.ProText

/**
 * Created by emre bahadir on 10/5/2023
 */
@Composable
internal fun ProButtonContent(
    text: String,
    textStyle: TextStyle,
    leadingIcon: @Composable (() -> Unit)?,
    trailingIcon: @Composable (() -> Unit)?
) {
    leadingIcon?.let {
        Box(
            Modifier.sizeIn(maxHeight = ProButtonDefaults.ButtonIconSize),
        ) {
            it()
        }
    }

    Box(
        Modifier
            .padding(
                start = if (leadingIcon != null) {
                    ProButtonDefaults.ButtonContentSpacing
                } else {
                    ProButtonDefaults.ButtonContentZeroSpacing
                },
                end = if (trailingIcon != null) {
                    ProButtonDefaults.ButtonContentSpacing
                } else {
                    ProButtonDefaults.ButtonContentZeroSpacing
                },
            ),
    ) {
        ProText(
            text = text,
            style = textStyle
        )
    }

    trailingIcon?.let {
        Box(
            Modifier.sizeIn(maxHeight = ProButtonDefaults.ButtonIconSize),
        ) {
            it()
        }
    }
}