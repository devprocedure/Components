package com.devprocedure.components

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.composethemer.ProButtonThemes
import com.composethemer.ProOutlinedButtonThemes
import com.devprocedure.components.ui.theme.ComponentsTheme
import com.devprocedure.ui.base.button.probutton.ProButton
import com.devprocedure.ui.base.button.prooutlinedbutton.ProOutlinedButton
import com.devprocedure.ui.util.ProIcon

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComponentsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        Text(text = "Hello World!")
                        Spacer(modifier = Modifier.height(16.dp))
                        Button(onClick = { }) {
                            Text(text = "Def Button")
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        ProOutlinedButton(
                            onClick = { },
                            text = "Pro Button",
                            leadingIcon = ProIcon(
                                imageVector = Icons.Filled.Favorite,
                                contentDescription = null
                            )
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        ProOutlinedButton(
                            onClick = { },
                            text = "Pro Button Secondary",
                            trailingIcon = ProIcon(
                                imageVector = Icons.Filled.Favorite,
                                contentDescription = null
                            ),
                            theme = ProOutlinedButtonThemes.Secondary.theme
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        ProOutlinedButton(
                            onClick = { },
                            text = "Pro Button Tertiary",
                            theme = ProOutlinedButtonThemes.Tertiary.theme,
                            leadingIcon = ProIcon(
                                imageVector = Icons.Filled.Favorite,
                                contentDescription = null
                            ),
                            trailingIcon = ProIcon(
                                imageVector = Icons.Filled.Favorite,
                                contentDescription = null
                            )
                        )
                    }
                }
            }
        }
    }
}
