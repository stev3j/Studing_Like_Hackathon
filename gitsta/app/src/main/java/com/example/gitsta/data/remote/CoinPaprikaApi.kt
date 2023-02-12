package com.example.gitsta.data.remote

import com.example.gitsta.data.remote.dto.GitUserDetailDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {

//    @GET("/v1/coins")
//    suspend fun getCoins(): List<CoinDto>
//
//    @GET("/v1/coins/{coinId}")
//    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDto

    @GET("/users/{username}")
    suspend fun getUserByName(@Path("username") username: String): GitUserDetailDto
}