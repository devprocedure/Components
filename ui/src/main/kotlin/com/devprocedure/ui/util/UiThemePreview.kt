package com.devprocedure.ui.util

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview

/**
 * Created by emre bahadir on 10/6/2023
 */
@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO, name = "Light theme")
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, name = "Dark theme")
annotation class UiThemePreview
