package com.vookoapp.ui.findUsers

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import cdflynn.android.library.turn.TurnLayoutManager
import com.vookoapp.R
import com.vookoapp.databinding.FragmentFindUsersBinding


class FindUsersFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val binding: FragmentFindUsersBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_find_users, container, false)

        val clickListener = UserInfoListener { Toast.makeText(context, "Clicked!", Toast.LENGTH_LONG) }
        val adapter = UserInfoAdapter(clickListener)
        binding.userCarousel.adapter = adapter

        val viewModelFactory = FindUsersViewModelFactory()
        val viewModel = ViewModelProvider(this, viewModelFactory)
                .get(FindUsersViewModel::class.java)

        viewModel.users.observe(viewLifecycleOwner,  {
            it?.let {
                //adapter.data = it
                adapter.submitList(it) //update recycler with new data< using ListAdapter
            }
        })

        val turnLayout = TurnLayoutManager(
                context,
                TurnLayoutManager.Gravity.START,
                TurnLayoutManager.Orientation.VERTICAL,
                15,
                8,
                false
        )

        val linearLayoutManager = LinearLayoutManager(context)

        binding.userCarousel.layoutManager = linearLayoutManager


        return binding.root
    }
}