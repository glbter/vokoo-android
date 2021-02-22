package com.vookoapp.ui.findUsers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager

import cdflynn.android.library.turn.TurnLayoutManager
import com.vookoapp.R
import com.vookoapp.databinding.FragmentFindUsersBinding


class FindUsersFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val binding: FragmentFindUsersBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_find_users, container, false)

        val clickListener = UserInfoListener {
            Toast.makeText(context, "Clicked!", Toast.LENGTH_SHORT).show()
        }
        val adapter = UserInfoAdapter(clickListener)
        binding.userCarousel.adapter = adapter

        val viewModelFactory = FindUsersViewModelFactory()
        val viewModel = ViewModelProvider(this, viewModelFactory)
                .get(FindUsersViewModel::class.java)

        viewModel.loadUsers()



        val turnLayoutManager = TurnLayoutManager(
                context,
                TurnLayoutManager.Gravity.START,
                TurnLayoutManager.Orientation.VERTICAL,
                2000,
                750,
                false
        )

        val linearLayoutManager = LinearLayoutManager(context)

        binding.userCarousel.layoutManager = turnLayoutManager
        binding.viewModel = viewModel
        binding.lifecycleOwner = this.viewLifecycleOwner

        return binding.root
    }
}