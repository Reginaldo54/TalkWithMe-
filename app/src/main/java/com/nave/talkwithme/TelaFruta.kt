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
            var intent = Intent(this, Bfrut::class.java)
            startActivity(intent)
            finish()
        }

        button13.setOnClickListener {
            var intent = Intent(this, Bfrut::class.java)
            startActivity(intent)
            finish()
        }

        button14.setOnClickListener {
            var intent = Intent(this, Bfrut::class.java)
            startActivity(intent)
            finish()
        }

        button15.setOnClickListener {
            var intent = Intent(this, Bfrut::class.java)
            startActivity(intent)
            finish()
        }

        button16.setOnClickListener {
            var intent = Intent(this, Bfrut::class.java)
            startActivity(intent)
            finish()
        }
    }

}
