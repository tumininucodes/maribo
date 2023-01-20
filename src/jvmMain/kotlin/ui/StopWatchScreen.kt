package ui

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import theme.darkColors

@Composable
@Preview

fun StopWatchScreen() {

    MaterialTheme(colors = darkColors()) {

        Scaffold {
            Box(modifier = Modifier.fillMaxSize()) {
                Image(
                    painterResource("background.svg"),
                    "background",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )

            }
        }

    }
}