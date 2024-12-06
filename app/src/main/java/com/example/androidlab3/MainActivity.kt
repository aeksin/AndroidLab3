package com.example.androidlab3

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private val animals = ArrayList<AnimalInfo>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setInitialData(this)
        val recyclerView: RecyclerView = findViewById(R.id.list)
        val animalAdapter = AnimalAdapter(this, animals)
        recyclerView.adapter = animalAdapter
    }

    private fun setInitialData(context: Context) {
        animals.add(AnimalInfo(context.getString(R.string.dog_name), 10f, 0.6f, R.drawable.dog))
        animals.add(AnimalInfo(context.getString(R.string.cat_name), 4f, 0.24f, R.drawable.cat))
        animals.add(AnimalInfo(context.getString(R.string.elephant_name), 5000f, 3f, R.drawable.elephant))
        animals.add(AnimalInfo(context.getString(R.string.giraffe_name), 1000f, 4.5f, R.drawable.giraffe))
        animals.add(AnimalInfo(context.getString(R.string.capybara_name), 45f, 0.5f, R.drawable.capybara))
        animals.add(AnimalInfo(context.getString(R.string.frog_name), 0.1f, 0.05f, R.drawable.frog))
        animals.add(AnimalInfo(context.getString(R.string.quokka_name), 2.5f, 0.4f, R.drawable.quokka))
        animals.add(AnimalInfo(context.getString(R.string.deer_name), 100f, 1.2f, R.drawable.deer))
        animals.add(AnimalInfo(context.getString(R.string.chicken_name), 2f, 0.35f, R.drawable.chicken))
        animals.add(AnimalInfo(context.getString(R.string.pigeon_name), 0.5f, 0.2f, R.drawable.pigeon))
        animals.add(AnimalInfo(context.getString(R.string.cow_name), 1.5f, 700f, R.drawable.cow))
        animals.add(AnimalInfo(context.getString(R.string.horse_name), 500f, 4f, R.drawable.horse))
        animals.add(AnimalInfo(context.getString(R.string.bunny_name), 3f, 0.3f, R.drawable.bunny))
        animals.add(AnimalInfo(context.getString(R.string.bobr_name), 20f, 0.4f, R.drawable.bobr))
    }
}