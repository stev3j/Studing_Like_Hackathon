package com.example.mergin.presentation.navigation.bottom

import com.example.mergin.R

sealed class Screen(val title: String, val icon: Int, val screenRoute: String) {
    object Home : Screen("홈", R.drawable.ic_home, HOME)
    object Rank : Screen("혜택", R.drawable.ic_rank, RANK)
    object Community : Screen("송금", R.drawable.ic_community, COMMUNITY)
    object Profile : Screen("주식", R.drawable.ic_profile, PROFILE)
}

const val HOME = "HOME"
const val RANK = "RANK"
const val COMMUNITY = "COMMUNITY"
const val PROFILE = "PROFILE"