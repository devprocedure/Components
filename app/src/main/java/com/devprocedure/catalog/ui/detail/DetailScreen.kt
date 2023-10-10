package com.devprocedure.catalog.ui.detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.devprocedure.catalog.ui.detail.base.button.ProButtonCatalog
import com.devprocedure.ui.data.Components

/**
 * Created by emre bahadir on 10/9/2023
 */
@Composable
fun DetailScreen(
    componentName: String
) {
    val component = Components.getComponentByName(componentName)
    Scaffold { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            when (component) {
                Components.Button -> ProButtonCatalog()
                Components.OutlinedButton -> TODO()
                Components.TextButton -> TODO()
                Components.Card -> TODO()
                Components.ElevatedCard -> TODO()
                Components.OutlinedCard -> TODO()
                Components.FloatingActionButton -> TODO()
                Components.LargeFloatingActionButton -> TODO()
                Components.SmallFloatingActionButton -> TODO()
                Components.ExtendedFloatingActionButton -> TODO()
                Components.Icon -> TODO()
                Components.TextField -> TODO()
                Components.OutlinedTextField -> TODO()
                null -> TODO()
            }
        }
    }
}
