package com.vookoapp.ui

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.vookoapp.domain.UserInfo
import com.vookoapp.ui.findUsers.UserInfoAdapter

@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView, data: List<UserInfo>?){
    val adapter = recyclerView.adapter as UserInfoAdapter
    adapter.submitList(data)
}