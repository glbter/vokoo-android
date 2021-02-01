package com.vookoapp.ui.loginWithEmail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.vookoapp.ui.login.LoginViewModel

class LoginEmailViewModelFactory : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoginEmailViewModel::class.java)) {
            return LoginEmailViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}