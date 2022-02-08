package com.example.databindingexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(countInit : Int) : ViewModel() {
    private var count : MutableLiveData<Int> = MutableLiveData()
    val countLiveData : LiveData<Int>
    get() = count

    init {
        count.value = countInit
    }


    fun updateCount(){
        count.value = count.value?.plus(1)
    }

}