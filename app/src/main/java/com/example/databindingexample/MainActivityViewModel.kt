package com.example.databindingexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(countInit : Int) : ViewModel() {
    var count : MutableLiveData<Int> = MutableLiveData()

    init {
        count.value = countInit
    }


    fun updateCount(){
        count.value = count.value?.plus(1)
    }

}