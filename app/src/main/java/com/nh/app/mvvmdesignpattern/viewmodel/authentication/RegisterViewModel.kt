package com.nh.app.mvvmdesignpattern.viewmodel.authentication

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.nh.app.mvvmdesignpattern.model.POJO.User

class RegisterViewModel(context: Application): AndroidViewModel(context) {

    var firstName: MutableLiveData<String> = MutableLiveData()
    var lastName: MutableLiveData<String> = MutableLiveData()
    var email: MutableLiveData<String> = MutableLiveData()
    var password: MutableLiveData<String> = MutableLiveData()

    private val _registerEvent = MutableLiveData<User>()
    val registerEvent:LiveData<User>
        get() = _registerEvent

    init {

    }

    fun registerUser(){

        var user:User = User(firstName.value!!, lastName.value!!, email.value!!, password.value!!)

        _registerEvent.value = user
    }

}