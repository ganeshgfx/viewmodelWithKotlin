package com.example.viewmodelwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton

class MainActivity : AppCompatActivity() {

    lateinit var button: ExtendedFloatingActionButton
    lateinit var text: TextView

    //View Model Object
    lateinit var mainViewModel: MainActivityView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this).get(MainActivityView::class.java)

        button = findViewById(R.id.incrementBTN)
        button.setOnClickListener {
            mainViewModel.increaseCount()
            setCount()
        }
        text = findViewById(R.id.text)
        setCount()
    }
    fun setCount(){
        text.text = mainViewModel.count.toString()
    }
}