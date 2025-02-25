package com.example.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragment.databinding.FragmentBlankBinding

class CountriesFragment : Fragment() {

    private val countries = "Austria,Belarus,Bulgaria,Cambodia,Cameroon,Costa Rica"

    private var _binding: FragmentBlankBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBlankBinding.inflate(inflater, container, false)

        binding.textView.text = countries
        return binding.root
    }
}