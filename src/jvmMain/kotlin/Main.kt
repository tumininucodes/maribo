import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application


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

fun main() = application {

    Window(
        onCloseRequest = ::exitApplication,
        title = "StopWatch",
    ) {
        App()
    }

}


