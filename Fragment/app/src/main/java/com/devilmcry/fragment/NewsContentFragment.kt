package com.devilmcry.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class NewsContentFragment: Fragment() {

    private lateinit var titleView : TextView
    private lateinit var contentView: TextView


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.news_content_frag, container, false)
        titleView = view.findViewById(R.id.news_title)
        contentView = view.findViewById(R.id.news_content)
        return view
    }

    fun refresh(title: String, content: String) {
        titleView.text = title
        contentView.text = content
    }

}