package com.movil.manejolayouts.layouts

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldEjemplo(){

    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Blue ,
                    titleContentColor = Color.White
                ),
                title = {
                    Text(
                        text = "Scaffold con Topbar"
                    )
                }
            )

        },
        floatingActionButton = {
            FloatingActionButton(
                containerColor = Color.Blue,
                shape = CircleShape,
                onClick = { /*TODO*/}
            ) {
                Text(
                    text = "+",
                    fontSize = 40.sp,
                    color =Color.White
                )




            }
        }

    ) {
        paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)
            .fillMaxSize()

        ){
            Text(
                text = "Hola"
            )
        }
    }
}
