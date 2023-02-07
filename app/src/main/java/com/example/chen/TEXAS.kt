package com.example.chen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chen.R
import com.example.popukar.PROJEKTRED
import kotlinx.android.synthetic.main.activity_mudrock.*

class TEXAS : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_texas)

        b1.setOnClickListener{

        }
        b2.setOnClickListener{

        }
        b3.setOnClickListener{

        }
        b4.setOnClickListener{
            val intent = Intent(this@TEXAS, PROJEKTRED::class.java)
            startActivity(intent)
        }
    }
}