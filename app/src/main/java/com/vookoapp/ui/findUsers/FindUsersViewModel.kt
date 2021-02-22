package com.vookoapp.ui.findUsers

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.vookoapp.R
import com.vookoapp.domain.UserInfo

class FindUsersViewModel() : ViewModel() {
    private val _users = MutableLiveData<List<UserInfo>>()
    val users: LiveData<List<UserInfo>>
        get() = _users

    init {
        loadUsers()
    }
    fun loadUsers() {
        _users.value = listOf(
                UserInfo("1", "Jane", 20, R.drawable.girl1),
                UserInfo("2", "Jane", 20, R.drawable.girl1),
                UserInfo("3", "Jane", 20, R.drawable.girl1),
                UserInfo("4", "Jane", 20, R.drawable.girl1),
                UserInfo("5", "Jane", 20, R.drawable.girl1),
                UserInfo("6", "Jane", 20, R.drawable.girl1),
                UserInfo("7", "Jane", 20, R.drawable.girl1),
                UserInfo("8", "Jane", 20, R.drawable.girl1),
                UserInfo("9", "Jane", 20, R.drawable.girl1),
                UserInfo("10", "Jane", 20, R.drawable.girl1),
                UserInfo("11", "Jane", 20, R.drawable.girl1),
                UserInfo("12", "Jane", 20, R.drawable.girl1),
                UserInfo("13", "Jane", 20, R.drawable.girl1),
                UserInfo("14", "Jane", 20, R.drawable.girl1),
                UserInfo("15", "Jane", 20, R.drawable.girl1),
                UserInfo("16", "Jane", 20, R.drawable.girl1),
                UserInfo("17", "Jane", 20, R.drawable.girl1),
                UserInfo("18", "Jane", 20, R.drawable.girl1),
                UserInfo("19", "Jane", 20, R.drawable.girl1),
        )
    }
}