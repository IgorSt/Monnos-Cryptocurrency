package com.igorsantos.monnoslistcryptocurrency.data.repository.di

import com.igorsantos.monnoslistcryptocurrency.data.repository.MonnosRepository
import com.igorsantos.monnoslistcryptocurrency.data.repository.MonnosRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {
    @Binds
    @Singleton
    fun bindRepository(repositoryImpl: MonnosRepositoryImpl): MonnosRepository
}