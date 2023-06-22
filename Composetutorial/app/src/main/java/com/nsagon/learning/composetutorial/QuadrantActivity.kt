package com.nsagon.learning.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nsagon.learning.composetutorial.ui.theme.ComposeTutorialTheme

class QuadrantActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuadrantPage(
                    )
                }
            }
        }
    }
}

@Composable
fun QuadrantPage() {

    Column(Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.weight(1f)) {
            Quadrant(
                stringResource(R.string.first_quadrant_title),
                stringResource(R.string.first_quadrant_description),
                Color.Green,
                Modifier.weight(1f)
            )
            Quadrant(
                stringResource(R.string.second_quadrant_title),
                stringResource(R.string.second_quadrant_description),
                Color.Yellow,
                Modifier.weight(1f)
            )
        }
        Row(modifier = Modifier.weight(1f)) {
            Quadrant(
                stringResource(R.string.third_quadrant_title),
                stringResource(R.string.third_quadrant_description),
                Color.Cyan,
                Modifier.weight(1f)
            )
            Quadrant(
                stringResource(R.string.fourth_quadrant_title),
                stringResource(R.string.fourth_quadrant_description),
                Color.Gray,
                Modifier.weight(1f)
            )
        }
    }

}

@Composable
fun Quadrant(title: String, description: String, color: Color, modifier: Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(text = description, textAlign = TextAlign.Justify)
    }
}

@Preview(showBackground = true)
@Composable
fun QuadrantPagePreview() {
    ComposeTutorialTheme {
        QuadrantPage()
    }
}