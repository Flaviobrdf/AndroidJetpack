package com.br.androidmd

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.br.androidmd.databinding.ActivityMainBinding
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertListeners()
    }

    private fun insertListeners (){
        binding.btButtons.setOnClickListener {
            startActivity(ActivityButtons.createIntent(this))
        }
        binding.btTextField.setOnClickListener {
            startActivity(ActivityTextField.createIntent(this))
        }
        binding.bottomSheet.setOnClickListener {
            ActivityModalBottomSheet.start(supportFragmentManager)
        }
    }
}