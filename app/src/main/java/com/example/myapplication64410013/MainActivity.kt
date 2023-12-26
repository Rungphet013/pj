package com.example.myapplication64410013

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val display = findViewById(R.id.textView5) as TextView
        val button2 = findViewById(R.id.button2) as Button
        val button3 = findViewById(R.id.button3) as Button
        val button4 = findViewById(R.id.button4) as Button
        val button5 = findViewById(R.id.button5) as Button
        val button6 = findViewById(R.id.button6) as Button
        val button7 = findViewById(R.id.button7) as Button
        val button8 = findViewById(R.id.button8) as Button
        val button9 = findViewById(R.id.button9) as Button
        val button10 = findViewById(R.id.button10) as Button
        val button11 = findViewById(R.id.button11) as Button
        button2.setOnClickListener {
            display.setText("1")
        }
        button3.setOnClickListener {
            display.setText("2")
        }
        button4.setOnClickListener {
            display.setText("3")
        }
        button5.setOnClickListener {
            display.setText("4")
        }
        button6.setOnClickListener {
            display.setText("5")
        }
        button7.setOnClickListener {
            display.setText("6")
        }
        button8.setOnClickListener {
            display.setText("7")
        }
        button9.setOnClickListener {
            display.setText("8")
        }
        button10.setOnClickListener {
            display.setText("9")
        }
        button11.setOnClickListener {
            display.setText("=")
        }
    }
        //btn_ok.setOnClickListener{it: View!
                //display.text("111111")}
    }
