package com.igorsantos.monnoslistcryptocurrency.data.model.details

import com.google.gson.annotations.SerializedName

data class AssetInfo(
    @SerializedName("descriptions")
    val descriptions: String?,
    @SerializedName("description")
    val description: String,
    @SerializedName("cmcRank")
    val cmcRank: Int,
    @SerializedName("circulatingSupply")
    val circulatingSupply: Double,
    @SerializedName("maxSupply")
    val maxSupply: Double,
    @SerializedName("price")
    val price: Double,
    @SerializedName("volume24h")
    val volume24h: Double,
    @SerializedName("marketCap")
    val marketCap: Double
)
