package com.rosewhat.vkgiphy.data.network.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class GiphyNameListDto(
    @SerializedName("data")
    @Expose
    val names: List<GiphyNameDto>,
)
