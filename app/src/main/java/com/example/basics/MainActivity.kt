package com.example.basics

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
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
        contentDescription = "Dummy",
        alignment = Alignment.Center,
        contentScale = ContentScale.Crop,
        modifier = Modifier,
        colorFilter = ColorFilter.tint(Color.Blue)
    )
}

@Preview(showSystemUi = true)
@Composable
fun myButton() {

    Button(
        onClick = {},
        shape = ButtonDefaults.elevatedShape,
        colors = ButtonDefaults.buttonColors(Color.Cyan),
        elevation = ButtonDefaults.buttonElevation(5.dp),
        border = BorderStroke(2.dp, Color.Magenta),
        contentPadding = PaddingValues(20.dp)
    ) {
        Text(
            text = "Button",
            color = Color.DarkGray
        )
        Image(
            painter = painterResource(id = R.drawable.heart),
            contentDescription = ""
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun MyTextFeild() {
    val state = remember {
        mutableStateOf("")
    }
    val state2 = remember {
        mutableStateOf("As")
    }
    TextField(
        value = state.value,
        onValueChange = {
            state.value = it
        },
        label = {
            Text(text = "Enter Email")
        },
        textStyle = TextStyle(
            color = Color.Cyan,
            fontSize = 32.sp
        ),
        leadingIcon = {
            Image(painter = painterResource(id = R.drawable.heart), contentDescription = "")
        },
        trailingIcon = {
            Image(painter = painterResource(id = R.drawable.heart), contentDescription = "")
        },
        prefix = {
                 Text(state2.value)
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    )
}

@Preview(showSystemUi = true)
@Composable
fun myLayout() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Aseem", fontSize = 26.sp)
            Text(text = "Paul", fontSize = 26.sp)
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Absolute.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Aseem", fontSize = 26.sp)
            Text(text = "Paul", fontSize = 26.sp)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun firstLayoutPreview() {
    Column {
        firstLayout(R.drawable.user,"John Doe","Software Engineer")
        firstLayout(R.drawable.user,"John Doe","Software Engineer")
        firstLayout(R.drawable.user,"John Doe","Software Engineer")
        firstLayout(R.drawable.user,"John Doe","Software Engineer")
        firstLayout(R.drawable.user,"John Doe","Software Engineer")
        firstLayout(R.drawable.user,"John Doe","Software Engineer")
        firstLayout(R.drawable.user,"John Doe","Software Engineer")
        firstLayout(R.drawable.user,"John Doe","Software Engineer")
        firstLayout(R.drawable.user,"John Doe","Software Engineer")
        firstLayout(R.drawable.user,"John Doe","Software Engineer")
        firstLayout(R.drawable.user,"John Doe","Software Engineer")
        firstLayout(R.drawable.user,"John Doe","Software Engineer")
        firstLayout(R.drawable.user,"John Doe","Software Engineer")
        firstLayout(R.drawable.user,"John Doe","Software Engineer")
        firstLayout(R.drawable.user,"John Doe","Software Engineer")
        firstLayout(R.drawable.user,"John Doe","Software Engineer")
        firstLayout(R.drawable.user,"John Doe","Software Engineer")
        firstLayout(R.drawable.user,"John Doe","Software Engineer")
        firstLayout(R.drawable.user,"John Doe","Software Engineer")
        firstLayout(R.drawable.user,"John Doe","Software Engineer")
        firstLayout(R.drawable.user,"John Doe","Software Engineer")
        firstLayout(R.drawable.user,"John Doe","Software Engineer")
        firstLayout(R.drawable.user,"John Doe","Software Engineer")
        firstLayout(R.drawable.user,"John Doe","Software Engineer")
        firstLayout(R.drawable.user,"John Doe","Software Engineer")

    }
}

@Composable
fun firstLayout(image: Int, name: String, designation: String) {
    Row(
        horizontalArrangement = Arrangement.Absolute.Left,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = "",
            modifier = Modifier.padding(8.dp)
        )
        Column(
            modifier = Modifier.padding(2.dp)
        ) {
            Text(text = name, fontWeight = FontWeight.Bold)
            Text(text = designation)
        }
    }
}












