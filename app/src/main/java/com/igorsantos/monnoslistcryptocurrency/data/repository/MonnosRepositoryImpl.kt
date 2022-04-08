package com.igorsantos.monnoslistcryptocurrency.data.repository

import com.igorsantos.monnoslistcryptocurrency.data.model.details.Details
import com.igorsantos.monnoslistcryptocurrency.data.model.presentation.Presentation
import com.igorsantos.monnoslistcryptocurrency.data.network.MonnosService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MonnosRepositoryImpl @Inject constructor(
    private val service: MonnosService
) : MonnosRepository{

    override suspend fun getPresentationData(): Presentation = service.getPresentationData()
    override suspend fun getDetails(name: String): Details = service.getDetails(name)
}