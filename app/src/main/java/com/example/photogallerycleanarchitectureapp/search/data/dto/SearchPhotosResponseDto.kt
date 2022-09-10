package com.example.photogallerycleanarchitectureapp.search.data.dto

import com.example.photogallerycleanarchitectureapp.search.domain.models.Result
import com.example.photogallerycleanarchitectureapp.search.domain.models.SearchPhotoResponse

data class SearchPhotosResponseDto(
    val results: List<ResultDto>,
    val total: Int,
    val total_pages: Int
) {

    fun dtoToSearchResponse(): SearchPhotoResponse {
        return SearchPhotoResponse(
            results = results.map {
                it.dtoToResult()
            },
            total = total,
            totalPages = total_pages
        )
    }

}