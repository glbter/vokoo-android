package com.vookoapp.ui.findUsers

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.vookoapp.R
import com.vookoapp.domain.UserInfo

class FindUsersViewModel() : ViewModel() {
    private val _users = MutableLiveData<List<UserInfo>?>()
    val users: LiveData<List<UserInfo>?>
        get() = _users

    fun loadUsers() {
        _users.value = listOf(
                UserInfo("1", "Jane", 20, R.drawable.girl1),
                UserInfo("1", "Jane", 20, R.drawable.girl1),
                UserInfo("1", "Jane", 20, R.drawable.girl1),
                UserInfo("1", "Jane", 20, R.drawable.girl1),
                UserInfo("1", "Jane", 20, R.drawable.girl1),
                UserInfo("1", "Jane", 20, R.drawable.girl1),
                UserInfo("1", "Jane", 20, R.drawable.girl1),
                UserInfo("1", "Jane", 20, R.drawable.girl1),
                UserInfo("1", "Jane", 20, R.drawable.girl1),
                UserInfo("1", "Jane", 20, R.drawable.girl1),
                UserInfo("1", "Jane", 20, R.drawable.girl1),
                UserInfo("1", "Jane", 20, R.drawable.girl1),
                UserInfo("1", "Jane", 20, R.drawable.girl1),
                UserInfo("1", "Jane", 20, R.drawable.girl1),
                UserInfo("1", "Jane", 20, R.drawable.girl1),
                UserInfo("1", "Jane", 20, R.drawable.girl1),
                UserInfo("1", "Jane", 20, R.drawable.girl1),
                UserInfo("1", "Jane", 20, R.drawable.girl1),
                UserInfo("1", "Jane", 20, R.drawable.girl1),
        )
    }
}