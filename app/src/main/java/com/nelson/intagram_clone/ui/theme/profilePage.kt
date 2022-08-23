package com.nelson.intagram_clone.ui.theme

import android.graphics.drawable.Icon
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.R
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun profilePage(){

    Column(modifier= Modifier
        .fillMaxSize()
        .padding(8.dp)){

        Spacer(modifier= Modifier.height(10.dp))

        Row(modifier= Modifier
            .fillMaxWidth()
            .padding(20.dp, 0.dp),
            verticalAlignment = Alignment.Top){

            Text(text = "humble_asino", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        }

        Spacer(modifier= Modifier.height(30.dp))

        Row(modifier= Modifier
            .fillMaxWidth()
            .padding(10.dp, 0.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically) {

            imageCard()

            details(num = 111, text = "Posts")
            details(num = 127, text = "Following")
            details(num = 901, text = "Followers")

        }

        Spacer(modifier = Modifier.height(5.dp))

        about()

        Spacer(modifier = Modifier.height(20.dp))

        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {

            Buttons(text = "Following")
            Buttons(text = "Message")
            Buttons(text = "Add")


        }

        Spacer(modifier = Modifier.height(30.dp))

        Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly){
           story()
            story()
            story()
            story()
        }

        Spacer(modifier = Modifier.height(30.dp))

        posts()
    }
}

@Composable
fun imageCard(){
    Card(modifier = Modifier
        .size(130.dp)
        .padding(10.dp),
        shape = CircleShape,
        backgroundColor = Color.Green) {

//        Image(
//            painter = painterResource(id = R.drawable.img),
//            contentDescription = "profileImg",
//            contentScale = ContentScale.Crop)

    }
}

@Composable
fun details( num:Int, text:String){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(text = "$num",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(3.dp))

        Text(text = text )
    }
}

@Composable
fun about(){
    Column {
        Text(text = "humble_asino", fontWeight = FontWeight.Bold)
        Text(text = "Hello everyone")
        Text(text = "I enjoy coding and love android")
        Text(text = "I love JETPACK COMPOSE")

    }
}

@Composable
fun Buttons(text:String){
    Button(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.LightGray
        )
    ) {
        Row(modifier = Modifier.padding(5.dp,2.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically){
            Text(text = text, color = Color.Black)
        }
    }
}

@Composable
fun story(){
    Card(modifier = Modifier.size(70.dp),
        shape = CircleShape,
        backgroundColor = Color.Green) {

    }
}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun posts(){
    LazyVerticalGrid(
        cells = GridCells.Fixed(count = 3),
        contentPadding = PaddingValues(0.dp)
    ){
        items( count= 20) {
            Card(modifier = Modifier
                .size(100.dp, 150.dp)
                .padding(2.dp),
                shape = RoundedCornerShape(2.dp),
                backgroundColor = Color.LightGray) {
            }
        }
    }
}

