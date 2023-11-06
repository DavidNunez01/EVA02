package com.prueba.eva02

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

//No puede hacer funcionar el sharedpreferences desde el otro activity asi que guarda los dato pero no los puede usar
class IngresoProd : AppCompatActivity() {
    private val clave = "VALOR"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingreso_prod)

        var code = findViewById<EditText>(R.id.etxtCodigo)
        var description = findViewById<EditText>(R.id.etxtDescripcion)
        var price = findViewById<EditText>(R.id.etxtPrecio)
        var perecedero = findViewById<EditText>(R.id.etxtPerecedero)
        val create = findViewById<Button>(R.id.btnCrear)

        val sp = getSharedPreferences(clave, Context.MODE_PRIVATE)

        create.setOnClickListener{
            val editor =sp.edit()
            editor.putString(clave, "")
            editor.apply()
            Toast.makeText(this, "Asignando Valores", Toast.LENGTH_LONG).show()
        }

        create.setOnClickListener{
            val intent = Intent(this, Perecedero::class.java)
            startActivity(intent)
        }

    }
}