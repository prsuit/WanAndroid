package com.pursuit.wanandroid.base.activity

import androidx.lifecycle.ViewModelProvider
import com.pursuit.wanandroid.base.BaseViewModel
import com.pursuit.wanandroid.ext.getVmClazz

/**
 * @Description:
 * @Author:      sh
 * @Date:        2021/12/8
 */
abstract class BaseVmActivity<VM : BaseViewModel> : BaseActivity() {
    lateinit var mViewModel: VM

    override fun performInit() {
        initViewModel()
        createObserver()
    }

    private fun initViewModel() {
        mViewModel = ViewModelProvider(this).get(getVmClazz(this))
    }

    /**
     * 创建LiveData数据观察者
     */
    abstract fun createObserver()

}