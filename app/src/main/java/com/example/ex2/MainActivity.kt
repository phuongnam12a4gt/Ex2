package com.example.ex2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_ex2.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //var btnEx1:Button =findViewById(R.id.btn_ex1)
        btn_ex1.setOnClickListener {
            var intent: Intent =Intent(this,Ex1::class.java)
            startActivity(intent)
        }
        btn_ex2.setOnClickListener {
            var intent: Intent =Intent(this,Ex2::class.java)
            startActivity(intent)
        }
        btn_linear.setOnClickListener {
            var intent: Intent =Intent(this,uienglishlinearlayout::class.java)
            startActivity(intent)
        }
        btn_relative.setOnClickListener {
            var intent: Intent =Intent(this,uienglishrelativelayout::class.java)
            startActivity(intent)
        }
    }
}
