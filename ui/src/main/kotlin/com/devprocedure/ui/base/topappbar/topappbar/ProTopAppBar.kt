package com.devprocedure.ui.base.topappbar.topappbar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.devprocedure.designsystem.theme.CatalogTheme
import com.devprocedure.ui.base.iconbutton.iconbutton.ProIconButton
import com.devprocedure.ui.base.text.ProText
import com.devprocedure.ui.base.topappbar.ProTopAppBarDefaults
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.UiThemePreview

/**
 * Created by emre bahadir on 10/13/2023
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProTopAppBar(
    title: String,
    onNavigationClick: () -> Unit = {},
    onActionClick: (String) -> Unit = {},
    modifier: Modifier = Modifier,
    navigationIcon: ProImageVector? = null,
    actions: Map<String, ProImageVector>? = null,
    theme: ProTopAppBarTheme = ProTopAppBarDefaults.topAppBarTheme()
) {
    TopAppBar(
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
        colors = ProTopAppBarDefaults.topAppBarColors(theme = theme)
    )
}

@UiThemePreview
@Composable
fun ProTopAppBarPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProTopAppBar(
            title = "Title"
        )
    }
}

@UiThemePreview
@Composable
fun ProTopAppBarWithNavigationIconPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProTopAppBar(
            title = "Title",
            navigationIcon = ProImageVector(
                imageVector = Icons.Default.Add
            )
        )
    }
}

@UiThemePreview
@Composable
fun ProTopAppBarWithActionsPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProTopAppBar(
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
fun ProTopAppBarWithNavigationIconAndActionsPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProTopAppBar(
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
