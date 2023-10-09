package com.devprocedure.ui.base.text

import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import com.devprocedure.designsystem.theme.CatalogTheme
import com.devprocedure.ui.util.UiThemePreview

/**
 * Created by emre bahadir on 10/5/2023
 */
@Composable
fun ProText(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    style: TextStyle = LocalTextStyle.current,
    textAlign: TextAlign? = null,
    textDecoration: TextDecoration? = null,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    maxLines: Int = Int.MAX_VALUE,
    minLines: Int = 1,
    overflow: TextOverflow = TextOverflow.Clip
) {
    Text(
        text = text,
        modifier = modifier,
        color = color,
        style = style,
        textAlign = textAlign,
        textDecoration = textDecoration,
        letterSpacing = letterSpacing,
        maxLines = maxLines,
        minLines = minLines,
        overflow = overflow
    )
}

@UiThemePreview
@Composable
fun ProTextPreview() {
    CatalogTheme(
        dynamicColor = false
    ) {
        ProText(
            text = "ProText"
        )
    }
}
