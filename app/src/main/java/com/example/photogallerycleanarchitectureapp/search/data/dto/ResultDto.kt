package com.example.photogallerycleanarchitectureapp.search.data.dto

import com.example.photogallerycleanarchitectureapp.search.domain.models.Result

data class ResultDto(
    val alt_description: String,
    val blur_hash: String,
    val categories: List<Any>,
    val color: String,
    val created_at: String,
    val current_user_collections: List<Any>,
    val description: String,
    val height: Int,
    val id: String,
    val liked_by_user: Boolean,
    val likes: Int,
    val links: Links,
    val promoted_at: String,
    val sponsorship: Any,
    val tags: List<Tag>,
    val updated_at: String,
    val urls: UrlsDto,
    val user: UserDto,
    val width: Int
) {
    fun dtoToResult(): Result {
        return Result(
            id = id,
            description = description,
            altDescription = alt_description,
            urls = urls.dtoToUrl(),
            user = user.dToToUser(),
            createdTime = created_at,
            color = color
        )
    }
}