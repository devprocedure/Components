package com.devprocedure.ui.testview

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * Created by emre bahadir on 9/28/2023
 */
@Composable
fun TestView(
    modifier: Modifier = Modifier,
    text: String,
    theme: TestViewTheme
) {
    Text(
        modifier = modifier
            .background(theme.backgroundColor().value)
            .border(theme.border().value)
            .padding(theme.padding().value),
        text = text,
        color = theme.textColor().value,
        style = theme.textStyle().value
    )
}