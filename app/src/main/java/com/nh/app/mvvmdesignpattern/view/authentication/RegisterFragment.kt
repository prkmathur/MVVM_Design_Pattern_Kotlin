package com.nh.app.mvvmdesignpattern.view.authentication

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.nh.app.mvvmdesignpattern.R
import com.nh.app.mvvmdesignpattern.databinding.FragmentRegisterBinding
import com.nh.app.mvvmdesignpattern.model.POJO.User
import com.nh.app.mvvmdesignpattern.viewmodel.authentication.RegisterViewModel


class RegisterFragment: Fragment(){


    private lateinit var registerBinding: FragmentRegisterBinding
    private lateinit var registerViewModel : RegisterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        registerViewModel = ViewModelProviders.of(this).get(RegisterViewModel::class.java!!)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        registerBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_register,container,false)

        registerBinding.lifecycleOwner = this

        registerBinding.viewmodel = registerViewModel

        return registerBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setUpRegister()
    }


    private fun setUpRegister(){
        registerBinding.viewmodel!!.registerEvent.observe(this, Observer<User>(function = {

            Log.d("Data",""+it.firstName)
        }))
    }

}