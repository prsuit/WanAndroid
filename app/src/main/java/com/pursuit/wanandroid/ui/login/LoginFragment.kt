package com.pursuit.wanandroid.ui.login

import android.os.Bundle
import android.view.View
import com.pursuit.wanandroid.R
import com.pursuit.wanandroid.base.fragment.BaseDbVmFragment
import com.pursuit.wanandroid.databinding.FragmentLoginBinding

/**
 * @Description:
 * @Author:      sh
 * @Date:        2021/12/9
 */
class LoginFragment : BaseDbVmFragment<LoginViewModel, FragmentLoginBinding>() {
    override fun layoutId() = R.layout.fragment_login

    override fun createObserver() {

    }

    override fun init(view: View, savedInstanceState: Bundle?) {
        super.init(view, savedInstanceState)
//        mBinding.imageUrl = "https://tva1.sinaimg.cn/large/008i3skNly1gwmmih4yhrj31360m03zz.jpg"
//        mBinding.placeholder = R.drawable.ic_layers_black_24dp
//        mBinding.errorImg = R.drawable.ic_star_black_24dp
    }
}