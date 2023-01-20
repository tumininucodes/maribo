package ui

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

@Composable
@Preview
fun App() {
    var text by remember { mutableStateOf("Hd!") }

    MaterialTheme(colors = darkColors()) {

        Scaffold {
            Box(modifier = Modifier.fillMaxSize()) {
                Image(
                    painterResource("background.svg"),
                    "background",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )

                Button(modifier = Modifier.align(Alignment.BottomCenter), onClick = {
                    text = "Hello, Desktop!"
                }) {
                    Text(text)
                }
            }

        }


    }
}