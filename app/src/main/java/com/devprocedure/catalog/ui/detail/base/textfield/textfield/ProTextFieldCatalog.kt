package com.devprocedure.catalog.ui.detail.base.textfield.textfield

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.composethemer.ProTextFieldThemes
import com.devprocedure.ui.base.textfield.textfield.ProTextField
import com.devprocedure.ui.catalog.catalogitem.CatalogItem
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.getThemeByName

/**
 * Created by emre bahadir on 10/13/2023
 */
internal fun LazyListScope.ProTextFieldCatalog(themeName: String) {
    item {
        val themeType = ProTextFieldThemes::class.getThemeByName(themeName)

        var text by remember { mutableStateOf("") }
        CatalogItem(
            title = "ProTextField"
        ) {
            ProTextField(
                value = text,
                onValueChange = {
                    text = it
                },
                label = "ProTextField",
                theme = themeType.theme
            )

            ProTextField(
                value = text,
                onValueChange = {},
                label = "ProTextField",
                enabled = false,
                theme = themeType.theme
            )
        }

        var textWithPlaceHolder by remember { mutableStateOf("") }
        CatalogItem(
            title = "ProTextField with placeholder"
        ) {
            ProTextField(
                value = textWithPlaceHolder,
                onValueChange = {
                    textWithPlaceHolder = it
                },
                label = "ProTextField",
                placeholder = "Placeholder",
                theme = themeType.theme
            )

            ProTextField(
                value = textWithPlaceHolder,
                onValueChange = {},
                label = "ProTextField",
                placeholder = "Placeholder",
                enabled = false,
                theme = themeType.theme
            )
        }

        var textWithDefaultValue by remember { mutableStateOf("ProTextField") }
        CatalogItem(
            title = "ProTextField with default value"
        ) {
            ProTextField(
                value = textWithDefaultValue,
                onValueChange = {
                    textWithDefaultValue = it
                },
                label = "ProTextField",
                theme = themeType.theme
            )

            ProTextField(
                value = textWithDefaultValue,
                onValueChange = {},
                label = "ProTextField",
                enabled = false,
                theme = themeType.theme
            )
        }

        var textWithError by remember { mutableStateOf("") }
        CatalogItem(
            title = "ProTextField error state"
        ) {
            ProTextField(
                value = textWithError,
                onValueChange = {
                    textWithError = it
                },
                label = "ProTextField",
                isError = true,
                theme = themeType.theme
            )

            ProTextField(
                value = textWithError,
                onValueChange = {},
                label = "ProTextField",
                isError = true,
                enabled = false,
                theme = themeType.theme
            )
        }

        var textWithSupportingText by remember { mutableStateOf("") }
        CatalogItem(
            title = "ProTextField with supporting text"
        ) {
            ProTextField(
                value = textWithSupportingText,
                onValueChange = {
                    textWithSupportingText = it
                },
                label = "ProTextField",
                supportingText = "Supporting text",
                theme = themeType.theme
            )

            ProTextField(
                value = textWithSupportingText,
                onValueChange = {},
                label = "ProTextField",
                supportingText = "Supporting text",
                enabled = false,
                theme = themeType.theme
            )
        }

        var textWithPrefix by remember { mutableStateOf("") }
        CatalogItem(
            title = "ProTextField with prefix"
        ) {
            ProTextField(
                value = textWithPrefix,
                onValueChange = {
                    textWithPrefix = it
                },
                label = "ProTextField",
                prefix = "Prefix",
                theme = themeType.theme
            )

            ProTextField(
                value = textWithPrefix,
                onValueChange = {},
                label = "ProTextField",
                prefix = "Prefix",
                enabled = false,
                theme = themeType.theme
            )
        }

        var textWithSuffix by remember { mutableStateOf("") }
        CatalogItem(
            title = "ProTextField with suffix"
        ) {
            ProTextField(
                value = textWithSuffix,
                onValueChange = {
                    textWithSuffix = it
                },
                label = "ProTextField",
                suffix = "Suffix",
                theme = themeType.theme
            )

            ProTextField(
                value = textWithSuffix,
                onValueChange = {},
                label = "ProTextField",
                suffix = "Suffix",
                enabled = false,
                theme = themeType.theme
            )
        }

        var textWithPrefixAndSuffix by remember { mutableStateOf("") }
        CatalogItem(
            title = "ProTextField with prefix and suffix"
        ) {
            ProTextField(
                value = textWithPrefixAndSuffix,
                onValueChange = {
                    textWithPrefixAndSuffix = it
                },
                label = "ProTextField",
                prefix = "Prefix",
                suffix = "Suffix",
                theme = themeType.theme
            )

            ProTextField(
                value = textWithPrefixAndSuffix,
                onValueChange = {},
                label = "ProTextField",
                prefix = "Prefix",
                suffix = "Suffix",
                enabled = false,
                theme = themeType.theme
            )
        }

        var textWithLeadingIcon by remember { mutableStateOf("") }
        CatalogItem(
            title = "ProTextField with leading icon"
        ) {
            ProTextField(
                value = textWithLeadingIcon,
                onValueChange = {
                    textWithLeadingIcon = it
                },
                label = "ProTextField",
                leadingIcon = ProImageVector(
                    imageVector = Icons.Default.Add
                ),
                theme = themeType.theme
            )

            ProTextField(
                value = textWithLeadingIcon,
                onValueChange = {},
                label = "ProTextField",
                leadingIcon = ProImageVector(
                    imageVector = Icons.Default.Add
                ),
                enabled = false,
                theme = themeType.theme
            )
        }

        var textWithTrailingIcon by remember { mutableStateOf("") }
        CatalogItem(
            title = "ProTextField with trailing icon"
        ) {
            ProTextField(
                value = textWithTrailingIcon,
                onValueChange = {
                    textWithTrailingIcon = it
                },
                label = "ProTextField",
                trailingIcon = ProImageVector(
                    imageVector = Icons.Default.Add
                ),
                theme = themeType.theme
            )

            ProTextField(
                value = textWithTrailingIcon,
                onValueChange = {},
                label = "ProTextField",
                trailingIcon = ProImageVector(
                    imageVector = Icons.Default.Add
                ),
                enabled = false,
                theme = themeType.theme
            )
        }

        var textWithLeadingAndTrailingIcon by remember { mutableStateOf("") }
        CatalogItem(
            title = "ProTextField with leading and trailing icon",
            hasDivider = false
        ) {
            ProTextField(
                value = textWithLeadingAndTrailingIcon,
                onValueChange = {
                    textWithLeadingAndTrailingIcon = it
                },
                label = "ProTextField",
                leadingIcon = ProImageVector(
                    imageVector = Icons.Default.Add
                ),
                trailingIcon = ProImageVector(
                    imageVector = Icons.Default.Add
                ),
                theme = themeType.theme
            )

            ProTextField(
                value = textWithLeadingAndTrailingIcon,
                onValueChange = {},
                label = "ProTextField",
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
