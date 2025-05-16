package com.devilmcry.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NewsTitleFragment: Fragment() {

    private var isTwoPane: Boolean = false

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.news_title_frag, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.news_title_recycler_view)
        val layoutManager = LinearLayoutManager(activity)
        recyclerView.layoutManager = layoutManager
        val adapter = NewsAdapter(getNews(), isTwoPane, parentFragmentManager, requireContext())
        recyclerView.adapter = adapter
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        isTwoPane = activity?.findViewById<View>(R.id.news_content_fragment) != null
    }

    private fun getNews(): List<News> {
        val newsList = mutableListOf<News>()
        for (i in 1..20) {
            newsList.add(News("新闻标题 $i", "这是新闻内容 $i"))
        }
        return newsList
    }
}