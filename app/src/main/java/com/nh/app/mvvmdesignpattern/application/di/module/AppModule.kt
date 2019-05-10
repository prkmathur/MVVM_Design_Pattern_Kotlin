package com.nh.app.mvvmdesignpattern.application.di.module

import dagger.Module
import dagger.Provides

@Module
class AppModule {

    /*
          Dagger always finds the dependencies first in their dependency Graph and if
          available provide that to the required @Provide annotation method

     */

    @Provides
    fun getMyString():String{
        return "Hello From Prakhar"
    }

    @Provides
    fun checkString(mystring: String):Int{
        return if(mystring.equals("Hello From Prakhar")){
            1
        }else{
            0
        }
    }


}