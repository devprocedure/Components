package com.devprocedure.ui.util

import kotlin.reflect.KClass

/**
 * Created by emre bahadir on 10/13/2023
 */
fun <Theme: Any>KClass<Theme>.getThemeList() = this.sealedSubclasses
    .map {
        it.objectInstance?.let {
            it::class.simpleName
        }
    }.mapNotNull { it }

fun <Theme: Any>KClass<Theme>.getThemeByName(themeName: String) = this.sealedSubclasses.find {
    it.objectInstance?.let { it::class.simpleName } == themeName
}?.objectInstance