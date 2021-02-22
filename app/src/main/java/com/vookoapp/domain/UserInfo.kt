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

    val bio: String
        get() = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
}