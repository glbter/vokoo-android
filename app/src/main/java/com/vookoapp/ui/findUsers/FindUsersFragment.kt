package com.vookoapp.ui.findUsers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.vookoapp.R
import com.vookoapp.databinding.FragmentFindUsersBinding


class FindUsersFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val binding: FragmentFindUsersBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_find_users, container, false)

        return binding.root
    }
}