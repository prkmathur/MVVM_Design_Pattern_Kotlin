package com.nh.app.mvvmdesignpattern.viewmodel.authentication

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nh.app.mvvmdesignpattern.model.POJO.User
import com.nh.app.mvvmdesignpattern.model.TaskRepository
import javax.inject.Inject

class RegisterViewModel @Inject constructor(taskRepository: TaskRepository): ViewModel() {


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