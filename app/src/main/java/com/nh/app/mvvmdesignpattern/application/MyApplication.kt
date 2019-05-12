package com.nh.app.mvvmdesignpattern.application

import com.nh.app.mvvmdesignpattern.application.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class MyApplication: DaggerApplication() {

    // Treat this as a Client

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {

        return DaggerAppComponent.builder().application(this).build()

    }
}