package com.pursuit.wanandroid.ui.main.home.popular

import androidx.lifecycle.MutableLiveData
import com.pursuit.wanandroid.base.BaseViewModel

class PopularViewModel : BaseViewModel() {

    var num = MutableLiveData(0)
    lateinit var user:MutableLiveData<String>
    @JvmName("getUser1")
    fun getUser():MutableLiveData<String>{
        if (user==null){
            user = MutableLiveData("")
        }
        return user
    }
    fun modifyNum(i: Int): Unit {
        num.value = num.value?.plus(i)
    }
}