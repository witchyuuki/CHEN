package com.example.chen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chen.R
import com.example.chen.MYRTLE
import kotlinx.android.synthetic.main.activity_mudrock.*

class EYJAFJALLA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eyjafjalla)
        b1.setOnClickListener{
            val intent = Intent(this@EYJAFJALLA, MYRTLE::class.java)
            startActivity(intent)
        }
        b2.setOnClickListener{

        }
        b3.setOnClickListener{

        }
        b4.setOnClickListener{

        }
    }
}