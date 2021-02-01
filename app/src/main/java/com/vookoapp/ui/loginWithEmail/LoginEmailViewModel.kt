package com.vookoapp.ui.loginWithEmail

import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginEmailViewModel : ViewModel() {

    private val _actionLogin = MutableLiveData<Boolean?>()
    val actionLogin: LiveData<Boolean?>
        get() = _actionLogin


    fun actionLogin() {
        _actionLogin.value = true
    }

    fun doneActionLogin() {
        _actionLogin.value = null
    }
}