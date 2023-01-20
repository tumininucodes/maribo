package ui

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import domain.StopWatch
import theme.darkColors

@Composable
@Preview

fun StopWatchScreen(
    modifier: Modifier = Modifier
) {

    MaterialTheme(colors = darkColors()) {

        val stopWatch = remember { StopWatch() }

        Scaffold {
            Box(modifier = modifier.fillMaxSize()) {
                Image(
                    painterResource("background.svg"),
                    "background",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )
                Column(
                    modifier = modifier.align(Alignment.Center),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = stopWatch.formattedTime,
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp,
                        color = Color.White
                    )
                    Spacer(modifier.height(16.dp))
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = modifier.fillMaxWidth()
                    ) {
                        Button(stopWatch::start) {
                            Text("Start", color = Color.White)
                        }
                        Spacer(modifier.width(16.dp))
                        Button(stopWatch::pause) {
                            Text("Pause", color = Color.White)
                        }
                        Spacer(modifier.width(16.dp))
                        Button(stopWatch::reset) {
                            Text("Reset", color = Color.White)
                        }
                    }
                }
            }
        }

    }
}