package com.pursuit.wanandroid.ui.main.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pursuit.wanandroid.base.BaseViewModel

/**
 * @Description:
 * @Author:      sh
 * @Date:        2021/12/8
 */
class HomeViewModel:BaseViewModel() {
    var num = MutableLiveData(0)

    fun add() {
        num.value = num.value?.plus(1)
    }
}