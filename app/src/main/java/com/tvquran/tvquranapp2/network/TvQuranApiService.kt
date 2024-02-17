package com.tvquran.tvquranapp2.network

import com.tvquran.tvquranapp2.model.Home
import retrofit2.Response
import retrofit2.http.GET

interface TvQuranApiService {
    @GET("/home")
    suspend fun getHomeData(): Response<Home>
}