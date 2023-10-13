package com.devprocedure.ui.base.topappbar

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import com.composethemer.ProTopAppBarThemes
import com.devprocedure.ui.base.topappbar.topappbar.ProTopAppBarTheme

/**
 * Created by emre bahadir on 10/13/2023
 */
@OptIn(ExperimentalMaterial3Api::class)
object ProTopAppBarDefaults {
    @Composable
    internal fun topAppBarTheme() = ProTopAppBarThemes.Surface.theme

    @Composable
    internal fun topAppBarColors(
        theme: ProTopAppBarTheme
    ) = TopAppBarDefaults.topAppBarColors(
        containerColor = theme.containerColor().value,
        scrolledContainerColor = theme.scrolledContainerColor().value,
        navigationIconContentColor = theme.navigationIconContentColor().value,
        titleContentColor = theme.titleContentColor().value,
        actionIconContentColor = theme.actionIconContentColor().value
    )
}
