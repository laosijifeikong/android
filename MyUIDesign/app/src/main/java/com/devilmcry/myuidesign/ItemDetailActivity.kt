package com.devilmcry.myuidesign

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ItemDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_detail)

        val brand = intent.getStringExtra("brand")
        val rank = intent.getStringExtra("rank")
        val score = intent.getStringExtra("score")

        findViewById<TextView>(R.id.tvDetail).text = "排名：$rank\n品牌：$brand\n搜索指数：$score"
    }
}