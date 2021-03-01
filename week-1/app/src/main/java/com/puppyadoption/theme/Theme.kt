package com.puppyadoption.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightThemeColors = lightColors(
    primary = BrownPrimary,
    primaryVariant = BrownLight,
    onPrimary = Color.White,
    secondary = WaterSecondary,
    secondaryVariant = WaterSecondaryLight,
    onSecondary = Color.Black,
    background = Color.White,
    surface = GrayLight
)

private val DarkThemeColors = darkColors(
    primary = BrownPrimary,
    primaryVariant = BrownDark,
    onPrimary = Color.Black,
    secondary = WaterSecondary,
    secondaryVariant = WaterSecondaryDark,
    onSecondary = Color.Black,
    background = Color.Black,
    surface = GrayDark,
)

@Composable
fun ComposeTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = if (isSystemInDarkTheme()) DarkThemeColors else LightThemeColors,
        content = content
    )
}
