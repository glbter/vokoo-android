package com.vookoapp.ui.findUsers

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.vookoapp.databinding.FragmentUserPreviewBinding
import com.vookoapp.domain.UserInfo

class UserInfoAdapter(val clickListener: UserInfoListener) : ListAdapter<UserInfo, RecyclerView.ViewHolder>(UserInfoDiffCallBack()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder.from(parent)
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
       when(holder){
           is ViewHolder -> {
               val userItem = getItem(position) as UserInfo
               holder.bind(userItem, clickListener)
           }
       }
    }


    class ViewHolder private constructor(val binding: FragmentUserPreviewBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: UserInfo, clickListener: UserInfoListener) {
            binding.clickListener = clickListener
            binding.user = item

            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = FragmentUserPreviewBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }
}

class UserInfoDiffCallBack() : DiffUtil.ItemCallback<UserInfo>() {

    override fun areItemsTheSame(oldItem: UserInfo, newItem: UserInfo): Boolean {
        return oldItem.id == newItem.id
    }

    @SuppressLint("DiffUtilEquals")
    override fun areContentsTheSame(oldItem: UserInfo, newItem: UserInfo): Boolean {
        return oldItem == newItem
    }

}


class UserInfoListener(val clickListener: (id: String) -> Unit) {
    fun onCLick(user: UserInfo) = clickListener(user.id)
}

sealed class DataItem {
    abstract val id: String

    data class SleepNightItem(val userInfo: UserInfo): DataItem(){
        override val id = userInfo.id
    }

}