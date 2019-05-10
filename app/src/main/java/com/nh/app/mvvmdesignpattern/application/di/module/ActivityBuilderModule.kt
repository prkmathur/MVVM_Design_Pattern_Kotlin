package com.nh.app.mvvmdesignpattern.application.di.module

import com.nh.app.mvvmdesignpattern.application.MainActivity
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivty():MainActivity

}