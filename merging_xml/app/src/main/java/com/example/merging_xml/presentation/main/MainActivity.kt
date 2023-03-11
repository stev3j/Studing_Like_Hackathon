@file:OptIn(DelicateCoroutinesApi::class)

package com.example.merging_xml.presentation.main

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.merging_xml.R
import com.example.merging_xml.databinding.ActivityMainBinding
import com.example.merging_xml.presentation.base.BaseActivity
import com.example.merging_xml.presentation.feature.CommunityFragment
import com.example.merging_xml.presentation.feature.HomeFragment
import com.example.merging_xml.presentation.feature.ProfileFragment
import com.example.merging_xml.presentation.feature.RankFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.*


@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(R.layout.activity_main){

    override val viewModel: MainViewModel = MainViewModel() // viewModels

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun start() {
//        supportFragmentManager.beginTransaction()
//            .replace(R.id.fragment, LoginFragment())
//            .commit()

        replaceFragment(HomeFragment())

        binding.navigation.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.action_home -> {
                    replaceFragment(HomeFragment())
                }
                R.id.action_rank -> {
                    replaceFragment(RankFragment())
                }
                R.id.action_community -> {
                    replaceFragment(CommunityFragment())
                }
                R.id.action_profile -> {
                    replaceFragment(ProfileFragment())
                }
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fragment, fragment).commit()
    }
}