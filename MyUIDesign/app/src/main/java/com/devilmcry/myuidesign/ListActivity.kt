package com.devilmcry.myuidesign

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val recyclerView =  findViewById<RecyclerView>(R.id.pc_list)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val originalList = listOf(
            PCItem("1", "联想", "12000"),
            PCItem("2", "戴尔", "11500"),
            PCItem("3", "惠普", "11200"),
            PCItem("4", "华硕", "11400"),
            )

        val sortedList = originalList
            .sortedByDescending { it.score.toInt() }
            .mapIndexed { index, item -> item.copy(rank = (index + 1).toString()) }

        val adapter = PCAdapter(sortedList) { item ->
            val intent = Intent(this, ItemDetailActivity::class.java)
            intent.putExtra("brand", item.brand)
            intent.putExtra("rank", item.rank)
            intent.putExtra("score", item.score)
            startActivity(intent)
        }

        recyclerView.adapter = adapter
    }
}