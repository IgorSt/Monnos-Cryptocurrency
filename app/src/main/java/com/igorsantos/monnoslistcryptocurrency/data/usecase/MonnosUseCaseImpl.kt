package com.igorsantos.monnoslistcryptocurrency.data.usecase

import com.igorsantos.monnoslistcryptocurrency.data.model.details.Details
import com.igorsantos.monnoslistcryptocurrency.data.model.presentation.Presentation
import com.igorsantos.monnoslistcryptocurrency.data.repository.MonnosRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MonnosUseCaseImpl @Inject constructor(
    private val repository: MonnosRepository
) : MonnosUseCase{
    override suspend fun getPresentationData(): Presentation = repository.getPresentationData()
    override suspend fun getDetails(name: String): Details = repository.getDetails(name)
}