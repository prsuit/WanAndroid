package com.pursuit.wanandroid.base.activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.pursuit.wanandroid.base.BaseViewModel
import com.pursuit.wanandroid.ui.main.home.HomeViewModel
import com.pursuit.wanandroid.ui.main.home.popular.PopularViewModel
import java.lang.reflect.ParameterizedType

/**
 * @Description:
 * @Author:      sh
 * @Date:        2021/12/8
 */
abstract class BaseVmActivity<VM : BaseViewModel> : BaseActivity() {
    lateinit var mViewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewModel()
        createObserver()
        initView(savedInstanceState)
    }

    private fun initViewModel() {
        mViewModel = ViewModelProvider(this).get(getVmClazz(this))
    }

    private inline fun <reified VM : BaseViewModel> getVmClazz(vmActivity: Any): VM {
        return (vmActivity.javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[0] as VM
    }


    /**
     * 创建LiveData数据观察者
     */
    abstract fun createObserver()

    abstract fun initView(savedInstanceState: Bundle?)
}