package com.nh.app.mvvmdesignpattern.application.bindingAdapters

import android.widget.ImageView
import androidx.databinding.BindingAdapter
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