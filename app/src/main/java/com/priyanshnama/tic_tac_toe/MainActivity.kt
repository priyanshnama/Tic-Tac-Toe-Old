package com.priyanshnama.tic_tac_toe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun O(View:View){
        Log.i("idadn","O is clicked")
    }

    fun X(View:View){
        Log.i("idadn","X is clicked")
    }
}