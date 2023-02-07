package com.example.chen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chen.R
import kotlinx.android.synthetic.main.activity_mudrock.*

class LAPPLAND : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lappland)
        b1.setOnClickListener{

        }
        b2.setOnClickListener{

        }
        b3.setOnClickListener{
            val intent = Intent(this@LAPPLAND, EYJAFJALLA::class.java)
            startActivity(intent)
        }
        b4.setOnClickListener{

        }
    }
}