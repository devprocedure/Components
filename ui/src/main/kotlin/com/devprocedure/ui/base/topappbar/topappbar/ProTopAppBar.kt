package com.devprocedure.ui.base.topappbar.topappbar

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.devprocedure.ui.base.icon.icon.ProIcon
import com.devprocedure.ui.base.text.ProText
import com.devprocedure.ui.util.ProImageVector

/**
 * Created by emre bahadir on 10/13/2023
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProTopAppBar(
    title: String,
    modifier: Modifier = Modifier,
    navigationIcon: ProImageVector? = null,
    actions: List<ProImageVector>? = null,
    theme: ProTopAppBarTheme,
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
                IconButton(onClick = { /*TODO*/ }) {

                }
                ProIcon(
                    imageVector = imageVector
                )
            }
        },
    )
}