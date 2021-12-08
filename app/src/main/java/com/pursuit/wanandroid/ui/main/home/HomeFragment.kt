package com.pursuit.wanandroid.ui.main.home

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.pursuit.wanandroid.R
import com.pursuit.wanandroid.base.fragment.BaseFragment
import com.pursuit.wanandroid.databinding.FragmentHomeBinding
import com.pursuit.wanandroid.ui.main.home.popular.PopularViewModel

/**
 * @Description:
 * @Author:      sh
 * @Date:        2021/12/6
 */
class HomeFragment :BaseFragment<FragmentHomeBinding,PopularViewModel>(){
//    private val viewModel: HomeViewModel by viewModels()


    override fun onStart() {
        super.onStart()
        println("onStart")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

      //  viewModel = ViewModelProvider(this).get(PopularViewModel::class.java)
//        mViewModel.num.observe(viewLifecycleOwner,Observer{
//            txtTv?.apply {
//                text = it.toString()
//            }
//        })

//        txtTv?.setOnClickListener {  mViewModel.modifyNum(1) }

        println("onActivityCreated")
//        println(viewModel.num.value.toString())
    }

    override fun onResume() {
        super.onResume()
        println("onResume")
    }

    override fun onPause() {
        super.onPause()
        println("onPause")
    }

    override fun onStop() {
        super.onStop()
        println("onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        println("onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        println("onDetach")
    }

    override fun layoutId() = R.layout.fragment_home

    override fun initView(view: View, savedInstanceState: Bundle?) {

        mBinding.data=viewModel
    }

    override fun createObserver() {
//        viewModel.num.observe(viewLifecycleOwner,{
//            println(it)
//        })
    }
}