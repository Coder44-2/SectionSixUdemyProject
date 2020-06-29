package com.example.sectionsixudemyproject.controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {
    val TAG = "Lifecycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "${javaClass.simpleName} OnCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "${javaClass.simpleName} OnStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "${javaClass.simpleName} OnRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "${javaClass.simpleName} OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "${javaClass.simpleName} OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "${javaClass.simpleName} OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "${javaClass.simpleName} OnDestroy")
    }
}