package com.vookoapp.ui.loginWithEmail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.vookoapp.R
import com.vookoapp.databinding.FragmentLoginEmailBinding


class LoginEmailFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val binding: FragmentLoginEmailBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_login_email, container, false)

        val viewModelFactory = LoginEmailViewModelFactory()
        val viewModel = ViewModelProvider(this, viewModelFactory)
                .get(LoginEmailViewModel::class.java)

        binding.loginEmailViewModel = viewModel
        binding.lifecycleOwner = this

        viewModel.actionLogin.observe(viewLifecycleOwner, {
            if (it == true) {
                this.findNavController().navigate(
                     LoginEmailFragmentDirections.actionLoginEmailFragmentToFindUsersFragment())
                viewModel.doneActionLogin()
            }
        })

        return binding.root
    }

}