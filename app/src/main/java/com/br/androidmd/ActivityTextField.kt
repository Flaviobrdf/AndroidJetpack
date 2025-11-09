package com.br.androidmd

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.br.androidmd.databinding.ActivityButtonsBinding
import com.br.androidmd.databinding.ActivityTextFieldBinding

class ActivityTextField : AppCompatActivity() {

    private val binding by lazy {
        ActivityTextFieldBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.inputErros.error = "Campo Obrigatório"

    }

    companion object {
        fun createIntent(context: Context): Intent = Intent(context, ActivityTextField::class.java)
    }
}