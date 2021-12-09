package com.pursuit.wanandroid.common

import android.widget.ImageView
import androidx.constraintlayout.widget.Placeholder
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.pursuit.wanandroid.R

/**
 * @Description:
 * @Author:      sh
 * @Date:        2021/12/9
 */

@BindingAdapter(value = ["imageUrl","errorImg","placeholder"], requireAll = false)
fun imageUrl(
    imageView: ImageView,
    url: String?,
    placeholder: Int,
    errorImg: Int
) {
    url?.run {
        Glide.with(imageView)
            .load(this)
            .placeholder(placeholder)
            .error(errorImg)
            .into(imageView)
    } ?: imageView.setImageResource(R.mipmap.ic_launcher_round)
}
fun test(i:Int =1){
    println(i)
}
