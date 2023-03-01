package com.rosewhat.vkgiphy.data.network.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class GiphyNameDto(
    @SerializedName("type")
    @Expose
    val type: String,
    @SerializedName("id")
    @Expose
    val id: String,
    @SerializedName("url")
    @Expose
    val url: String,
    @SerializedName("slug")
    @Expose
    val slug: String,
    @SerializedName("bitly_gif_url")
    @Expose
    val bitlyGifUrl: String,
    @SerializedName("bitly_url")
    @Expose
    val bitlyUrl: String,
    @SerializedName("embed_url")
    @Expose
    val embedUrl: String,
    @SerializedName("username")
    @Expose
    val username: String,
    @SerializedName("source")
    @Expose
    val source: String,
    @SerializedName("title")
    @Expose
    val title: String,
    @SerializedName("rating")
    @Expose
    val rating: String,
    @SerializedName("content_url")
    @Expose
    val contentUrl: String,
    @SerializedName("source_tld")
    @Expose
    val sourceTld: String,
    @SerializedName("source_post_url")
    @Expose
    val sourcePostUrl: String,
    @SerializedName("is_sticker")
    @Expose
    val isSticker: Integer,
    @SerializedName("import_datetime")
    @Expose
    val importDatetime: String,
    @SerializedName("trending_datetime")
    @Expose
    val trendingDatetime: String,
    @SerializedName("images")
    @Expose
    val giphyDownloadContainerDto: GiphyDownloadContainerDto,
)