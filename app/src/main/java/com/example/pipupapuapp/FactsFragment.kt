package com.example.pipupapuapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pipupapuapp.databinding.FragmentCookieBinding
import com.example.pipupapuapp.databinding.FragmentFactsBinding


class FactsFragment : Fragment() {

    private var _binding: FragmentFactsBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFactsBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}