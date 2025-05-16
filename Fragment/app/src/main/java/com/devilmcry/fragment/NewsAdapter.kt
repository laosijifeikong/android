package com.devilmcry.fragment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter(
    private val newsList: List<News>,
    private val isTwoPane: Boolean,
    private val fragmentManager: FragmentManager,
    private val context: Context
) : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val newsTitle: TextView = view.findViewById(R.id.news_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.news_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = newsList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val news = newsList[position]
        holder.newsTitle.text = news.title

        holder.itemView.setOnClickListener {
            if (isTwoPane) {
                val fragment = fragmentManager.findFragmentById(R.id.news_content_fragment) as NewsContentFragment
                fragment.refresh(news.title, news.content)
            } else {
                NewsContentActivity.actionStart(context, news.title, news.content)
            }
        }
    }
}
