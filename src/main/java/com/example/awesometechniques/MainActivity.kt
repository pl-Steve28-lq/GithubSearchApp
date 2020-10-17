package com.example.awesometechniques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var recyclerViewAdapter: RecyclerViewAdapter = RecyclerViewAdapter()
    private lateinit var searchBtn: Button
    private lateinit var searchText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mRecyclerView.adapter = recyclerViewAdapter

        searchBtn = searchButton
        searchText = searchKeyword

        searchBtn.setOnClickListener {
            val disposable = GithubClient().getApi().getRepos(searchText.text.toString())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    { result -> recyclerViewAdapter.update(result.items) },
                    { error -> Log.e("Error...", error.localizedMessage) }
                )
        }


    }
}