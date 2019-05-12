package com.nh.app.mvvmdesignpattern.application.di.module

import androidx.lifecycle.ViewModel
import com.nh.app.mvvmdesignpattern.viewmodel.authentication.RegisterViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(RegisterViewModel::class)
    abstract fun bindUserViewModel(registerViewModel: RegisterViewModel): ViewModel
}
