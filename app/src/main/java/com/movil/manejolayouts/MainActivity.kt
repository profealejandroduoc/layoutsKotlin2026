package com.movil.manejolayouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.movil.manejolayouts.layouts.ColumnaFila
import com.movil.manejolayouts.layouts.EjemploBox
import com.movil.manejolayouts.layouts.EjemploColumnas
import com.movil.manejolayouts.layouts.EjemploFilas
import com.movil.manejolayouts.layouts.Saludo
import com.movil.manejolayouts.layouts.SaludoConNombre
import com.movil.manejolayouts.layouts.ScaffoldEjemplo


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //Saludo()
            //SaludoConNombre("Diogenes")
            //EjemploColumnas()
            //EjemploFilas()
            //ColumnaFila()
            //EjemploBox()
            ScaffoldEjemplo()
        }
    }
}



