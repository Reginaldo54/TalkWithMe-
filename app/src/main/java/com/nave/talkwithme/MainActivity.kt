package com.nave.talkwithme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        contantoID.setOnClickListener {
            var intent = Intent(this, ContactsActivity::class.java)
            startActivity(intent)
        }


        ok.setOnClickListener {
            var intent = Intent(this, ContactsActivity::class.java)
            startActivity(intent)
        }


        AlimentosID.setOnClickListener {
            var intent = Intent(this, Alimento::class.java)
            startActivity(intent)
        }
        }
    }

