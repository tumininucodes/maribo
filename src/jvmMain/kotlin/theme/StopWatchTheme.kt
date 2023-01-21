package theme

import androidx.compose.material.Colors
import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


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

val fontFamily = FontFamily(
    androidx.compose.ui.text.platform.Font(
        resource = "openSansMedium.ttf",
        weight = FontWeight.Normal,
    )
)

fun typography(): Typography {
    return Typography(
        h1 = TextStyle(
            fontSize = 60.sp,
            fontFamily = fontFamily,
        ),
        body1 = TextStyle(
            fontSize = 18.sp,
            fontFamily = fontFamily,
        )
    )
}