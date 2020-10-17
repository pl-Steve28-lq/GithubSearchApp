package com.example.awesometechniques

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubAPI {
    @GET("search/repositories")
    fun getRepos(@Query("q") keyword: String): Single<GithubRepoList>
}