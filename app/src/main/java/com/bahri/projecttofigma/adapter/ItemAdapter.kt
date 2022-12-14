package com.bahri.projecttofigma.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bahri.projecttofigma.databinding.ItemListBinding
import com.bahri.projecttofigma.model.DataItem

class ItemAdapter(private val context: Context)
    : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    private val list =ArrayList<DataItem>()

    @SuppressLint("NotifyDataSetChanged")
    fun setData(listParams: List<DataItem>) {
        list.clear()
        list.addAll(listParams)
        notifyDataSetChanged()
    }

    inner class ItemViewHolder(private val binding: ItemListBinding)
        : RecyclerView.ViewHolder(binding.root) {
        fun bind(data:DataItem){
            binding.ivImage.setImageResource(data.image)
            binding.tvName.text = data.nama
            binding.tvDesc.text = data.desc
            binding.tvRatting.text = data.rating
            binding.tvWaktu.text = data.waktu.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= ItemViewHolder (
        ItemListBinding.inflate(LayoutInflater.from(context), parent, false)
    )

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}