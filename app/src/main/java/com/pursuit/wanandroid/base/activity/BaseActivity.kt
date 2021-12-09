package com.pursuit.wanandroid.base.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding
import com.pursuit.wanandroid.base.BaseViewModel

/**
 * @Description:
 * @Author:      sh
 * @Date:        2021/12/8
 */
abstract class BaseActivity : AppCompatActivity() {
    private var isUseBinding = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (isUseBinding){
            initBinding()
        } else{
            setContentView(layoutId())
        }
        performInit()
        init(savedInstanceState)
    }

    abstract fun performInit()

    abstract fun layoutId() :Int

    abstract fun init(savedInstanceState: Bundle?)

    open fun initBinding() {

    }

    fun setUseBinding(isUseBinding: Boolean) {
        this.isUseBinding = isUseBinding
    }
}