package com.example.chen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chen.R
import com.example.chen.LAPPLAND
import kotlinx.android.synthetic.main.activity_mudrock.*

class EXUSIAI : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exusiai)

        b1.setOnClickListener{

        }
        b2.setOnClickListener{

        }
        b3.setOnClickListener{
            val intent = Intent(this@EXUSIAI, LAPPLAND::class.java)
            startActivity(intent)
        }
        b4.setOnClickListener{

        }
    }
}