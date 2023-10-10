package com.devprocedure.ui.base.textfield.textfield

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import com.proeb.composethemer.core.annotation.ComponentTheme

/**
 * Created by emre bahadir on 10/9/2023
 */
@ComponentTheme
interface ProTextFieldTheme {
    @Composable
    fun textStyle(): State<TextStyle>

    @Composable
    fun focusedTextColor(): State<Color>

    @Composable
    fun unfocusedTextColor(): State<Color>

    @Composable
    fun disabledTextColor(): State<Color>

    @Composable
    fun errorTextColor(): State<Color>

    @Composable
    fun focusedContainerColor(): State<Color>

    @Composable
    fun unfocusedContainerColor(): State<Color>

    @Composable
    fun disabledContainerColor(): State<Color>

    @Composable
    fun errorContainerColor(): State<Color>

    @Composable
    fun cursorColor(): State<Color>

    @Composable
    fun errorCursorColor(): State<Color>

    @Composable
    fun selectionColorsHandleColor(): State<Color>

    @Composable
    fun selectionColorsBackgroundColor(): State<Color>

    @Composable
    fun focusedIndicatorColor(): State<Color>

    @Composable
    fun unfocusedIndicatorColor(): State<Color>

    @Composable
    fun disabledIndicatorColor(): State<Color>

    @Composable
    fun errorIndicatorColor(): State<Color>

    @Composable
    fun focusedLeadingIconColor(): State<Color>

    @Composable
    fun unfocusedLeadingIconColor(): State<Color>

    @Composable
    fun disabledLeadingIconColor(): State<Color>

    @Composable
    fun errorLeadingIconColor(): State<Color>

    @Composable
    fun focusedTrailingIconColor(): State<Color>

    @Composable
    fun unfocusedTrailingIconColor(): State<Color>

    @Composable
    fun disabledTrailingIconColor(): State<Color>

    @Composable
    fun errorTrailingIconColor(): State<Color>

    @Composable
    fun focusedLabelColor(): State<Color>

    @Composable
    fun unfocusedLabelColor(): State<Color>

    @Composable
    fun disabledLabelColor(): State<Color>

    @Composable
    fun errorLabelColor(): State<Color>

    @Composable
    fun focusedPlaceholderColor(): State<Color>

    @Composable
    fun unfocusedPlaceholderColor(): State<Color>

    @Composable
    fun disabledPlaceholderColor(): State<Color>

    @Composable
    fun errorPlaceholderColor(): State<Color>

    @Composable
    fun focusedSupportingTextColor(): State<Color>

    @Composable
    fun unfocusedSupportingTextColor(): State<Color>

    @Composable
    fun disabledSupportingTextColor(): State<Color>

    @Composable
    fun errorSupportingTextColor(): State<Color>

    @Composable
    fun focusedPrefixColor(): State<Color>

    @Composable
    fun unfocusedPrefixColor(): State<Color>

    @Composable
    fun disabledPrefixColor(): State<Color>

    @Composable
    fun errorPrefixColor(): State<Color>

    @Composable
    fun focusedSuffixColor(): State<Color>

    @Composable
    fun unfocusedSuffixColor(): State<Color>

    @Composable
    fun disabledSuffixColor(): State<Color>

    @Composable
    fun errorSuffixColor(): State<Color>
}
