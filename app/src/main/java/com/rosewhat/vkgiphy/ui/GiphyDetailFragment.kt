package com.rosewhat.vkgiphy.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rosewhat.vkgiphy.databinding.FragmentGiphyDetailBinding


class GiphyDetailFragment : Fragment() {

    private var _binding: FragmentGiphyDetailBinding? = null
    private val binding: FragmentGiphyDetailBinding
        get() = _binding ?: throw RuntimeException("FragmentGiphyDetailBinding is null")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGiphyDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
