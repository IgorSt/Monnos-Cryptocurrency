package com.igorsantos.monnoslistcryptocurrency.data.model.details

import com.google.gson.annotations.SerializedName

data class MonnosPercent(
    @SerializedName("feeValue")
    val feeValue: Double,
    @SerializedName("feePercent")
    val feePercent: Double,
    @SerializedName("minimumValue")
    val minimumValue: Double,
    @SerializedName("maximumValue")
    val maximumValue: Double,
    @SerializedName("withdrawDecimalPlaces")
    val withdrawDecimalQtd: Int,
    @SerializedName("maxDynamicalValue")
    val maxDynamicalValue: Double

    )
