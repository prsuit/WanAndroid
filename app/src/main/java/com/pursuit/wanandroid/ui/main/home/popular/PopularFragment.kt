package com.pursuit.wanandroid.ui.main.home.popular

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import com.pursuit.wanandroid.R
import com.pursuit.wanandroid.base.fragment.BaseDbVmFragment
import com.pursuit.wanandroid.base.fragment.BaseFragment
import com.pursuit.wanandroid.databinding.FragmentPopularBinding

class PopularFragment : BaseDbVmFragment<PopularViewModel, FragmentPopularBinding>() {

    override fun layoutId() = R.layout.fragment_popular

    override fun init(view: View, savedInstanceState: Bundle?) {
        super.init(view, savedInstanceState)
        val title = arguments?.run { getString("title") }.let {
            it + "aaa"
        }
        mBinding.tv.apply {
            textSize=20f
            text = title
        }

        mBinding.btnLogin.setOnClickListener{
            jumpToLogin()
        }
    }

    override fun createObserver() {

    }

    fun jumpToLogin(){
        NavHostFragment.findNavController(this).navigate(R.id.action_loginFragment)
    }

    companion object {
        fun newInstance(cid: Int,title:String): PopularFragment {
            return PopularFragment().apply {
                arguments = Bundle().apply {
                    putInt("id", cid)
                    putString("title", title)
                }
            }
        }
    }
}