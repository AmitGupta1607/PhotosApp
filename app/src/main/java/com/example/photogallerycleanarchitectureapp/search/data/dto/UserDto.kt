package com.example.photogallerycleanarchitectureapp.search.data.dto

import com.example.photogallerycleanarchitectureapp.search.domain.models.User

data class UserDto(
    val accepted_tos: Boolean,
    val bio: String,
    val first_name: String,
    val for_hire: Boolean,
    val id: String,
    val instagram_username: String,
    val last_name: String,
    val links: LinksXX,
    val location: String,
    val name: String,
    val portfolio_url: Any,
    val profile_image: ProfileImage,
    val social: Social,
    val total_collections: Int,
    val total_likes: Int,
    val total_photos: Int,
    val twitter_username: Any,
    val updated_at: String,
    val username: String
) {
    fun dToToUser(): User {
        return User(
            name = name,
            instagramUsername = instagram_username
        )
    }
}