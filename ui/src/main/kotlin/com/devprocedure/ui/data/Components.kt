package com.devprocedure.ui.data

/**
 * Created by emre bahadir on 10/9/2023
 */
enum class Components(val componentName: String, val componentGroup: ComponentGroup) {
    Button("Button", ComponentGroup.Button),
    OutlinedButton("Outlined Button", ComponentGroup.Button),
    TextButton("Text Button", ComponentGroup.Button),
    Card("Card", ComponentGroup.Card),
    ElevatedCard("Elevated Card", ComponentGroup.Card),
    OutlinedCard("Outlined Card", ComponentGroup.Card),
    FloatingActionButton("Floating Action Button", ComponentGroup.FloatingActionButton),
    LargeFloatingActionButton("Large Floating Action Button", ComponentGroup.FloatingActionButton),
    SmallFloatingActionButton("Small Floating Action Button", ComponentGroup.FloatingActionButton),
    ExtendedFloatingActionButton("Extended Floating Action Button", ComponentGroup.FloatingActionButton),
    Icon("Icon", ComponentGroup.Icon),
    TextField("Text Field", ComponentGroup.TextField),
    OutlinedTextField("Outlined Text Field", ComponentGroup.TextField);

    companion object {
        fun getComponentByName(name: String) = values().find { it.componentName == name }
    }
}