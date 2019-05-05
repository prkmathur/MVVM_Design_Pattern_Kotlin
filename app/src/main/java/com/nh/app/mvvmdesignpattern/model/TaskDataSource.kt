package com.nh.app.mvvmdesignpattern.model

import com.nh.app.mvvmdesignpattern.model.POJO.User

interface TaskDataSource {

    fun onRegisterUser(user: User)

    fun onLoginUser(email: String, password: String)

}