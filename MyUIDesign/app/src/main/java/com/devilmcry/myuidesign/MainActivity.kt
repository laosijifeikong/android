package com.devilmcry.myuidesign

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.devilmcry.myuidesign.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val fruitList = ArrayList<Fruit>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initFruits()

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = FruitAdapter(fruitList)
    }

    private fun initFruits() {
        val fruits = listOf(
            Fruit("Apple", R.drawable.ic_launcher_foreground),
            Fruit("Banana", R.drawable.ic_launcher_foreground),
            Fruit("Orange", R.drawable.ic_launcher_foreground),
            Fruit("Mango", R.drawable.ic_launcher_foreground),
            Fruit("Strawberry", R.drawable.ic_launcher_foreground)
        )
        repeat(2) { fruitList.addAll(fruits) }
    }
}
