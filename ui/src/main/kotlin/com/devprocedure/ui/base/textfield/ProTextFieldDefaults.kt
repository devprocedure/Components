package com.devprocedure.ui.base.textfield

import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import com.composethemer.ProOutlinedTextFieldThemes
import com.composethemer.ProTextFieldThemes
import com.devprocedure.ui.base.textfield.outlinedtextfield.ProOutlinedTextFieldTheme
import com.devprocedure.ui.base.textfield.textfield.ProTextFieldTheme

/**
 * Created by emre bahadir on 10/6/2023
 */
object ProTextFieldDefaults {
    @Composable
    internal fun textFieldTheme() = ProTextFieldThemes.Primary.theme

    @Composable
    internal fun outlinedTextFieldTheme() = ProOutlinedTextFieldThemes.Primary.theme

    @Composable
    internal fun textFieldColors(
        theme: ProTextFieldTheme
    ) = TextFieldDefaults.colors(
        focusedTextColor = theme.focusedTextColor().value,
        unfocusedTextColor = theme.unfocusedTextColor().value,
        disabledTextColor = theme.disabledTextColor().value,
        errorTextColor = theme.errorTextColor().value,
        focusedContainerColor = theme.focusedContainerColor().value,
        unfocusedContainerColor = theme.unfocusedContainerColor().value,
        disabledContainerColor = theme.disabledContainerColor().value,
        errorContainerColor = theme.errorContainerColor().value,
        cursorColor = theme.cursorColor().value,
        errorCursorColor = theme.errorCursorColor().value,
        selectionColors = TextSelectionColors(
            handleColor = theme.selectionColorsHandleColor().value,
            backgroundColor = theme.selectionColorsBackgroundColor().value
        ),
        focusedIndicatorColor = theme.focusedIndicatorColor().value,
        unfocusedIndicatorColor = theme.unfocusedIndicatorColor().value,
        disabledIndicatorColor = theme.disabledIndicatorColor().value,
        errorIndicatorColor = theme.errorIndicatorColor().value,
        focusedLeadingIconColor = theme.focusedLeadingIconColor().value,
        unfocusedLeadingIconColor = theme.unfocusedLeadingIconColor().value,
        disabledLeadingIconColor = theme.disabledLeadingIconColor().value,
        errorLeadingIconColor = theme.errorLeadingIconColor().value,
        focusedTrailingIconColor = theme.focusedTrailingIconColor().value,
        unfocusedTrailingIconColor = theme.unfocusedTrailingIconColor().value,
        disabledTrailingIconColor = theme.disabledTrailingIconColor().value,
        errorTrailingIconColor = theme.errorTrailingIconColor().value,
        focusedLabelColor = theme.focusedLabelColor().value,
        unfocusedLabelColor = theme.unfocusedLabelColor().value,
        disabledLabelColor = theme.disabledLabelColor().value,
        errorLabelColor = theme.errorLabelColor().value,
        focusedPlaceholderColor = theme.focusedPlaceholderColor().value,
        unfocusedPlaceholderColor = theme.unfocusedPlaceholderColor().value,
        disabledPlaceholderColor = theme.disabledPlaceholderColor().value,
        errorPlaceholderColor = theme.errorPlaceholderColor().value,
        focusedSupportingTextColor = theme.focusedSupportingTextColor().value,
        unfocusedSupportingTextColor = theme.unfocusedSupportingTextColor().value,
        disabledSupportingTextColor = theme.disabledSupportingTextColor().value,
        errorSupportingTextColor = theme.errorSupportingTextColor().value,
        focusedPrefixColor = theme.focusedPrefixColor().value,
        unfocusedPrefixColor = theme.unfocusedPrefixColor().value,
        disabledPrefixColor = theme.disabledPrefixColor().value,
        errorPrefixColor = theme.errorPrefixColor().value,
        focusedSuffixColor = theme.focusedSuffixColor().value,
        unfocusedSuffixColor = theme.unfocusedSuffixColor().value,
        disabledSuffixColor = theme.disabledSuffixColor().value,
        errorSuffixColor = theme.errorSuffixColor().value
    )

    @Composable
    internal fun outlinedTextFieldColors(
        theme: ProOutlinedTextFieldTheme
    ) = OutlinedTextFieldDefaults.colors(
        focusedTextColor = theme.focusedTextColor().value,
        unfocusedTextColor = theme.unfocusedTextColor().value,
        disabledTextColor = theme.disabledTextColor().value,
        errorTextColor = theme.errorTextColor().value,
        focusedContainerColor = theme.focusedContainerColor().value,
        unfocusedContainerColor = theme.unfocusedContainerColor().value,
        disabledContainerColor = theme.disabledContainerColor().value,
        errorContainerColor = theme.errorContainerColor().value,
        cursorColor = theme.cursorColor().value,
        errorCursorColor = theme.errorCursorColor().value,
        selectionColors = TextSelectionColors(
            handleColor = theme.selectionColorsHandleColor().value,
            backgroundColor = theme.selectionColorsBackgroundColor().value
        ),
        focusedBorderColor = theme.focusedBorderColor().value,
        unfocusedBorderColor = theme.unfocusedBorderColor().value,
        disabledBorderColor = theme.disabledBorderColor().value,
        errorBorderColor = theme.errorBorderColor().value,
        focusedLeadingIconColor = theme.focusedLeadingIconColor().value,
        unfocusedLeadingIconColor = theme.unfocusedLeadingIconColor().value,
        disabledLeadingIconColor = theme.disabledLeadingIconColor().value,
        errorLeadingIconColor = theme.errorLeadingIconColor().value,
        focusedTrailingIconColor = theme.focusedTrailingIconColor().value,
        unfocusedTrailingIconColor = theme.unfocusedTrailingIconColor().value,
        disabledTrailingIconColor = theme.disabledTrailingIconColor().value,
        errorTrailingIconColor = theme.errorTrailingIconColor().value,
        focusedLabelColor = theme.focusedLabelColor().value,
        unfocusedLabelColor = theme.unfocusedLabelColor().value,
        disabledLabelColor = theme.disabledLabelColor().value,
        errorLabelColor = theme.errorLabelColor().value,
        focusedPlaceholderColor = theme.focusedPlaceholderColor().value,
        unfocusedPlaceholderColor = theme.unfocusedPlaceholderColor().value,
        disabledPlaceholderColor = theme.disabledPlaceholderColor().value,
        errorPlaceholderColor = theme.errorPlaceholderColor().value,
        focusedSupportingTextColor = theme.focusedSupportingTextColor().value,
        unfocusedSupportingTextColor = theme.unfocusedSupportingTextColor().value,
        disabledSupportingTextColor = theme.disabledSupportingTextColor().value,
        errorSupportingTextColor = theme.errorSupportingTextColor().value,
        focusedPrefixColor = theme.focusedPrefixColor().value,
        unfocusedPrefixColor = theme.unfocusedPrefixColor().value,
        disabledPrefixColor = theme.disabledPrefixColor().value,
        errorPrefixColor = theme.errorPrefixColor().value,
        focusedSuffixColor = theme.focusedSuffixColor().value,
        unfocusedSuffixColor = theme.unfocusedSuffixColor().value,
        disabledSuffixColor = theme.disabledSuffixColor().value,
        errorSuffixColor = theme.errorSuffixColor().value
    )
}
