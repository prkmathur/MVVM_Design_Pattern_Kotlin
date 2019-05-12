package com.nh.app.mvvmdesignpattern.view.authentication

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.nh.app.mvvmdesignpattern.R
import com.nh.app.mvvmdesignpattern.databinding.FragmentRegisterBinding
import com.nh.app.mvvmdesignpattern.model.POJO.User
import com.nh.app.mvvmdesignpattern.viewmodel.ViewModelFactory
import com.nh.app.mvvmdesignpattern.viewmodel.authentication.RegisterViewModel
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class RegisterFragment: DaggerFragment(){

    private lateinit var registerBinding: FragmentRegisterBinding

    private lateinit var registerViewModel : RegisterViewModel

    @Inject
    lateinit var viewModelFactory: ViewModelFactory


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        registerBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_register,container,false)

        return registerBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        registerViewModel = ViewModelProviders.of(this,viewModelFactory).get(RegisterViewModel::class.java!!)

        registerBinding.lifecycleOwner = this

        registerBinding.viewmodel = registerViewModel
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