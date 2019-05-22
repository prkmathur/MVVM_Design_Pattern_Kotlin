package com.nh.app.mvvmdesignpattern.application

import android.os.Bundle
import com.nh.app.mvvmdesignpattern.R
import dagger.android.support.DaggerAppCompatActivity

class MainActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
