package com.example.basics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.basics.ui.theme.BasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingPreview()
                }
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun GreetingPreview() {
    Text(
        text = "Hello now I will develop mobile application using Android Applications",
        fontSize = 28.sp,
        color = Color.Magenta,
        textAlign = TextAlign.Center,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.ExtraBold,
        fontFamily = FontFamily.Monospace,
        letterSpacing = TextUnit.Unspecified,
        textDecoration = TextDecoration.Underline,
        lineHeight = TextUnit.Unspecified,
        softWrap = true
    )
}

@Preview(showSystemUi = true)
@Composable
fun myImage() {
    Image(
        painter = painterResource(id = R.drawable.heart),
        contentDescription ="Dummy",
        alignment = Alignment.Center,
        contentScale = ContentScale.Crop,
        modifier = Modifier,
        colorFilter = ColorFilter.tint(Color.Blue)
    )
}