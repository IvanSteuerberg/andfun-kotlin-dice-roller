/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
//Cargamos la imagen
    lateinit var diceImage: ImageView

    //Sobreescribimos la funcion onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        //Cargamos el constructor
        super.onCreate(savedInstanceState)

        //Cargamos el layout
        setContentView(R.layout.activity_main)

        //Esta es la variable del botón
        val rollButton: Button = findViewById(R.id.boton)

        //Método que lanza rollDice() al hacer click en el botón
        rollButton.setOnClickListener {
            rollDice()
        }

        //Busca la vista por el id (en este caso es dice_image)
        diceImage = findViewById(R.id.dice_image)
    }

    //Función rollDice, la variable randomInt es un numero aleatorio del 1 al 6 y en un switch, en cada caso realiza una acción.
    private fun rollDice() {
        val randomInt = Random().nextInt(7) + 1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_7
        //Añadi un dado extra con 7 caras y colores diferentes
        }

        //Estas son las imagenes que cargaremos en cada caso
        diceImage.setImageResource(drawableResource)
    }
}
