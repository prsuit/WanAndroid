package com.pursuit.wanandroid.base.fragment

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.pursuit.wanandroid.base.BaseViewModel
import com.pursuit.wanandroid.ext.getVmClazz

/**
 * @Description:
 * @Author:      sh
 * @Date:        2021/12/8
 */
abstract class BaseVmFragment<VM : BaseViewModel> : BaseFragment() {
    lateinit var mViewModel: VM

    /**
     * onViewCreated之后,数据初始前
     */
    override fun performInit() {
        initViewModel()
        createObserver()
    }

    override fun init(view: View, savedInstanceState: Bundle?) {

    }

    override fun lazyLoadData() {

    }

    private fun initViewModel() {
        mViewModel = ViewModelProvider(this).get(getVmClazz(this))
    }

    /**
     * 创建LiveData观察者 Fragment执行onViewCreated后触发
     */
    abstract fun createObserver()

}