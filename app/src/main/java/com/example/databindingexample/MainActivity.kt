package com.example.databindingexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.databindingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewModelFactory : ViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModelFactory = ViewModelFactory(1)
        viewModel = ViewModelProvider(this,viewModelFactory).get(MainActivityViewModel::class.java)
        binding.viewModel = viewModel
        viewModel.count.observe(this, Observer {
            binding.counterText.text = it.toString()
        })

    }
}