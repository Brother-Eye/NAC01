package br.com.fiap.nac01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_display.*

class DisplayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        tvNome.text = intent.getStringExtra("nome")
        tvTime.text = intent.getStringExtra("time")
    }
}
