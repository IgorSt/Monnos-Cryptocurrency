package com.igorsantos.monnoslistcryptocurrency.data.model.details

import com.google.gson.annotations.SerializedName

data class AssetSync(
    @SerializedName("minAllowedSubscriptionFee")
    val minSubscriptionFee: Double,
    @SerializedName("maxAllowedSubscriptionFee")
    val maxAllowedFee: Double,
    @SerializedName("maxAllowedAmountToSync")
    val maxAllowedAmount: Double,
)
