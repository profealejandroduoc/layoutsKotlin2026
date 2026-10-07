package com.movil.manejolayouts.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun EjemploColumnas(){

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(vertical = 60.dp, horizontal = 16.dp)
            .background(color= Color.Red)
            //.fillMaxWidth()
            //.fillMaxHeight()
            .fillMaxSize()

    ) {

        Text(
            text="Columnas JetPack Compose",
            fontSize = 20.sp
        )
        Text(
            text="Permite organizar el contenido"
        )

        Text(
            text = "Para evitar hacer mucho trabajo"
        )
    }


}