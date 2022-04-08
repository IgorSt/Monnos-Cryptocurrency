package com.igorsantos.monnoslistcryptocurrency.data.rules

import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.core.content.ContextCompat
import androidx.core.widget.NestedScrollView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.google.android.material.textview.MaterialTextView
import com.igorsantos.monnoslistcryptocurrency.R

@BindingAdapter("formatCurrency")
fun MaterialTextView.formatCurrency(value: Double) {
    val value = "R$" + value.toString().replace(".", ",")
    text = value
}

@BindingAdapter(value = ["formatPercentDay", "formatPercentWeek", "formatPercentMonth"])
fun MaterialTextView.formatPercent(day: Double?, week: Double?, month: Double?) {
    val list = listOf(day, week, month)
    val index = list.indexOfFirst { it != null }
    val postIndex = when (index) {
        0 -> "day"
        1 -> "week"
        else -> "month"
    }
    val element = list[index] ?: 0.00
    when {
        element == 0.00 -> {
            text = "0.00% last $postIndex"
            setTextColor(ContextCompat.getColor(context, R.color.green))
        }
        element > 0 -> {
            text = "$element% last $postIndex"
            setTextColor(ContextCompat.getColor(context, R.color.green))
        }
        element < 0 -> {
            text = "$element% last $postIndex"
            setTextColor(ContextCompat.getColor(context, R.color.red))
        }
    }
}

@BindingAdapter("image")
fun ImageView.image(url: String?) {
    Glide.with(context)
        .load(url)
        .into(this)
}

@BindingAdapter("showProgress")
fun ProgressBar.showProgress(value: Boolean) {
    visibility = when (value) {
        true -> View.VISIBLE
        else -> View.GONE
    }
}

@BindingAdapter("showContainer")
fun NestedScrollView.showContainer(value: Boolean) {
    visibility = when (value) {
        false -> View.VISIBLE
        else -> View.GONE
    }
}

@BindingAdapter("cryptoRank")
fun MaterialTextView.cryptoRank(rank: Int) {
    text = "#$rank"
}

@BindingAdapter("cryptoValue")
fun MaterialTextView.cryptoValue(value: Double) {
    text = "Valor: R$ " + value.toString().replace(".", ",")
}