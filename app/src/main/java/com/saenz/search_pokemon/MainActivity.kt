package com.saenz.search_pokemon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val KEY_POKE="nombrePokemon"
    lateinit var et_nombre: EditText
    lateinit var tv_repuesta: TextView
    lateinit var bt_enviar: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindView()
        tv_repuesta.text = savedInstanceState?.getString(KEY_POKE).toString()

        bt_enviar.setOnClickListener(){
            tv_repuesta.text = et_nombre.text.toString()
        }
    }
    fun bindView(){
        et_nombre = findViewById(R.id.et_nombrePoke)
        bt_enviar = findViewById(R.id.bt_enviar)
        tv_repuesta = findViewById(R.id.tv_repuesta_poke)
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(KEY_POKE,tv_repuesta.text.toString())
    }
}
