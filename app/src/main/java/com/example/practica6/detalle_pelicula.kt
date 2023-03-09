package com.example.practica6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class detalle_pelicula : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)

        val iv_pelicula_imagen: ImageView = findViewById(R.id.iv_peliculas_imagen)
        val tv_nombre_pelicula: TextView = findViewById(R.id.tv_nombre_pelicula)
        val tv_pelicula_desc: TextView = findViewById(R.id.tv_pelicula_desc)

        val bundle = intent.extras

        if(bundle != null){
            iv_pelicula_imagen.setImageResource(bundle.getInt("header"))
            tv_nombre_pelicula.setText(bundle.getString("nombre"))
            tv_pelicula_desc.setText(bundle.getString("sinopsis"))
        }

        val button: Button = findViewById(R.id.buyTickets)

        button.setOnClickListener {
            var intent: Intent = Intent(this, SeatSelection::class.java)
            startActivity(intent)
        }
    }
}