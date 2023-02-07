package com.example.chen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chen.R
import com.example.chen.TEXAS
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_mudrock.*
import kotlinx.android.synthetic.main.activity_mudrock.b1
import kotlinx.android.synthetic.main.activity_mudrock.b2
import kotlinx.android.synthetic.main.activity_mudrock.b3
import kotlinx.android.synthetic.main.activity_mudrock.b4

class Mudrock : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mudrock)

        b1.setOnClickListener{

        }
        b2.setOnClickListener{
            val intent = Intent(this@Mudrock, TEXAS::class.java)
            startActivity(intent)
        }
        b3.setOnClickListener{

        }
        b4.setOnClickListener{

        }


    }
}