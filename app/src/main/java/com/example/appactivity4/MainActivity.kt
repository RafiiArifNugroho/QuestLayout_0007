package com.example.appactivity4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appactivity4.ui.theme.AppActivity4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            AppActivity4Theme {
                Greeting()
            }
        }
    }
}

@Composable
fun Greeting() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 100.dp)
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // Judul
            Text(
                text = stringResource(R.string.prodi),
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold
            )

            // Universitas
            Text(
                text = stringResource(R.string.univ),
                fontSize = 22.sp
            )

            Spacer(
                modifier = Modifier.height(25.dp)
            )

            // Card
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                colors = CardDefaults.cardColors(
                    containerColor = colorResource(R.color.card_0_bg)
                )
            ) {

                Row(
                    modifier = Modifier.padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    // Logo UMY
                    Image(
                        painter = painterResource(R.drawable.logo_umy),
                        contentDescription = "Logo UMY",
                        modifier = Modifier
                            .size(100.dp)
                            .padding(5.dp)
                    )

                    Spacer(
                        modifier = Modifier.width(20.dp)
                    )

                    // Nama dan alamat
                    Column {

                        Text(
                            text = stringResource(R.string.nama),
                            fontSize = 30.sp,
                            fontFamily = FontFamily.Cursive,
                            color = Color.White
                        )

                        Spacer(
                            modifier = Modifier.height(8.dp)
                        )

                        Text(
                            text = stringResource(R.string.alamat),
                            fontSize = 20.sp,
                            color = Color.Yellow
                        )
                    }
                }
            }
        }

        // Copyright
        Text(
            text = stringResource(R.string.copy),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 50.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppActivity4Theme {
        Greeting()
    }
}