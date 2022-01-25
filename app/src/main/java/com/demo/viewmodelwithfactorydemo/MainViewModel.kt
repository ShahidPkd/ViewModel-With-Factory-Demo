package com.demo.viewmodelwithfactorydemo

import androidx.lifecycle.ViewModel

class MainViewModel(val initialValue : Int) : ViewModel() {

    var count: Int = initialValue

    fun increase(){
        count++
    }
    fun decrease(){
        count--
    }

}