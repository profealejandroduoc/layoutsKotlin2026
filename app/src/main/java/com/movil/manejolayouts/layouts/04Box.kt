package com.movil.manejolayouts.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun EjemploBox(){

    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier.padding(vertical = 50.dp, horizontal = 10.dp)
            //.background(color=Color.Blue)
            .fillMaxSize()

    ){
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.size(100.dp)
                .background(color=Color.Red)
        ){
            Text(
                text = "+",
                fontSize = 60.sp,
                color=Color.White
            )
        }


    }

    Box(
        contentAlignment = Alignment.BottomEnd,
        modifier = Modifier.padding(vertical = 50.dp, horizontal = 10.dp)
            //.background(color=Color.LightGray)
            .fillMaxSize()

    ){
        Box(
            modifier = Modifier.size(100.dp)
                .background(color=Color.Green)
        )


    }


}