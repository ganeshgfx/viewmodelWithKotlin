package com.example.viewmodelwithkotlin

import androidx.lifecycle.ViewModel

class MainActivityView: ViewModel() {
    var count = 0
    fun increaseCount() {
        count++
    }
}