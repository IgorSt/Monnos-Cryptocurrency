package com.igorsantos.monnoslistcryptocurrency.data.model.details

import com.google.gson.annotations.SerializedName

data class NetworkDetails(
    @SerializedName("network")
    val network: String,
    @SerializedName("networkName")
    val networkName: String,
    @SerializedName("addressRegex")
    val addressRegex: String,
    @SerializedName("tagRegex")
    val tagRegex: String,
    @SerializedName("defaultDepositNetwork")
    val depositNetwork: Boolean,
    @SerializedName("defaultWithdrawNetwork")
    val withdrawNetwork: Boolean,
    @SerializedName("depositEnabled")
    val depositEnabled: Boolean,
    @SerializedName("withdrawEnabled")
    val withdrawEnabled: Boolean,
    @SerializedName("withdrawFee")
    val withdrawFee: Double,
    @SerializedName("withdrawMin")
    val withdrawMin: Double,
)
