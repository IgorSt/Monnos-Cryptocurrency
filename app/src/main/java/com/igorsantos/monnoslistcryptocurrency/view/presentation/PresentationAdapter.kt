package com.igorsantos.monnoslistcryptocurrency.view.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.igorsantos.monnoslistcryptocurrency.data.model.presentation.CryptoInfo
import com.igorsantos.monnoslistcryptocurrency.databinding.ItemPresentationBinding
import javax.inject.Inject

class PresentationAdapter @Inject constructor(
    private val viewModel: PresentationViewModel
) : ListAdapter<CryptoInfo, PresentationAdapter.PresentationVH>(DiffCallback) {

    companion object {
        private val DiffCallback = object : DiffUtil.ItemCallback<CryptoInfo>(){
            override fun areItemsTheSame(oldItem: CryptoInfo, newItem: CryptoInfo): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: CryptoInfo, newItem: CryptoInfo): Boolean {
                return oldItem == newItem
            }

        }
    }

    class PresentationVH(
        private val binding: ItemPresentationBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun setup(value: CryptoInfo, viewModel: PresentationViewModel) {
            binding.apply {
                data = value
                mViewModel = viewModel
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PresentationVH {
        return PresentationVH(
            ItemPresentationBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: PresentationVH, position: Int) {
        holder.setup(getItem(position), viewModel)
    }
}