package com.example.awesometechniques

import com.google.gson.annotations.SerializedName

data class GithubRepoList (
    @SerializedName("items") val items: ArrayList<GithubRepo>
)