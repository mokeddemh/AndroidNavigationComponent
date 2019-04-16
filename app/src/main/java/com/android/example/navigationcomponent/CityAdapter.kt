package com.android.example.navigationcomponent

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import entity.City

class CityAdapter(val context:Context,var cities:List<City>):RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.city_layout, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageList.setImageResource(cities.get(position).listImage)
        holder.name.setText(cities.get(position).name)
        holder.numberTourist.setText("${cities.get(position).touristNumber}"+context.getString(R.string.touristText))
        holder.itemView.setOnClickListener { view ->
            var bundle = bundleOf("position" to position)
           view.findNavController().navigate(R.id.action_mainFragment_to_detailFragment,bundle)

        }
    }

    override fun getItemCount() = cities.size


}

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var imageList = view.findViewById(R.id.listimage) as ImageView
    val name = view.findViewById<TextView>(R.id.name) as TextView
    val numberTourist = view.findViewById<TextView>(R.id.numbertourist) as TextView



}


