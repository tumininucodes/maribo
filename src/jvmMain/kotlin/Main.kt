import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import ui.StopWatchScreen


fun main() = application {

    Window(
        onCloseRequest = ::exitApplication,
        title = "StopWatch Timer",
        icon = painterResource("icon.png")
    ) {
        StopWatchScreen(modifier = Modifier)
    }

}


