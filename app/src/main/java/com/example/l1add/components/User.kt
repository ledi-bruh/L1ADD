package com.example.l1add.components

import androidx.annotation.DrawableRes

data class User (
    val name: String,
    @DrawableRes
    val avatar: Int,
)
