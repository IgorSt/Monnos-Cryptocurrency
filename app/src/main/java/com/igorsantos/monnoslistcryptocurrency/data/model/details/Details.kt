package com.igorsantos.monnoslistcryptocurrency.data.model.details

import com.google.gson.annotations.SerializedName

data class Details(
    @SerializedName("response")
    val response: Response,
    @SerializedName("success")
    val success: Boolean,
    @SerializedName("message")
    val message: String,
    @SerializedName("httpCode")
    val httpCode: Int,
    @SerializedName("errors")
    val errors: String?,
)
