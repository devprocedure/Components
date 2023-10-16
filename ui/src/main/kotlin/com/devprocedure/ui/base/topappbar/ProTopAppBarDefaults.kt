package com.devprocedure.ui.base.topappbar

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import com.composethemer.ProCenterTopAppBarThemes
import com.composethemer.ProLargeTopAppBarThemes
import com.composethemer.ProMediumTopAppBarThemes
import com.composethemer.ProTopAppBarThemes
import com.devprocedure.ui.base.topappbar.centertopappbar.ProCenterTopAppBarTheme
import com.devprocedure.ui.base.topappbar.largetopappbar.ProLargeTopAppBarTheme
import com.devprocedure.ui.base.topappbar.mediumtopappbar.ProMediumTopAppBarTheme
import com.devprocedure.ui.base.topappbar.topappbar.ProTopAppBarTheme

/**
 * Created by emre bahadir on 10/13/2023
 */
@OptIn(ExperimentalMaterial3Api::class)
object ProTopAppBarDefaults {
    @Composable
    internal fun topAppBarTheme() = ProTopAppBarThemes.Surface.theme

    @Composable
    internal fun centerTopAppBarTheme() = ProCenterTopAppBarThemes.Surface.theme

    @Composable
    internal fun mediumTopAppBarTheme() = ProMediumTopAppBarThemes.Surface.theme

    @Composable
    internal fun largeTopAppBarTheme() = ProLargeTopAppBarThemes.Surface.theme

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

    @Composable
    internal fun centerTopAppBarColors(
        theme: ProCenterTopAppBarTheme
    ) = TopAppBarDefaults.centerAlignedTopAppBarColors(
        containerColor = theme.containerColor().value,
        scrolledContainerColor = theme.scrolledContainerColor().value,
        navigationIconContentColor = theme.navigationIconContentColor().value,
        titleContentColor = theme.titleContentColor().value,
        actionIconContentColor = theme.actionIconContentColor().value
    )

    @Composable
    internal fun mediumTopAppBarColors(
        theme: ProMediumTopAppBarTheme
    ) = TopAppBarDefaults.mediumTopAppBarColors(
        containerColor = theme.containerColor().value,
        scrolledContainerColor = theme.scrolledContainerColor().value,
        navigationIconContentColor = theme.navigationIconContentColor().value,
        titleContentColor = theme.titleContentColor().value,
        actionIconContentColor = theme.actionIconContentColor().value
    )

    @Composable
    internal fun largeTopAppBarColors(
        theme: ProLargeTopAppBarTheme
    ) = TopAppBarDefaults.largeTopAppBarColors(
        containerColor = theme.containerColor().value,
        scrolledContainerColor = theme.scrolledContainerColor().value,
        navigationIconContentColor = theme.navigationIconContentColor().value,
        titleContentColor = theme.titleContentColor().value,
        actionIconContentColor = theme.actionIconContentColor().value
    )
}
