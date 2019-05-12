package com.nh.app.mvvmdesignpattern.application.di.module

import com.nh.app.mvvmdesignpattern.application.MainActivity
import com.nh.app.mvvmdesignpattern.view.authentication.RegisterFragment
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuilderModule {

    @ContributesAndroidInjector
    abstract fun contributeRegisterFragment():RegisterFragment

}