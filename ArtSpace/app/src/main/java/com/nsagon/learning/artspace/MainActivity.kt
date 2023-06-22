package com.nsagon.learning.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nsagon.learning.artspace.ui.theme.ArtSpaceTheme
import com.nsagon.learning.artspace.ui.theme.PurpleGrey80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtSpaceLayout()
                }
            }
        }
    }
}

@Composable
fun ArtSpaceLayout(modifier: Modifier = Modifier) {
    var artState by remember {
        mutableStateOf(ArtState.getInitialArtState())
    }
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        ArtImage(
            picture = artState.getCurrentArtPiece().picture,
            pictureDescription = R.string.app_name,
            modifier = Modifier.weight(0.5f).padding(bottom = 32.dp)
        )
        ArtDescription(
            artState.getCurrentArtPiece().pictureTitle,
            artState.getCurrentArtPiece().artistName,
            artState.getCurrentArtPiece().date,
            modifier = Modifier.padding(top = 16.dp)
        )
        ArtControls({artState = artState.previousPiece()}, {artState = artState.nextPiece()})
    }
}

@Composable
fun ArtImage(
    @DrawableRes picture: Int,
    @StringRes pictureDescription: Int,
    modifier: Modifier = Modifier
) {
    Surface(modifier = modifier, shadowElevation = 5.dp) {
        Image(
            painter = painterResource(id = picture),
            contentDescription = stringResource(id = pictureDescription),
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Composable
fun ArtDescription(
    pictureTitle: String,
    artistName: String,
    date: String,
    modifier: Modifier = Modifier
) {
    Surface(
        color = PurpleGrey80, modifier = modifier
            .padding(32.dp)
            .fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = pictureTitle, fontSize = 25.sp, fontStyle = FontStyle.Italic)
            Row {
                Text(text = artistName, fontSize = 15.sp, fontWeight = FontWeight.Bold)
                Text(text = "($date)", modifier = Modifier.padding(start = 4.dp))
            }
        }
    }
}

@Composable
fun ArtControls(
    onPreviousPress: () -> Unit,
    onNextPress: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
        Button(
            onClick = onPreviousPress, modifier = Modifier
                .weight(.5f)
                .padding(end = 16.dp)
        ) {
            Text(text = "Previous")
        }
        Button(
            onClick = onNextPress, modifier = Modifier
                .weight(.5f)
                .padding(start = 16.dp)
        ) {
            Text(text = "Next")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ArtSpaceLayoutPreview() {
    ArtSpaceTheme {
        ArtSpaceLayout()
    }
}