package com.rosewhat.vkgiphy.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rosewhat.vkgiphy.R
import com.rosewhat.vkgiphy.databinding.FragmentGiphyListBinding


class GiphyListFragment : Fragment() {

    private var _binding: FragmentGiphyListBinding? = null
    private val binding: FragmentGiphyListBinding
        get() = _binding ?: throw RuntimeException("FragmentGiphyListBinding is null")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGiphyListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}