package com.vookoapp.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.vookoapp.domain.UserInfo

@Entity
data class UserInfoLocal(
    @PrimaryKey val id: String,
    val name: String,
    val age: Int
)

fun List<UserInfoLocal>.asDomainModel(): List<UserInfo> {
    return map {
        UserInfo(
            id = it.id,
            name = it.name,
            age = it.age
        )
    }
}