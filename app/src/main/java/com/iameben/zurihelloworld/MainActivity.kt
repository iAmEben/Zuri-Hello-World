package com.iameben.zurihelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var numCount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
//method for button clicks and updating the textview
    fun click(view: View) {
        val textview_button: TextView = findViewById(R.id.textview_button)
        textview_button.setText(numCount.toString())
        numCount = numCount+1

    }
}