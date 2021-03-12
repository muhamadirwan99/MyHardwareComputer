package com.dicoding.picodiploma.myhardwarecomputer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListHardwareAdapter (private val listHardware : ArrayList<Hardware>) : RecyclerView.Adapter<ListHardwareAdapter.ListHardwareHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListHardwareHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_hardware, parent, false)
        return ListHardwareHolder(view)
    }

    override fun onBindViewHolder(holder: ListHardwareHolder, position: Int) {
        val hardware = listHardware[position]

        Glide.with(holder.itemView.context)
            .load(hardware.photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.imgPhoto)

        holder.tvName.text = hardware.name
        holder.tvDetail.text = hardware.detail

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listHardware[holder.adapterPosition]) }

    }

    override fun getItemCount(): Int {
        return listHardware.size
    }

    inner class ListHardwareHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto : ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Hardware)
    }
}