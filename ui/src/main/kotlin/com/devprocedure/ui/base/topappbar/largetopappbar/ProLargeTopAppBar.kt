@file:OptIn(ExperimentalMaterial3Api::class)

package com.devprocedure.ui.base.topappbar.largetopappbar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.devprocedure.designsystem.theme.CatalogTheme
import com.devprocedure.ui.base.iconbutton.iconbutton.ProIconButton
import com.devprocedure.ui.base.text.ProText
import com.devprocedure.ui.base.topappbar.ProTopAppBarDefaults
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.UiThemePreview

/**
 * Created by emre bahadir on 10/16/2023
 */
@Composable
fun ProLargeTopAppBar(
    title: String,
    onNavigationClick: () -> Unit = {},
    onActionClick: (String) -> Unit = {},
    modifier: Modifier = Modifier,
    navigationIcon: ProImageVector? = null,
    actions: Map<String, ProImageVector>? = null,
    scrollBehavior: TopAppBarScrollBehavior? = null,
    theme: ProLargeTopAppBarTheme = ProTopAppBarDefaults.largeTopAppBarTheme()
) {
    LargeTopAppBar(
        title = {
            ProText(
                text = title,
                style = theme.titleStyle().value
            )
        },
        navigationIcon = {
            navigationIcon?.let { imageVector ->
                ProIconButton(
                    onClick = onNavigationClick,
                    icon = navigationIcon
                )
            }
        },
        actions = {
            actions?.let {
                it.forEach { action ->
                    ProIconButton(
                        icon = action.value,
                        onClick = {
                            onActionClick(action.key)
                        }
                    )
                }
            }
        },
        modifier = modifier,
        scrollBehavior = scrollBehavior,
        colors = ProTopAppBarDefaults.largeTopAppBarColors(theme = theme)
    )
}

@UiThemePreview
@Composable
fun ProLargeTopAppBarPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProLargeTopAppBar(
            title = "Title"
        )
    }
}

@UiThemePreview
@Composable
fun ProLargeTopAppBarWithNavigationIconPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProLargeTopAppBar(
            title = "Title",
            navigationIcon = ProImageVector(
                imageVector = Icons.Default.Add
            )
        )
    }
}

@UiThemePreview
@Composable
fun ProLargeTopAppBarWithActionsPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProLargeTopAppBar(
            title = "Title",
            actions = mapOf(
                "action1" to ProImageVector(
                    imageVector = Icons.Default.Add
                ),
                "action2" to ProImageVector(
                    imageVector = Icons.Default.Add
                )
            )
        )
    }
}

@UiThemePreview
@Composable
fun ProLargeTopAppBarWithNavigationIconAndActionsPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProLargeTopAppBar(
            title = "Title",
            navigationIcon = ProImageVector(
                imageVector = Icons.Default.Add
            ),
            actions = mapOf(
                "action1" to ProImageVector(
                    imageVector = Icons.Default.Add
                ),
                "action2" to ProImageVector(
                    imageVector = Icons.Default.Add
                )
            )
        )
    }
}
