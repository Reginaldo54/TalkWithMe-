package com.nave.talkwithme
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        next_code_btn.setOnClickListener {

            var code = input_code.text.toString()

            if(code == "223355"){
                var intent = Intent(this, RegisterActivity::class.java)
                startActivity(intent)
                finish()
            }
            else{
                toast("Codigo errado!")
            }
        }
    }

    private fun toast(text: String){
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}