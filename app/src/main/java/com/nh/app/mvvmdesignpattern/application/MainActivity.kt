package com.nh.app.mvvmdesignpattern.application

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.nh.app.mvvmdesignpattern.R
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var myString : String

    @Inject
    lateinit var checkString: Integer

    @Inject
    lateinit var applicationContext: Application

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity",""+myString)
        Log.d("MainActivity",""+checkString)

        Toast.makeText(applicationContext,myString,Toast.LENGTH_LONG).show()

    }
}
