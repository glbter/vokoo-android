package com.vookoapp.ui.findUsers

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.vookoapp.ui.login.LoginViewModel

class FindUsersViewModelFactory() : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(FindUsersViewModel::class.java)) {
            return FindUsersViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}