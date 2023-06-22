package com.nsagon.learning.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nsagon.learning.composetutorial.ui.theme.ComposeTutorialTheme

class BusinessCardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }
}

@Composable
fun BusinessCardScreen(
) {
    Column(verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize()) {
        PersonSection(
            image = R.drawable.ic_task_completed,
            fullName = "Sagon Nicolas",
            title = "Mobile developer",
            modifier = Modifier.weight(1f)
        )
        ContactSection(
            phoneNumber = "+33 6 85 49 92 81",
            instagram = "@nsagon",
            email = "sagon.nicolas@gmail.com"
        )
    }
}

@Composable
fun PersonSection(
    @DrawableRes image: Int,
    fullName: String,
    title: String,
    modifier: Modifier = Modifier
) {
    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier.fillMaxSize()) {
        Image(painter = painterResource(id = image), contentDescription = "Logo of the contact", modifier = Modifier
            .width(100.dp)
            .height(100.dp))
        Text(text = fullName, fontWeight = FontWeight.Bold, fontSize = 35.sp, modifier = Modifier.padding(16.dp))
        Text(text = title, fontWeight = FontWeight.SemiBold, fontSize = 25.sp)
    }
}

@Composable
fun ContactSection(
    phoneNumber: String,
    instagram: String,
    email: String,
    modifier: Modifier = Modifier
) {
    Column(horizontalAlignment = Alignment.Start, modifier = modifier.wrapContentWidth().padding(16.dp)) {
        Row(horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(bottom = 16.dp)) {
            Icon(painter = painterResource(id = R.drawable.phone), contentDescription = "Phone icon", modifier = Modifier.width(32.dp).height(32.dp))
            Text(text = phoneNumber, Modifier.padding(start = 16.dp))
        }
        Row(horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(bottom = 16.dp)) {
            Icon(painter = painterResource(id = R.drawable.instagram), contentDescription = "Phone icon", modifier = Modifier.width(32.dp).height(32.dp))
            Text(text = instagram, Modifier.padding(start = 16.dp))
        }
        Row(horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(bottom = 16.dp)) {
            Icon(painter = painterResource(id = R.drawable.email), contentDescription = "Phone icon", modifier = Modifier.width(32.dp).height(32.dp))
            Text(text = email, Modifier.padding(start = 16.dp))
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BusinessCardScreenPreview() {
    ComposeTutorialTheme {
        BusinessCardScreen()
    }
}