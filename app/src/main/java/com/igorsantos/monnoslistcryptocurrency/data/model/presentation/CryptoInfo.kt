package com.igorsantos.monnoslistcryptocurrency.data.model.presentation

import com.google.gson.annotations.SerializedName

data class CryptoInfo(
    @SerializedName("id")
    val id: String?,
    @SerializedName("symbol")
    val symbol: Symbol,
    @SerializedName("priceIndex")
    val price: Double,
    @SerializedName("priceIndexString")
    val priceSt: String,
    @SerializedName("lastDayPriceIndexChangePercent")
    val lastPriceDay: Double?,
    @SerializedName("lastWeekPriceIndexChangePercent")
    val lastPriceWeek: Double?,
    @SerializedName("lastMonthPriceIndexChangePercent")
    val lastPriceMonth: Double?,
    @SerializedName("counterAssetRank")
    val rank: Int,
    @SerializedName("date")
    val date: String
)
