package com.example.photogallerycleanarchitectureapp.search.domain.models

data class Result(
    val id:String,
    val description:String,
    val altDescription:String,
    val createdTime:String,
    val color:String,
    val urls: Urls,
    val user:User
)