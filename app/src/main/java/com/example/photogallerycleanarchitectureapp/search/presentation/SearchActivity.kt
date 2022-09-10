package com.example.photogallerycleanarchitectureapp.search.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.photogallerycleanarchitectureapp.theme.PhotosAppTheme

class SearchActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PhotosAppTheme() {

            }
        }
    }


}