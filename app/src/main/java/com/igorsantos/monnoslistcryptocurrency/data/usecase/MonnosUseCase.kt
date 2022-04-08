package com.igorsantos.monnoslistcryptocurrency.data.usecase

import com.igorsantos.monnoslistcryptocurrency.data.model.details.Details
import com.igorsantos.monnoslistcryptocurrency.data.model.presentation.Presentation

interface MonnosUseCase {
    suspend fun getPresentationData(): Presentation
    suspend fun getDetails(name: String): Details
}