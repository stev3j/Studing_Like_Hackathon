package com.example.newenginebing.domain.repository

import com.example.newenginebing.data.remote.dto.CoinDetailDto
import com.example.newenginebing.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}