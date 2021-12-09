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
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.pursuit.wanandroid.R
import com.pursuit.wanandroid.base.fragment.BaseDbVmFragment
import com.pursuit.wanandroid.base.fragment.BaseFragment
import com.pursuit.wanandroid.databinding.FragmentHomeBinding
import com.pursuit.wanandroid.ui.main.MainActivity
import com.pursuit.wanandroid.ui.main.home.popular.PopularFragment
import com.pursuit.wanandroid.ui.main.home.popular.PopularViewModel

/**
 * @Description:
 * @Author:      sh
 * @Date:        2021/12/6
 */
class HomeFragment : BaseDbVmFragment<HomeViewModel, FragmentHomeBinding>() {
//        private val viewModel: HomeViewModel by viewModels()
    private var fragments: ArrayList<Fragment> = arrayListOf()
    private var titles: ArrayList<String> = arrayListOf()
    lateinit var pagerAdapter: FragmentStateAdapter
    private var currentOffset = 0

    override fun layoutId() = R.layout.fragment_home

    override fun init(view: View, savedInstanceState: Bundle?) {
//        mBinding.data=mViewModel
        titles = arrayListOf(
            getString(R.string.popular_articles),
            getString(R.string.latest_project),
            getString(R.string.plaza),
            getString(R.string.project_category)
        )
        fragments.add(PopularFragment.newInstance(0,titles[0]))
        fragments.add(PopularFragment.newInstance(1,titles[1]))
        fragments.add(PopularFragment.newInstance(2,titles[2]))
        fragments.add(PopularFragment.newInstance(3,titles[3]))
        pagerAdapter = MyPagerAdapter(this, fragments)
        mBinding.viewPager.adapter = pagerAdapter

        TabLayoutMediator(mBinding.tabLayout, mBinding.viewPager) { tab, position ->
            tab.text = titles[position]
            mBinding.viewPager.currentItem = tab.position
        }.attach()

        mBinding.appBarLayout.addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener {
                _, offset ->
            println("--offset-->$offset")
            if (mActivity is MainActivity && this.currentOffset!=offset){

            }
        })
    }

    override fun lazyLoadData() {
    }


    override fun createObserver() {
//        mViewModel.num.observe(viewLifecycleOwner,{
//            println(it)
//        })
    }
}