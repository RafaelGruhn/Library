package com.example.library.models

import com.google.gson.annotations.SerializedName


data class Publisher (
    @SerializedName("novatec")
    var categories: List<Category> = emptyList()
)