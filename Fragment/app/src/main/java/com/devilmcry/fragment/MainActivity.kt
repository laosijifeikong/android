package com.devilmcry.fragment

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private var isTwoPane = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        isTwoPane = findViewById<View?>(R.id.news_content_fragment) != null

        if (!isTwoPane) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, NewsTitleFragment())
                .commit()
        }
    }
}
