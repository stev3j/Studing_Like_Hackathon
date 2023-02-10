package com.example.newenginebing.presentation.coin_detail

import com.example.newenginebing.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
