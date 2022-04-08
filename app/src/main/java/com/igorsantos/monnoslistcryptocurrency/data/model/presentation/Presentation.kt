package com.igorsantos.monnoslistcryptocurrency.data.model.presentation

import com.google.gson.annotations.SerializedName

data class Presentation(
    @SerializedName("response")
    val response: List<CryptoInfo>,
    @SerializedName("success")
    val status: Boolean,
    @SerializedName("message")
    val message: String,
    @SerializedName("httpCode")
    val httpCode: Int,
    @SerializedName("errors")
    val errors: String?,
)
