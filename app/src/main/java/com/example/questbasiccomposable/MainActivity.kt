package com.example.questbasiccomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questbasiccomposable.ui.theme.QuestBasicComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestBasicComposableTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCOmpose(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
    @Preview
    @Composable
    fun BasicCOmpose(modifier: Modifier = Modifier){
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = modifier.fillMaxSize()
        ){
            Text(
                text = "Login",
                style = TextStyle(
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                ),
            )
            Text(
                text = "Ini adalah Halaman Login",
                modifier = modifier.padding(bottom = 1.dp),
                style = TextStyle(
                    fontSize = 20.sp,
                    fontStyle = FontStyle.Italic,
                    color = Color.DarkGray,
                    fontWeight = FontWeight.Normal
                ),
            )
            Image(
                painter = painterResource(id = R.drawable.umy),contentDescription = null,
                //modifier = modifier.padding(bottom = 10.dp),
            )
            Text(
                text = "Nama",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium
                ),
            )
            Text(
                text = "Andi Granityo Jhon Jassin",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.Black
                )
            )
            Text(
                text = "20220140086",
                style = TextStyle(
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Bold
                )

            )
            Image(
                painter = painterResource(id = R.drawable.tyo),contentDescription = null
            )



        }
    }

}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}






