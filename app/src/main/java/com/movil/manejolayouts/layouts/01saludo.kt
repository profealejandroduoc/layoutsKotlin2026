package com.movil.manejolayouts.layouts

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Saludo(){
    Text(
        text = "Hola mundo Android desde package Layout",
        modifier = Modifier.padding(vertical = 46.dp, horizontal = 16.dp),
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Monospace
    )
}

@Composable
fun SaludoConNombre(nombre:String){
    Text(
        text = "Hola $nombre",
        modifier = Modifier.padding(vertical = 96.dp, horizontal = 16.dp)
    )
}