package br.edu.utfpr.trocatela_pos2025

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListarActivity : AppCompatActivity() {

    private lateinit var lvProdutos : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listar)

        lvProdutos = findViewById( R.id.lvProdutos)

        lvProdutos.setOnItemClickListener{ parent, view, position, id ->
            val itemSelecionadoId = position + 1

            intent.putExtra("codRetorno", itemSelecionadoId)

            setResult(RESULT_OK, intent)

            finish()

        }

    }

}