package com.nsagon.learning.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nsagon.learning.composetutorial.ui.theme.ComposeTutorialTheme

class JetPackTutorialActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeTutorialPage(
                        stringResource(R.string.tutorial_title),
                        stringResource(R.string.tutorial_first_text),
                        stringResource(R.string.tutorial_second_text)
                    )
                }
            }
        }
    }
}

@Composable
fun ComposeTutorialPage(
    title: String,
    firstText: String,
    secondText: String,
) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column() {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
        )
        Text(text = title, fontSize = 24.sp, modifier = Modifier.padding(16.dp))
        Text(text = firstText, textAlign = TextAlign.Justify, modifier = Modifier.padding(16.dp))
        Text(text = secondText, textAlign = TextAlign.Justify, modifier = Modifier.padding(16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeTutorialTheme {
        ComposeTutorialPage(
            stringResource(R.string.tutorial_title),
            stringResource(R.string.tutorial_first_text),
            stringResource(R.string.tutorial_second_text)
        )
    }
}