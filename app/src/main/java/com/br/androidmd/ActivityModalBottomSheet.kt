package com.br.androidmd

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.br.androidmd.databinding.ActivityBotomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class ActivityModalBottomSheet : BottomSheetDialogFragment() {

    private val binding by lazy {
        ActivityBotomSheetBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        group: ViewGroup?,
        saved: Bundle?
    ): View {
        return binding.root
    }

    companion object {
        private const val TAG = "ModalBottomSheet"

        fun start(manager: FragmentManager) {
            ActivityModalBottomSheet().show(manager, TAG)
        }
    }

}