package com.example.jogodavelha

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnClick(view: View) {

        val btnSelecionado = view as Button
        var cellId = 0

        when (btnSelecionado.id) {
            R.id.btn_1 -> cellId = 1
            R.id.btn_2 -> cellId = 2
            R.id.btn_3 -> cellId = 3
            R.id.btn_4 -> cellId = 4
            R.id.btn_5 -> cellId = 5
            R.id.btn_6 -> cellId = 6
            R.id.btn_7 -> cellId = 7
            R.id.btn_8 -> cellId = 8
            R.id.btn_9 -> cellId = 9
        }
        play(cellId, btnSelecionado)
        //Toast.makeText(context this, text"ID":+cellId, Toast.LENGHT_SHORT).show()
    }

    // Array guarda a jogada de cada jogador
    var jogador1 = ArrayList<Int>()
    var jogador2 = ArrayList<Int>()

    // Inicio do jogo
    var jogada = 1

    fun play(cellId: Int, btnSelecionado: Button) {

        if (jogada == 1) {

            btnSelecionado.text = "X"
            btnSelecionado.setBackgroundColor(Color.GREEN)
            jogador1.add(cellId)
            jogada = 2
        } else {
            btnSelecionado.text = "O"
            btnSelecionado.setBackgroundColor(Color.MAGENTA)
            jogador2.add(cellId)
            jogada = 3
        }
        btnSelecionado.isEnabled = false
    }

    fun validaVencedor() {
        var ganhador = -1

        // verifica ganhador linha 1
        if (jogador1.contains(1) && jogador1.contains(2) && jogador1.contains(3)) {
            ganhador = 1
        }

        if (jogador2.contains(1) && jogador2.contains(2) && jogador2.contains(3)) {
            ganhador = 2
        }

        if (jogador1.contains(4) && jogador1.contains(5) && jogador1.contains(6)) {
            ganhador = 1
        }

        if (jogador2.contains(4) && jogador2.contains(5) && jogador2.contains(6)) {
            ganhador = 2
        }

        if (jogador1.contains(7) && jogador1.contains(8) && jogador1.contains(9)) {
            ganhador = 1
        }

        if (jogador2.contains(7) && jogador2.contains(8) && jogador2.contains(9)) {
            ganhador = 2
        }

        if (jogador1.contains(1) && jogador1.contains(4) && jogador1.contains(7)) {
            ganhador = 1
        }

        if (jogador2.contains(1) && jogador2.contains(4) && jogador2.contains(7)) {
            ganhador = 2
        }

        if (jogador1.contains(2) && jogador1.contains(5) && jogador1.contains(8)) {
            ganhador = 1
        }

        if (jogador2.contains(2) && jogador2.contains(5) && jogador2.contains(8)) {
            ganhador = 2
        }

        if (jogador1.contains(3) && jogador1.contains(6) && jogador1.contains(9)) {
            ganhador = 1
        }

        if (jogador2.contains(3) && jogador2.contains(6) && jogador2.contains(9)) {
            ganhador = 2
        }

        if (jogador1.contains(1) && jogador1.contains(5) && jogador1.contains(9)) {
            ganhador = 1
        }

        if (jogador2.contains(1) && jogador2.contains(5) && jogador2.contains(9)) {
            ganhador = 2
        }

        if (jogador1.contains(3) && jogador1.contains(5) && jogador1.contains(7)) {
            ganhador = 1
        }

        if (jogador2.contains(3) && jogador2.contains(5) && jogador2.contains(7)) {
            ganhador = 2
        }

        if (ganhador != -1) {
            if (ganhador == 1) {
                Toast.makeText(this, "JOGADOR 1 GANHOU O JOGO", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "JOGADOR 2 GANHOU O JOGO", Toast.LENGTH_SHORT).show()
            }
        }
    }
}


