package com.devilmcry.fragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class NewsContentActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.news_content)

        val title = intent.getStringExtra("news_title") ?: ""
        val content = intent.getStringExtra("news_content") ?: ""

        val fragment = supportFragmentManager.findFragmentById(R.id.news_content_fragment) as NewsContentFragment
        fragment.refresh(title, content)
    }

    companion object{
        fun actionStart(context: Context, title: String, content: String){
            val intent = Intent(context, NewsContentActivity::class.java).apply {
                putExtra("news_title", title)
                putExtra("news_content", content)
            }
            context.startActivity(intent)
        }
    }
}