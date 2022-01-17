package com.example.validation_jan16_trint01.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.validation_jan16_trint01.databinding.FragmentMailboxesBinding

class MailboxesFragment : Fragment() {

    private var _binding : FragmentMailboxesBinding? = null
    private val binding : FragmentMailboxesBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMailboxesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnDone.setOnClickListener {
            Log.d("btnDone", "btnDone clicked")
            parentFragmentManager.popBackStack()
            Log.d("Popped Back Stack", "popBackStack() executed")
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}