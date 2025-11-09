package com.br.androidmd

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.br.androidmd.databinding.ActivityButtonsBinding
import com.br.androidmd.databinding.ActivityMainBinding

class ActivityButtons : AppCompatActivity() {

    private val binding by lazy {
        ActivityButtonsBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }

    companion object {
        fun createIntent(context: Context): Intent = Intent(context, ActivityButtons::class.java)
    }
}