package com.vookoapp.ui.userPreview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.vookoapp.R
import com.vookoapp.databinding.FragmentUserPreviewBinding


class UserPreviewFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val binding: FragmentUserPreviewBinding = DataBindingUtil.inflate(
                layoutInflater, R.layout.fragment_user_preview, container, false)
        return binding.root
    }
}