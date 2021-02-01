package com.vookoapp.ui.login

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.vookoapp.R
import com.vookoapp.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val binding: FragmentLoginBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_login, container, false)

        val viewModelFactory = LoginViewModelFactory()
        val viewModel = ViewModelProvider(this, viewModelFactory)
            .get(LoginViewModel::class.java)

        binding.loginViewModel = viewModel
        binding.lifecycleOwner = this

        viewModel.navigateToLoginEmail.observe(viewLifecycleOwner, {
            if(it == true) {
                this.findNavController().navigate(
                    LoginFragmentDirections.actionLoginFragmentToLoginEmailFragment())
                viewModel.doneNavigationToLoginEmail()
            }
        })

        return binding.root
    }
}
