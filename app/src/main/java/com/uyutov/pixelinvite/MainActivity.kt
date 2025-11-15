package com.uyutov.pixelinvite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRowScopeInstance.align
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.uyutov.pixelinvite.ui.theme.PixelInviteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PixelInviteTheme {
                GreetingText(
                    message = "Royal Decree!\nDear Pavel,\nHis Majesty the King\n" +
                            "Invite you to a great feast\nCome to the castle before sunset,\n" +
                            "otherwise, you risk losing your head!", from = "From King Arthur",
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = message,
            fontSize = 20.sp,
            lineHeight = 40.sp,
            textAlign = TextAlign.Center
        )
    }
    Text(
        text = from,
        fontSize = 24.sp,
        modifier = Modifier
            .padding(16.dp)

    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PixelInviteTheme {
        GreetingText(
            message = "Royal Decree!\nDear Pavel,\nHis Majesty the King\n" +
                    "Invite you to a great feast\nCome to the castle before sunset,\n" +
                    "otherwise, you risk losing your head!", from = "From King Arthur"
        )
    }
}