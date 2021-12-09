package com.pursuit.wanandroid.base.fragment

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import com.pursuit.wanandroid.base.BaseViewModel

/**
 * @Description:
 * @Author:      sh
 * @Date:        2021/12/8
 */
abstract class BaseFragment : Fragment() {
    lateinit var mActivity: AppCompatActivity
    private var isFirst: Boolean = true
    var handler: Handler? = Handler(Looper.myLooper()!!)

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mActivity = context as AppCompatActivity
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (layoutId() != 0)
            return inflater.inflate(layoutId(), container, false)
        return null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        isFirst = true
        performInit()
        init(view, savedInstanceState)
    }

    open fun performInit() {

    }

    override fun onResume() {
        super.onResume()
        onVisible()
    }

    /**
     * 是否需要懒加载
     */

    private fun onVisible() {
        if (lifecycle.currentState == Lifecycle.State.STARTED && isFirst) {
            handler?.postDelayed(
                {
                    lazyLoadData()
                    isFirst = false
                }, lazyLoadTime()
            )
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        handler?.removeCallbacksAndMessages(null)
        handler = null
    }

    /**
     * 延迟加载 防止 切换动画还没执行完毕时数据就已经加载好了，这时页面会有渲染卡顿  bug
     * 这里传入你想要延迟的时间，延迟时间可以设置比转场动画时间长一点 单位： 毫秒
     * 不传默认 300毫秒
     * @return Long
     */
    open fun lazyLoadTime(): Long {
        return 300
    }

    abstract fun layoutId(): Int


    abstract fun init(view: View, savedInstanceState: Bundle?)

    /**
     * 懒加载 只有当前fragment视图显示时才会触发该方法
     */
    abstract fun lazyLoadData()

}