package com.example.photogallerycleanarchitectureapp.search.data

interface SearchRepository {

    suspend fun search(query:String)
}