package com.rosewhat.vkgiphy.data.network.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class GiphyDownloadDto(
    @SerializedName("height")
    @Expose
    val height: String,
    @SerializedName("width")
    @Expose
    val width: String,
    @SerializedName("size")
    @Expose
    val size: String,
    @SerializedName("url")
    @Expose
    val url: String,
)