package com.devprocedure.ui.data

/**
 * Created by emre bahadir on 10/9/2023
 */
enum class Components(val componentName: String, val componentGroup: ComponentGroup, val defaultThemeName: String) {
    Button("Button", ComponentGroup.Button, "Primary"),
    ElevatedButton("Elevated Button", ComponentGroup.Button, "Primary"),
    FilledTonalButton("Filled Tonal Button", ComponentGroup.Button, "SecondaryContainer"),
    OutlinedButton("Outlined Button", ComponentGroup.Button, "Primary"),
    TextButton("Text Button", ComponentGroup.Button, "Primary"),
    Card("Card", ComponentGroup.Card, "SurfaceVariant"),
    ElevatedCard("Elevated Card", ComponentGroup.Card, "Surface"),
    OutlinedCard("Outlined Card", ComponentGroup.Card, "Surface"),
    FloatingActionButton("Floating Action Button", ComponentGroup.FloatingActionButton, "PrimaryContainer"),
    LargeFloatingActionButton("Large Floating Action Button", ComponentGroup.FloatingActionButton, "PrimaryContainer"),
    SmallFloatingActionButton("Small Floating Action Button", ComponentGroup.FloatingActionButton, "PrimaryContainer"),
    ExtendedFloatingActionButton("Extended Floating Action Button", ComponentGroup.FloatingActionButton, "PrimaryContainer"),
    Icon("Icon", ComponentGroup.Icon, "LocalContent"),
    IconButton("Icon Button", ComponentGroup.IconButton, "Transparent"),
    IconToggleButton("Icon Toggle Button", ComponentGroup.IconButton, "Primary"),
    FilledIconButton("Filled Icon Button", ComponentGroup.IconButton, "Primary"),
    FilledTonalIconButton("Filled Tonal Icon Button", ComponentGroup.IconButton, "SecondaryContainer"),
    FilledTonalIconToggleButton("Filled Tonal Icon Toggle Button", ComponentGroup.IconButton, "SecondaryContainer"),
    OutlinedIconButton("Outlined Icon Button", ComponentGroup.IconButton, "Transparent"),
    OutlinedIconToggleButton("Outlined Icon Toggle Button", ComponentGroup.IconButton, "InverseSurface"),
    TextField("Text Field", ComponentGroup.TextField, "Primary"),
    OutlinedTextField("Outlined Text Field", ComponentGroup.TextField, "Primary"),
    TopAppBar("Top App Bar", ComponentGroup.TopAppBar, "Surface"),
    CenterTopAppBar("Center Top App Bar", ComponentGroup.TopAppBar, "Surface"),
    MediumTopAppBar("Medium Top App Bar", ComponentGroup.TopAppBar, "Surface"),
    LargeTopAppBar("Large Top App Bar", ComponentGroup.TopAppBar, "Surface"),
    BottomAppBar("Bottom App Bar", ComponentGroup.BottomAppBar, "Surface");

    companion object {
        fun getComponentByName(name: String) = values().find { it.componentName == name }
    }
}
