package com.alimardon.singleactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alimardon.singleactivity.databinding.FragmentGroupBinding

class groupFragment : Fragment() {
        lateinit var binding:FragmentGroupBinding
        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            binding= FragmentGroupBinding.inflate(layoutInflater)
            return binding.root
        }
    }
