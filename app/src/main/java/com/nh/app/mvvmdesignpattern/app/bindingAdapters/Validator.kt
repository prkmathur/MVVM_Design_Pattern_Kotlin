package com.nh.app.mvvmdesignpattern.app.bindingAdapters

import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.nh.app.mvvmdesignpattern.R
import com.squareup.picasso.Picasso

object Validator {

        @JvmStatic
        @BindingAdapter("android:src")
        fun setImageUrl(img:ImageView, value:String) {
            Picasso.get()
                .load(value)
                .into(img)

        }
}