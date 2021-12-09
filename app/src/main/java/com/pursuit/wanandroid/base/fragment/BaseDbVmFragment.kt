package com.pursuit.wanandroid.base.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.pursuit.wanandroid.base.BaseViewModel
import com.pursuit.wanandroid.base.fragment.BaseVmFragment

/**
 * @Description:
 * @Author:      sh
 * @Date:        2021/12/8
 */
abstract class BaseDbVmFragment<VM : BaseViewModel,DB : ViewDataBinding> : BaseVmFragment<VM>() {
    lateinit var mBinding: DB

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (layoutId() != 0) {
            mBinding = DataBindingUtil.inflate(inflater, layoutId(), container, false)
            mBinding.lifecycleOwner = viewLifecycleOwner
            return mBinding.root
        }
        return null
    }
}