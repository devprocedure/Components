@file:OptIn(ExperimentalMaterial3Api::class)

package com.devprocedure.ui.base.bottomappbar.bottomappbar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarScrollBehavior
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.devprocedure.designsystem.theme.CatalogTheme
import com.devprocedure.ui.base.bottomappbar.ProBottomAppBarDefaults
import com.devprocedure.ui.base.floatingactionbutton.floatingactionbutton.ProFloatingActionButton
import com.devprocedure.ui.base.iconbutton.iconbutton.ProIconButton
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.UiThemePreview

/**
 * Created by emre bahadir on 10/16/2023
 */
@Composable
fun ProBottomAppBar(
    actions: Map<String, ProImageVector>,
    onActionClick: (String) -> Unit = {},
    floatingActionButtonIcon: ProImageVector? = null,
    onFloatingActionButtonClick: () -> Unit = {},
    modifier: Modifier = Modifier,
    scrollBehavior: BottomAppBarScrollBehavior? = null,
    theme: ProBottomAppBarTheme = ProBottomAppBarDefaults.bottomAppBarTheme()
) {
    BottomAppBar(
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
        floatingActionButton = floatingActionButtonIcon?.let { imageVector ->
            {
                ProFloatingActionButton(
                    icon = imageVector,
                    onClick = onFloatingActionButtonClick,
                    theme = theme.floatingActionButtonTheme().value
                )
            }
        } ?: null,
        modifier = modifier,
        containerColor = theme.containerColor().value,
        contentColor = theme.contentColor().value,
        tonalElevation = theme.tonalElevation().value,
        contentPadding = theme.contentPadding().value,
        scrollBehavior = scrollBehavior
    )
}

@UiThemePreview
@Composable
fun ProBottomAppBarPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProBottomAppBar(
            actions = mapOf(
                "action1" to ProImageVector(
                    imageVector = Icons.Default.Add
                ),
                "action2" to ProImageVector(
                    imageVector = Icons.Default.Add
                )
            ),
            onActionClick = {},
            onFloatingActionButtonClick = {}
        )
    }
}

@UiThemePreview
@Composable
fun ProBottomAppBarWithFloatingActionButtonPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProBottomAppBar(
            actions = mapOf(
                "action1" to ProImageVector(
                    imageVector = Icons.Default.Add
                ),
                "action2" to ProImageVector(
                    imageVector = Icons.Default.Add
                )
            ),
            onActionClick = {},
            floatingActionButtonIcon = ProImageVector(
                imageVector = Icons.Default.Add
            ),
            onFloatingActionButtonClick = {}
        )
    }
}
