package com.example.busi_card1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.busi_card1.ui.theme.Busi_card1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Busi_card1Theme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    busi_Card()
                }
            }
        }
    }
}

@Composable
fun  busi_Card() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Logo Android
        Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = "null",
            modifier = Modifier
                .size(100.dp)
                .padding(top = 25.dp),
            contentScale = ContentScale.Crop
        )

        // Name and Title
        Text(
            text = " Ahizi Alex ",
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold

        )
        Text(
            text = "Informaticien",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .absolutePadding(bottom = 120.dp)
        )
        Row {
            Image(
                painter = painterResource(R.drawable.telephoner),
                modifier = Modifier
                    .size(55.dp),
                contentDescription = "null"
            )
            Text(
                text = "+225 01 70 24 05 68",
                modifier = Modifier
                    .absolutePadding(top = 12.dp),
                fontSize = 22.sp
            )
        }
        Row {
            Image(
                painter = painterResource(R.drawable.snapchat),
                modifier = Modifier
                    .size(45.dp),
                contentDescription = "null"
            )
            Text(
                text = "Alexx.ahizi snap",
                fontSize = 22.sp,
                modifier = Modifier
                    .absolutePadding(left = 5.dp, top = 10.dp)
            )
        }
        Row {
            Image(
                painter = painterResource(R.drawable.email__1_),
                modifier = Modifier
                    .size(45.dp),
                contentDescription = "null"
            )
            Text(
                text = " ahizialex22@gmail.com",
                fontSize = 22.sp,
                modifier = Modifier
                    .absolutePadding(top = 10.dp, left = 5.dp),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBusinessCard() {
    busi_Card()
}