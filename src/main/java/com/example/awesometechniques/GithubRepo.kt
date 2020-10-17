package com.example.awesometechniques

import com.google.gson.annotations.SerializedName

data class GithubRepo (
    @SerializedName("full_name") val full_name: String,
    @SerializedName("html_url") val html_url: String,
    @SerializedName("language") val language: String,
    @SerializedName("stargazers_count") val stargazers_count: Int
)