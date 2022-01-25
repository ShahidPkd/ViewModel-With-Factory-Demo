package com.demo.viewmodeldemo

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var count: Int = 0

    fun increase(){
        count++
    }
    fun decrease(){
        count--
    }

}