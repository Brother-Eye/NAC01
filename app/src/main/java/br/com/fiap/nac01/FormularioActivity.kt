package br.com.fiap.nac01

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_formulario.*

class FormularioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        btCadastrar.setOnClickListener(){
            cadastrar()
        }
    }

    fun cadastrar(){
        val telaExibicao = Intent(this,DisplayActivity::class.java)
        telaExibicao.putExtra("nome",etNome.text.toString())
        telaExibicao.putExtra("time", spTime.selectedItem.toString())
        startActivity(telaExibicao)
        finish()

    }
}
