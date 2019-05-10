package com.nh.app.mvvmdesignpattern.application.di.component

import android.app.Application
import com.nh.app.mvvmdesignpattern.application.MyApplication
import com.nh.app.mvvmdesignpattern.application.di.module.ActivityBuilderModule
import com.nh.app.mvvmdesignpattern.application.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

// Treat this as a Server

@Singleton
@Component(modules =[
    AndroidSupportInjectionModule::class,
    ActivityBuilderModule::class,
    AppModule::class
])
interface AppComponent: AndroidInjector<MyApplication>{

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent

    }

}