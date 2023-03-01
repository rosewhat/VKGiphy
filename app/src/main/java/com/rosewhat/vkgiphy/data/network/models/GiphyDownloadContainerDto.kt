package com.rosewhat.vkgiphy.data.network.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class GiphyDownloadContainerDto(
    @SerializedName("downsized_medium")
    @Expose
    val giphyDownload: GiphyDownloadDto,
)