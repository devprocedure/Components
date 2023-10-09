package com.devprocedure.ui.base.dropdownmenu.prodropdownmenuitem

import com.devprocedure.ui.util.ProImageVector

/**
 * Created by emre bahadir on 10/6/2023
 */
data class DropdownMenuItem(
    val id: Int,
    val text: String,
    val leadingIcon: ProImageVector? = null,
    val trailingIcon: ProImageVector? = null
)
