package com.nave.talkwithme

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.tela_fruta.*

class TelaFruta: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_fruta)


       button12.setOnClickListener {
            var intent = Intent(this, AlimentosID::class.java)
            startActivity(intent)
            finish()
        }
    }

}
