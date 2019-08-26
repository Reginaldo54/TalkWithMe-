package com.nave.talkwithme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        AlimentosID2.setOnClickListener {
            var intent = Intent(this, ContactsActivity::class.java)
            startActivity(intent)
        }
    }
}
