package com.devprocedure.catalog.ui.detail.base.textfield.outlinedtextfield

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.composethemer.ProOutlinedTextFieldThemes
import com.devprocedure.ui.base.textfield.outlinedtextfield.ProOutlinedTextField
import com.devprocedure.ui.catalog.catalogitem.CatalogItem
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.getThemeByName

/**
 * Created by emre bahadir on 10/13/2023
 */
internal fun LazyListScope.ProOutlinedTextFieldCatalog(themeName: String) {
    item {
        val themeType = ProOutlinedTextFieldThemes::class.getThemeByName(themeName)

        var text by remember { mutableStateOf("") }
        CatalogItem(
            title = "ProOutlinedTextField"
        ) {
            ProOutlinedTextField(
                value = text,
                onValueChange = {
                    text = it
                },
                label = "ProOutlinedTextField",
                theme = themeType.theme
            )

            ProOutlinedTextField(
                value = text,
                onValueChange = {},
                label = "ProOutlinedTextField",
                enabled = false,
                theme = themeType.theme
            )
        }

        var textWithPlaceHolder by remember { mutableStateOf("") }
        CatalogItem(
            title = "ProOutlinedTextField with placeholder"
        ) {
            ProOutlinedTextField(
                value = textWithPlaceHolder,
                onValueChange = {
                    textWithPlaceHolder = it
                },
                label = "ProOutlinedTextField",
                placeholder = "Placeholder",
                theme = themeType.theme
            )

            ProOutlinedTextField(
                value = textWithPlaceHolder,
                onValueChange = {},
                label = "ProOutlinedTextField",
                placeholder = "Placeholder",
                enabled = false,
                theme = themeType.theme
            )
        }

        var textWithDefaultValue by remember { mutableStateOf("ProOutlinedTextField") }
        CatalogItem(
            title = "ProOutlinedTextField with default value"
        ) {
            ProOutlinedTextField(
                value = textWithDefaultValue,
                onValueChange = {
                    textWithDefaultValue = it
                },
                label = "ProOutlinedTextField",
                theme = themeType.theme
            )

            ProOutlinedTextField(
                value = textWithDefaultValue,
                onValueChange = {},
                label = "ProOutlinedTextField",
                enabled = false,
                theme = themeType.theme
            )
        }

        var textWithError by remember { mutableStateOf("") }
        CatalogItem(
            title = "ProOutlinedTextField error state"
        ) {
            ProOutlinedTextField(
                value = textWithError,
                onValueChange = {
                    textWithError = it
                },
                label = "ProOutlinedTextField",
                isError = true,
                theme = themeType.theme
            )

            ProOutlinedTextField(
                value = textWithError,
                onValueChange = {},
                label = "ProOutlinedTextField",
                isError = true,
                enabled = false,
                theme = themeType.theme
            )
        }

        var textWithSupportingText by remember { mutableStateOf("") }
        CatalogItem(
            title = "ProOutlinedTextField with supporting text"
        ) {
            ProOutlinedTextField(
                value = textWithSupportingText,
                onValueChange = {
                    textWithSupportingText = it
                },
                label = "ProOutlinedTextField",
                supportingText = "Supporting text",
                theme = themeType.theme
            )

            ProOutlinedTextField(
                value = textWithSupportingText,
                onValueChange = {},
                label = "ProOutlinedTextField",
                supportingText = "Supporting text",
                enabled = false,
                theme = themeType.theme
            )
        }

        var textWithPrefix by remember { mutableStateOf("") }
        CatalogItem(
            title = "ProOutlinedTextField with prefix"
        ) {
            ProOutlinedTextField(
                value = textWithPrefix,
                onValueChange = {
                    textWithPrefix = it
                },
                label = "ProOutlinedTextField",
                prefix = "Prefix",
                theme = themeType.theme
            )

            ProOutlinedTextField(
                value = textWithPrefix,
                onValueChange = {},
                label = "ProOutlinedTextField",
                prefix = "Prefix",
                enabled = false,
                theme = themeType.theme
            )
        }

        var textWithSuffix by remember { mutableStateOf("") }
        CatalogItem(
            title = "ProOutlinedTextField with suffix"
        ) {
            ProOutlinedTextField(
                value = textWithSuffix,
                onValueChange = {
                    textWithSuffix = it
                },
                label = "ProOutlinedTextField",
                suffix = "Suffix",
                theme = themeType.theme
            )

            ProOutlinedTextField(
                value = textWithSuffix,
                onValueChange = {},
                label = "ProOutlinedTextField",
                suffix = "Suffix",
                enabled = false,
                theme = themeType.theme
            )
        }

        var textWithPrefixAndSuffix by remember { mutableStateOf("") }
        CatalogItem(
            title = "ProOutlinedTextField with prefix and suffix"
        ) {
            ProOutlinedTextField(
                value = textWithPrefixAndSuffix,
                onValueChange = {
                    textWithPrefixAndSuffix = it
                },
                label = "ProOutlinedTextField",
                prefix = "Prefix",
                suffix = "Suffix",
                theme = themeType.theme
            )

            ProOutlinedTextField(
                value = textWithPrefixAndSuffix,
                onValueChange = {},
                label = "ProOutlinedTextField",
                prefix = "Prefix",
                suffix = "Suffix",
                enabled = false,
                theme = themeType.theme
            )
        }

        var textWithLeadingIcon by remember { mutableStateOf("") }
        CatalogItem(
            title = "ProOutlinedTextField with leading icon"
        ) {
            ProOutlinedTextField(
                value = textWithLeadingIcon,
                onValueChange = {
                    textWithLeadingIcon = it
                },
                label = "ProOutlinedTextField",
                leadingIcon = ProImageVector(
                    imageVector = Icons.Default.Add
                ),
                theme = themeType.theme
            )

            ProOutlinedTextField(
                value = textWithLeadingIcon,
                onValueChange = {},
                label = "ProOutlinedTextField",
                leadingIcon = ProImageVector(
                    imageVector = Icons.Default.Add
                ),
                enabled = false,
                theme = themeType.theme
            )
        }

        var textWithTrailingIcon by remember { mutableStateOf("") }
        CatalogItem(
            title = "ProOutlinedTextField with trailing icon"
        ) {
            ProOutlinedTextField(
                value = textWithTrailingIcon,
                onValueChange = {
                    textWithTrailingIcon = it
                },
                label = "ProOutlinedTextField",
                trailingIcon = ProImageVector(
                    imageVector = Icons.Default.Add
                ),
                theme = themeType.theme
            )

            ProOutlinedTextField(
                value = textWithTrailingIcon,
                onValueChange = {},
                label = "ProOutlinedTextField",
                trailingIcon = ProImageVector(
                    imageVector = Icons.Default.Add
                ),
                enabled = false,
                theme = themeType.theme
            )
        }

        var textWithLeadingAndTrailingIcon by remember { mutableStateOf("") }
        CatalogItem(
            title = "ProOutlinedTextField with leading and trailing icon",
            hasDivider = false
        ) {
            ProOutlinedTextField(
                value = textWithLeadingAndTrailingIcon,
                onValueChange = {
                    textWithLeadingAndTrailingIcon = it
                },
                label = "ProOutlinedTextField",
                leadingIcon = ProImageVector(
                    imageVector = Icons.Default.Add
                ),
                trailingIcon = ProImageVector(
                    imageVector = Icons.Default.Add
                ),
                theme = themeType.theme
            )

            ProOutlinedTextField(
                value = textWithLeadingAndTrailingIcon,
                onValueChange = {},
                label = "ProOutlinedTextField",
                leadingIcon = ProImageVector(
                    imageVector = Icons.Default.Add
                ),
                trailingIcon = ProImageVector(
                    imageVector = Icons.Default.Add
                ),
                enabled = false,
                theme = themeType.theme
            )
        }
    }
}
