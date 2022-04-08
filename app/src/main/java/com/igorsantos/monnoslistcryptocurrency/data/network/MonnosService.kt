package com.igorsantos.monnoslistcryptocurrency.data.network

import com.igorsantos.monnoslistcryptocurrency.data.model.details.Details
import com.igorsantos.monnoslistcryptocurrency.data.model.presentation.Presentation
import retrofit2.http.GET
import retrofit2.http.Path

interface MonnosService {

    @GET("v2/market/tickers?allBase=BRL&marketType=CRYPTO")
    suspend fun getPresentationData(): Presentation

    @GET("v1/assets-details/{name}")
    suspend fun getDetails(@Path("name")name: String): Details
}