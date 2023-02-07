package com.example.popukar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chen.MELANTHA
import com.example.chen.R
import kotlinx.android.synthetic.main.activity_mudrock.*

class PROJEKTRED : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_projektred)
        b1.setOnClickListener{

        }
        b2.setOnClickListener{

        }
        b3.setOnClickListener{

        }
        b4.setOnClickListener{
            val intent = Intent(this@PROJEKTRED, MELANTHA::class.java)
            startActivity(intent)
        }
    }
}