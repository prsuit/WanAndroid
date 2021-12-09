package com.pursuit.wanandroid.ui.main.home

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

/**
 * @Description:
 * @Author:      sh
 * @Date:        2021/12/9
 */
class MyPagerAdapter(fragment: Fragment, fragments: List<Fragment>) :
    FragmentStateAdapter(fragment) {
    private var fragments: List<Fragment> = fragments

    override fun getItemCount() = fragments.size


    override fun createFragment(position: Int) = fragments[position]
}