package com.vookoapp.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.vookoapp.database.model.UserInfoLocal

@Dao
interface UserInfoDao {
    @Query("select * from userinfolocal")
    fun getUsers(): LiveData<List<UserInfoLocal>>
}