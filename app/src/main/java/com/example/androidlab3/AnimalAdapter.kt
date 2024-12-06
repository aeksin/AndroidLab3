package com.example.androidlab3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AnimalAdapter(private val context: Context, private val animalList: List<AnimalInfo>) :
    RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item, parent, false)
        return AnimalViewHolder(view)
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        val animal = animalList[position]
        holder.animalNameTextView.text = animal.name
        val weight = context.getString(R.string.weight_textview)
        val height = context.getString(R.string.height_textview)
        val weightMeasure = context.getString(R.string.weight_measure)
        val heightMeasure = context.getString(R.string.height_measure)
        holder.animalWeightTextView.text =
            getCharacteristicMessage(weight, animal.weight.toString(), weightMeasure)
        holder.animalHeightTextView.text =
            getCharacteristicMessage(height, animal.height.toString(), heightMeasure)
        holder.animalImageView.setImageResource(animal.pictureResource)
    }

    private fun getCharacteristicMessage(
        characteristic: String,
        value: String,
        measure: String
    ): String {
        return "$characteristic: $value $measure"
    }

    override fun getItemCount(): Int {
        return animalList.size
    }

    class AnimalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val animalNameTextView: TextView = itemView.findViewById(R.id.name)
        val animalImageView: ImageView = itemView.findViewById(R.id.picture)
        val animalHeightTextView: TextView = itemView.findViewById(R.id.height)
        val animalWeightTextView: TextView = itemView.findViewById(R.id.weight)
    }
}

