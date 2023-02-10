package com.example.newenginebing.data.repository

import com.example.newenginebing.data.remote.CoinPaprikaApi
import com.example.newenginebing.data.remote.dto.CoinDetailDto
import com.example.newenginebing.data.remote.dto.CoinDto
import com.example.newenginebing.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}