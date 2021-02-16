package com.vookoapp.domain

import androidx.annotation.DrawableRes

data class UserInfo(
    val id: String,
    val name: String,
    val age: Int,
    @DrawableRes val imageId: Int
) {
    val shortInfo: String
        get() = "$name, $id"
}