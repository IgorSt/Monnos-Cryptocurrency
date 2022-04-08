package com.igorsantos.monnoslistcryptocurrency.data.repository

import com.igorsantos.monnoslistcryptocurrency.data.model.details.Details
import com.igorsantos.monnoslistcryptocurrency.data.model.presentation.Presentation

interface MonnosRepository {
    suspend fun getPresentationData(): Presentation
    suspend fun getDetails(name: String): Details
}