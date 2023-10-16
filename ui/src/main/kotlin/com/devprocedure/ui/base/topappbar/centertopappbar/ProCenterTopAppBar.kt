@file:OptIn(ExperimentalMaterial3Api::class)

package com.devprocedure.ui.base.topappbar.centertopappbar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
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
fun ProCenterTopAppBar(
    title: String,
    onNavigationClick: () -> Unit = {},
    onActionClick: (String) -> Unit = {},
    modifier: Modifier = Modifier,
    navigationIcon: ProImageVector? = null,
    actions: Map<String, ProImageVector>? = null,
    scrollBehavior: TopAppBarScrollBehavior? = null,
    theme: ProCenterTopAppBarTheme = ProTopAppBarDefaults.centerTopAppBarTheme()
) {
    CenterAlignedTopAppBar(
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
        colors = ProTopAppBarDefaults.centerTopAppBarColors(theme = theme)
    )
}

@UiThemePreview
@Composable
fun ProCenterTopAppBarPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProCenterTopAppBar(
            title = "Title"
        )
    }
}

@UiThemePreview
@Composable
fun ProCenterTopAppBarWithNavigationIconPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProCenterTopAppBar(
            title = "Title",
            navigationIcon = ProImageVector(
                imageVector = Icons.Default.Add
            )
        )
    }
}

@UiThemePreview
@Composable
fun ProCenterTopAppBarWithActionsPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProCenterTopAppBar(
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
fun ProCenterTopAppBarWithNavigationIconAndActionsPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProCenterTopAppBar(
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
