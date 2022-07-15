package com.example.egjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.egjetpack.ui.theme.EgjetpackTheme
import androidx.compose.foundation.lazy.LazyColumn as LazyColumn

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        }
    }
                
}




@Composable
fun ListItem(item:String) {
    Row(modifier = Modifier
        .height(100.dp)
        .fillMaxWidth().padding(5.dp)
        .background(color = Color.LightGray)){
        Image(painter = painterResource(id = R.drawable.cprog), contentDescription ="C Progrmming")
        Spacer(modifier = Modifier.width(20.dp))
        Column(verticalArrangement = Arrangement.Center) {
            Text(text =item)
            Text(text="this is $item")

        }
    }
}
@Preview (showBackground = true)
@Composable
fun DefaultPreview(){
    EgjetpackTheme{
        val list = arrayListOf<String>("C Programming", "Html", "Java", "Python","Kotlin")
        LazyColumn(){
            items(list){ item ->
                ListItem(item)
            }

        }
    }
}