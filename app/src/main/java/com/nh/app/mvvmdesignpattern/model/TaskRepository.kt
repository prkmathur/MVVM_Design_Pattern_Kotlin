package com.nh.app.mvvmdesignpattern.model

import android.util.Log
import com.nh.app.mvvmdesignpattern.model.POJO.User
import com.nh.app.mvvmdesignpattern.model.remote.APIServices
import javax.inject.Inject

class TaskRepository @Inject constructor(apiServices : APIServices) {

    fun registerUser(user: User){
        Log.d("TaskRepository",""+user.email)
    }

}