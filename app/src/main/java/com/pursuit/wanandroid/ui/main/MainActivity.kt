package com.pursuit.wanandroid.ui.main

import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.pursuit.wanandroid.R
import com.pursuit.wanandroid.base.activity.BaseDbVmActivity
import com.pursuit.wanandroid.databinding.ActivityMainBinding
import com.pursuit.wanandroid.ui.main.home.HomeViewModel

class MainActivity : BaseDbVmActivity<HomeViewModel,ActivityMainBinding>() {

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
////        installSplashScreen()
//        setContentView(R.layout.activity_main)
//        supportActionBar?.hide()
////        binding = ActivityMainBinding.inflate(layoutInflater)
////        setContentView(binding.root)
//
////        tv_txt1.apply {
////            textSize= 20f
////            text="123"
////        }
//
//        savedInstanceState?.run {
//            val string = getString("key")
//            println("-savedInstanceState-->$string")
//        }
//
//
////        navView.getOrCreateBadge(R.id.discoveryFragment)?.number = 2
//
//    }

    override fun init(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        val navView: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        val appBarConfiguration = AppBarConfiguration(navView.menu)
        val navController = findNavController(R.id.nav_host_fragment)
        setupActionBarWithNavController(navController, appBarConfiguration)
//        navView.setupWithNavController(navController)
        mBinding.bottomNavigationView.setupWithNavController(navController)
    }

    override fun layoutId()=R.layout.activity_main

    override fun onPause() {
        super.onPause()
        println("onPause")
    }

    override fun onStop() {
        super.onStop()
        println("onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        println("onSaveInstanceState")
        outState.putString("key", "hhh")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy")
    }

    override fun createObserver() {
    }


}