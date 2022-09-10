package com.example.photogallerycleanarchitectureapp.search.domain.models

import com.example.photogallerycleanarchitectureapp.search.data.dto.ResultDto

data class SearchPhotoResponse(
    val results:List<Result>,
    val total: Int,
    val totalPages: Int
)