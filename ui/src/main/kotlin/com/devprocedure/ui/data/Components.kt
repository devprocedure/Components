package com.devprocedure.ui.data

/**
 * Created by emre bahadir on 10/9/2023
 */
enum class Components(val componentName: String, val componentGroup: ComponentGroup, val defaultThemeName: String) {
    Button("Button", ComponentGroup.Button, "Primary"),
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
    TextField("Text Field", ComponentGroup.TextField, "Primary"),
    OutlinedTextField("Outlined Text Field", ComponentGroup.TextField, "Primary");

    companion object {
        fun getComponentByName(name: String) = values().find { it.componentName == name }
    }
}
