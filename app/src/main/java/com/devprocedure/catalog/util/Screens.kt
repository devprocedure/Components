package com.devprocedure.catalog.util

/**
 * Created by emre bahadir on 10/9/2023
 */
sealed class Screens(val route: String) {
    object Catalog : Screens("catalog")

    object Detail : Screens("detail")
}