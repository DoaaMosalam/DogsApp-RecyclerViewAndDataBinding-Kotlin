package com.example.recyclerviewdatabinding

import android.app.SharedElementCallback
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(private var list:MutableList<Dogs>):RecyclerView.Adapter<MyAdapter.DogsViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogsViewHolder {
        return DogsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false))
    }

    override fun getItemCount(): Int {
       return list.size
    }

    override fun onBindViewHolder(holder: DogsViewHolder, position: Int) {
        val current=list[position]
        holder.dogsImage.setImageResource(current.dogsImage)
        holder.tvHeading.text=current.descDogs

    }


    //inner Class ViewHolder
    class DogsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
//         lateinit var dogsImage:ShapeableImageView
//         lateinit var tvHeading:TextView

        var dogsImage:ShapeableImageView = itemView.findViewById(R.id.Dogs_Image)
        var tvHeading:TextView = itemView.findViewById(R.id.tvHeading)

//        inner class Bind(dogs: Dogs){
//
//        }
    }




}