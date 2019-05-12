package com.nh.app.mvvmdesignpattern.application.di.module
import com.nh.app.mvvmdesignpattern.model.remote.APIServices
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module(includes = [ViewModelModule::class])
class AppModule {

    /*
          Dagger always finds the dependencies first in their dependency Graph and if
          available provide that to the required @Provide annotation method

     */

    @Singleton
    @Provides
    fun provideGithubService(): APIServices {
        return Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(APIServices::class.java)
    }

    @Singleton
    @Provides
    fun getMyString():String{
        return "Hello From Prakhar"
    }

    @Singleton
    @Provides
    fun checkString(myString: String):Int{
        return if(myString == "Hello From Prakhar"){
            1
        }else{
            0
        }
    }


}