package com.movil.manejolayouts.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ColumnaFila(){

    Column(
        modifier = Modifier.padding(vertical = 50.dp, horizontal = 16.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.background(color=Color.Yellow)
                .fillMaxWidth()
                .padding(vertical = 100.dp)
        ) {
            Text(
                text = "Algo 1"
            )
            Text(
                text = "Algo 1"
            )
            Text(
                text = "Algo 1 "
            )
        }
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.background(color=Color.Green)
                .fillMaxWidth()
        ) {
            Text(
                text = "Algo 2"
            )
            Text(
                text = "Algo 2"
            )
            Text(
                text = "Algo 2 "
            )
        }


    }




}