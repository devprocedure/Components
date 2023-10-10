package com.devprocedure.ui.base.icon.icon

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.devprocedure.designsystem.theme.CatalogTheme
import com.devprocedure.ui.base.icon.ProIconDefaults
import com.devprocedure.ui.util.ProImageVector
import com.devprocedure.ui.util.UiThemePreview

/**
 * Created by emre bahadir on 10/6/2023
 */
@Composable
fun ProIcon(
    imageVector: ProImageVector,
    modifier: Modifier = Modifier,
    theme: ProIconTheme = ProIconDefaults.iconTheme()
) {
    Icon(
        imageVector = imageVector.imageVector,
        contentDescription = imageVector.contentDescription,
        modifier = modifier,
        tint = theme.tint().value
    )
}

@UiThemePreview
@Composable
fun ProIconPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProIcon(
            imageVector = ProImageVector(
                imageVector = Icons.Default.Add
            )
        )
    }
}
