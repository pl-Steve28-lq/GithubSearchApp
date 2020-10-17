package com.example.awesometechniques

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recyclerview_row.view.*

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.mViewHolder>() {

    private val githubRepos: ArrayList<GithubRepo> = ArrayList()

    inner class mViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var full_name: TextView = itemView.mFullName
        var language: TextView = itemView.mLang
        var html_url: TextView = itemView.mUrl
        var stargazers_count: TextView = itemView.mStar
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): mViewHolder = mViewHolder(
        LayoutInflater.from(p0.context).inflate(R.layout.recyclerview_row, p0, false))

    override fun onBindViewHolder(p0: mViewHolder, p1: Int) {
        p0.language.text = "Language : " + githubRepos[p1].language
        p0.full_name.text = githubRepos[p1].full_name
        p0.html_url.text = githubRepos[p1].html_url
        p0.stargazers_count.text = "★" + githubRepos[p1].stargazers_count.toString()
    }

    override fun getItemCount(): Int = githubRepos.size

    fun update(githubRepos: ArrayList<GithubRepo>) {
        this.githubRepos.clear()
        this.githubRepos.addAll(githubRepos)
        notifyDataSetChanged()
    }

}