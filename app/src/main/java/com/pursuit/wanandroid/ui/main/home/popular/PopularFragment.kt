package com.pursuit.wanandroid.ui.main.home.popular

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pursuit.wanandroid.R
import com.pursuit.wanandroid.base.fragment.BaseFragment
import com.pursuit.wanandroid.databinding.FragmentPopularBinding

class PopularFragment : BaseFragment<FragmentPopularBinding,PopularViewModel>() {

    companion object {
        fun newInstance() = PopularFragment()
    }

    private lateinit var viewModel: PopularViewModel
    override fun layoutId()=R.layout.fragment_popular

    override fun initView(view: View, savedInstanceState: Bundle?) {
        TODO("Not yet implemented")
    }

//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
//                              savedInstanceState: Bundle?): View? {
//        return inflater.inflate(R.layout.fragment_popular, container, false)
//    }

//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProvider(this).get(PopularViewModel::class.java)
//        // TODO: Use th
//    }

}