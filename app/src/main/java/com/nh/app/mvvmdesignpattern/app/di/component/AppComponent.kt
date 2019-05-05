package com.nh.app.mvvmdesignpattern.app.di.component

import com.nh.app.mvvmdesignpattern.app.di.module.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
}