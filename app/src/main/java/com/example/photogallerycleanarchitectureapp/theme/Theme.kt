package com.example.photogallerycleanarchitectureapp.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val darkThemePallete = darkColors(
    primary = Color(0xFF101010)
)

val lightThemePallete = lightColors(
    primary = Color.White
)


@Composable
fun PhotosAppTheme(
    isDark:Boolean= isSystemInDarkTheme(),
    content : @Composable () -> Unit
){
    val colors = if(isDark){
        darkThemePallete
    }
    else{
        lightThemePallete
    }

    MaterialTheme(
        colors = colors,
        content = content
    )
}