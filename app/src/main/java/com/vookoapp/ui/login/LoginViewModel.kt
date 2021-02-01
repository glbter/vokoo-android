package com.vookoapp.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    private val _navigateToLoginEmail = MutableLiveData<Boolean?>()
    val navigateToLoginEmail: LiveData<Boolean?>
        get() = _navigateToLoginEmail


    fun navigateToLoginEmail() {
        _navigateToLoginEmail.value = true
    }

    fun doneNavigationToLoginEmail() {
        _navigateToLoginEmail.value = null
    }
}

//private val viewModel: DevByteViewModel by lazy {
//    val activity = requireNotNull(this.activity) {
//        "You can only access the viewModel after onActivityCreated()"
//    }
//    ViewModelProvider(this, DevByteViewModel.Factory(activity.application))
//        .get(DevByteViewModel::class.java)
//}
