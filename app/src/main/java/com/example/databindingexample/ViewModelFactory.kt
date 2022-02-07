package com.example.databindingexample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import java.lang.IllegalArgumentException

class ViewModelFactory(private val count : Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainActivityViewModel::class.java)){
            return MainActivityViewModel(count) as T
        }
        throw IllegalArgumentException("Unknown View Model Class")
    }
}