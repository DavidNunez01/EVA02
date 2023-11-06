package com.prueba.eva02

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Perecedero : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perecedero)

        var diasVences = findViewById<EditText>(R.id.etxtDiasVencer)
        var calcularValor = findViewById<Button>(R.id.btnCalcularNuevoValor)
        var nuevoValor = findViewById<EditText>(R.id.etxtNuevoValor)

        calcularValor.setOnClickListener {
            //intentar asignar el valor que se calculo al campo nuevo valor, (error de sintaxis mio, se deja como pseudocodigo)
            //var valor = calcularValor()
            //nuevoValor = valor
        }

    }

    //funcion para calcular el nuevo valor
    fun calcularValor(precio: String, dias: String) {
        if (dias == "1") {
            precio.toInt()/4
        } else {
            if (dias=="2"){
                precio.toInt()/3
            } else {
                precio.toInt()/2
            }
        }
    }
}