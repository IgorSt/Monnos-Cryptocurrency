package com.igorsantos.monnoslistcryptocurrency.data.usecase.di

import com.igorsantos.monnoslistcryptocurrency.data.usecase.MonnosUseCase
import com.igorsantos.monnoslistcryptocurrency.data.usecase.MonnosUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface UseCaseModule {
    @Singleton
    @Binds
    fun bindUseCase(useCaseImpl: MonnosUseCaseImpl): MonnosUseCase
}