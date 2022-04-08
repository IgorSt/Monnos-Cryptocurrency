package com.igorsantos.monnoslistcryptocurrency.data.model.details

import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("name")
    val name: String,
    @SerializedName("fiat")
    val fiat: Boolean,
    @SerializedName("active")
    val active: Boolean,
    @SerializedName("arbitrage")
    val arbitrage: Boolean,
    @SerializedName("marketBase")
    val marketBase: Boolean,
    @SerializedName("depositAddress")
    val depositAddress: Boolean,
    @SerializedName("erc20")
    val erc20: Boolean,
    @SerializedName("withdrawable")
    val withDrawable: Boolean,
    @SerializedName("destinationTag")
    val destinationTag: Boolean,
    @SerializedName("token")
    val token: Boolean,
    @SerializedName("accountBase")
    val accountBase: Boolean,
    @SerializedName("monnosWithdrawalInfo")
    val monnosPercent: MonnosPercent,
    @SerializedName("fullName")
    val fullName: String,
    @SerializedName("color")
    val color: String,
    @SerializedName("iconPng")
    val iconPng: String,
    @SerializedName("iconSvg")
    val iconSvg: String,
    @SerializedName("blockChainUrl")
    val blockChainUrl: String?,
    @SerializedName("minimumConfirmations")
    val minimumConfirmations: Int,
    @SerializedName("withdrawDecimalPlaces")
    val withdrawDecimalQtd: Int,
    @SerializedName("assetAboutInfo")
    val assetAboutInfo: AssetInfo,
    @SerializedName("decimalPlaces")
    val decimalPlaces: Int,
    @SerializedName("allowedTokenBasesToBuy")
    val allowedTokenBasesToBuy: List<String>?,
    @SerializedName("releaseDate")
    val releaseDate: String,
    @SerializedName("maxTokenBuyAmount")
    val maxTokenBuyAmount: Int,
    @SerializedName("minTokenBuyAmount")
    val minTokenBuyAmount: Int,
    @SerializedName("assetSyncRules")
    val assetSyncRules: AssetSync,
    @SerializedName("marketType")
    val marketType: String,
    @SerializedName("tags")
    val tags: List<String>,
    @SerializedName("walletLocked")
    val walletLocked: Boolean,
    @SerializedName("walletOnDemand")
    val walletOnDemand: Boolean,
    @SerializedName("blockUserWalletCreation")
    val blockUserWalletCreation: Boolean,
    @SerializedName("highRisk")
    val highRisk: Boolean,
    @SerializedName("networkDetailsList")
    val networkDetailsList: List<NetworkDetails>
)
