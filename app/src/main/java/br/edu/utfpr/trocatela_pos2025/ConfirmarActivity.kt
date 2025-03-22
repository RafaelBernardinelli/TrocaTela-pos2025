package br.edu.utfpr.trocatela_pos2025

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ConfirmarActivity : AppCompatActivity() {

    private lateinit var tvCode : TextView
    private lateinit var tvQtd : TextView
    private lateinit var tvValor : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmar)

        val cod = intent.getStringExtra("cod")
        val qtd = intent.getStringExtra("qtd")
        val valor = intent.getStringExtra("valor")

        tvCode = findViewById( R.id.tvCod)
        tvQtd = findViewById( R.id.tvQtd)
        tvValor = findViewById( R.id.tvValor)

        tvCode.setText(cod)
        tvQtd.setText(qtd)
        tvValor.setText(valor)
    }
}