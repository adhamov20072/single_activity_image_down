package com.alimardon.singleactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.alimardon.singleactivity.databinding.FragmentImageBinding
import com.bumptech.glide.Glide

class imageFragment : Fragment() {
    lateinit var binding:FragmentImageBinding
    val args:imageFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentImageBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text=args.imagelink
        Glide.with(requireActivity()).load(text).into(binding.imageview)
    }
}