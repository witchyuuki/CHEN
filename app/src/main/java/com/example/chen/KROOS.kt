package com.example.chen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chen.R
import kotlinx.android.synthetic.main.activity_mudrock.*

class KROOS : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kroos)
        b1.setOnClickListener{

        }
        b2.setOnClickListener{

        }
        b3.setOnClickListener{
            val intent = Intent(this@KROOS, EXUSIAI::class.java)
            startActivity(intent)
        }
        b4.setOnClickListener{

        }
    }
}