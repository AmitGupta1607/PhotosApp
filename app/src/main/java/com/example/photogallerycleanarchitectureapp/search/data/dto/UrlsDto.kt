package com.example.photogallerycleanarchitectureapp.search.data.dto

import com.example.photogallerycleanarchitectureapp.search.domain.models.Urls
import retrofit2.http.Url

data class UrlsDto(
    val full: String,
    val raw: String,
    val regular: String,
    val small: String,
    val small_s3: String,
    val thumb: String
) {
    fun dtoToUrl(): Urls {
        return Urls(
            regular = regular,
            small = small,
            full = full
        )
    }
}