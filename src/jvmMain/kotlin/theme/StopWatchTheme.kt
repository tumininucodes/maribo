package theme

import androidx.compose.material.Colors
import androidx.compose.ui.graphics.Color


fun darkColors(): Colors {
    return Colors(
        primary = Color.Blue,
        primaryVariant = Color.Black,
        secondary = Color.LightGray,
        background = Color.DarkGray,
        secondaryVariant = Color.White,
        surface = Color.DarkGray,
        error = Color.Red,
        onPrimary = Color.White,
        onSecondary = Color.White,
        onBackground = Color.White,
        onSurface = Color.White,
        onError = Color.Red,
        isLight = false
    )
}
