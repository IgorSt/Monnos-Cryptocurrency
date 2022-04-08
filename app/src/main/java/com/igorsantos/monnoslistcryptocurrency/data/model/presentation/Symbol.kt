package com.igorsantos.monnoslistcryptocurrency.data.model.presentation

import com.google.gson.annotations.SerializedName

data class Symbol(
    @SerializedName("baseCurrency")
    val baseCurrency: String,
    @SerializedName("counterCurrency")
    val counterCurrency: String
)
