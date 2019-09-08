package com.nave.talkwithme

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_alimento.*
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

class Alimento : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alimento)




        FrutasID.setOnClickListener {
            var intent = Intent(this,TelaFruta::class.java)
            startActivity(intent)
            finish()
        }

        CarneID.setOnClickListener {
            var intent = Intent(this, TelaCarne::class.java)
            startActivity(intent)
            finish()
        }

        LegumeID.setOnClickListener {
            var intent = Intent(this, TelaLegume::class.java)
            startActivity(intent)
            finish()
        }


    }

}
