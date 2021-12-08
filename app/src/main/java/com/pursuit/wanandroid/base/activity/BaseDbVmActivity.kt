package com.pursuit.wanandroid.base.activity

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.pursuit.wanandroid.base.BaseViewModel

/**
 * @Description:
 * @Author:      sh
 * @Date:        2021/12/8
 */
abstract class BaseDbVmActivity<DB : ViewDataBinding, VM : BaseViewModel> : BaseVmActivity<VM>() {
    lateinit var mBinding: DB
    override fun onCreate(savedInstanceState: Bundle?) {
        setUseBinding(true)
        super.onCreate(savedInstanceState)
    }

    override fun initBinding() {
        mBinding = DataBindingUtil.setContentView(this, layoutId())
        mBinding.lifecycleOwner = this
    }
}