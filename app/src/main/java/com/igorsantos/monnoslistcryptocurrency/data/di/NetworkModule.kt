package com.igorsantos.monnoslistcryptocurrency.data.di

import com.google.gson.Gson
import com.igorsantos.monnoslistcryptocurrency.data.network.MonnosService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    private const val BASE_URL = "https://api.monnos.com/public/"

    @Singleton
    @Provides
    fun monnosService(gson: Gson): MonnosService {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(MonnosService::class.java)
    }
}