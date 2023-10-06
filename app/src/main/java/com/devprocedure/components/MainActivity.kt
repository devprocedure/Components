package com.devprocedure.components

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.composethemer.ProCardThemes
import com.composethemer.ProOutlinedCardThemes
import com.composethemer.ProTextButtonThemes
import com.devprocedure.components.ui.theme.ComponentsTheme
import com.devprocedure.ui.base.button.probutton.ProButton
import com.devprocedure.ui.base.button.protextbutton.ProTextButton
import com.devprocedure.ui.base.card.procard.ProCard
import com.devprocedure.ui.base.card.proelevatedcard.ProElevatedCard
import com.devprocedure.ui.base.card.prooutlinedcard.ProOutlinedCard
import com.devprocedure.ui.base.text.ProText
import com.devprocedure.ui.util.ProImageVector

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

                        OutlinedCard(
                            modifier = Modifier
                                .height(100.dp)
                                .width(200.dp)
                        ) {
                            Column {
                                Text(text = "Def Button")
                                Button(
                                    onClick = { },
                                    modifier = Modifier
                                        .padding(16.dp)
                                ) {
                                    Text(text = "Def Button")
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(16.dp))

                        ProCard(
                            modifier = Modifier
                                .height(100.dp)
                                .width(200.dp)
                        ) {
                            Column {
                                ProText(text = "Pro Button")
                                ProButton(
                                    modifier = Modifier
                                        .padding(16.dp),
                                    onClick = { },
                                    text = "Pro Button",
                                    leadingIcon = ProImageVector(
                                        imageVector = Icons.Filled.Favorite,
                                        contentDescription = null
                                    )
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(16.dp))

                        ProOutlinedCard(
                            modifier = Modifier
                                .height(100.dp)
                                .width(200.dp)
                        ) {
                            Column {
                                ProText(text = "Pro Button")
                                ProButton(
                                    modifier = Modifier
                                        .padding(16.dp),
                                    onClick = { },
                                    text = "Pro Button",
                                    leadingIcon = ProImageVector(
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
    }
}
