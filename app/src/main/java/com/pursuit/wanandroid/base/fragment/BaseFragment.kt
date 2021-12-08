package com.pursuit.wanandroid.base.fragment

import android.os.Bundle
import android.view.View
import androidx.databinding.ViewDataBinding
import com.pursuit.wanandroid.base.BaseViewModel

/**
 * @Description:
 * @Author:      sh
 * @Date:        2021/12/8
 */
abstract class BaseFragment<DB:ViewDataBinding,VM: BaseViewModel>: BaseDbVmFragment<DB, VM>() {

    /**
     * 布局Id
     */
    abstract override fun layoutId(): Int

    abstract override fun initView(view: View, savedInstanceState: Bundle?)

    /**
     * 懒加载 只有当前fragment视图显示时才会触发该方法
     */
    override fun lazyLoadData() {}

    /**
     * 创建LiveData观察者 Fragment执行onViewCreated后触发
     */
    override fun createObserver() {}

    /**
     * Fragment执行onViewCreated后触发
     */
    override fun initData() {

    }
}