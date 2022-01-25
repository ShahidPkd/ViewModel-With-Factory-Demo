package com.demo.viewmodeldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonPlus = findViewById<Button>(R.id.buttonPlush)
        val buttonMinus = findViewById<Button>(R.id.buttonMinus)
        val textView = findViewById<TextView>(R.id.textView)
        // initializing the object of the view model
//        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // we can also replace get call from indexing operator like just below code
        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]


        //set text

        textView.text = mainViewModel.count.toString()

        buttonPlus.setOnClickListener {
            mainViewModel.increase()
            textView.text = mainViewModel.count.toString()

        }

        buttonMinus.setOnClickListener {
            mainViewModel.decrease()
            textView.text = mainViewModel.count.toString()

        }
    }
}