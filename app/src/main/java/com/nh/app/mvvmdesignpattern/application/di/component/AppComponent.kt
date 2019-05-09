package com.nh.app.mvvmdesignpattern.application.di.component

import android.app.Application
import com.nh.app.mvvmdesignpattern.application.MyApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules =[
    AndroidSupportInjectionModule::class])
interface AppComponent: AndroidInjector<MyApplication>{

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent

    }

}