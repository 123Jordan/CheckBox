package com.example.iteradmin.checkbox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.View
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View) {
        val id:Int = v.id
       when(id) {
           R.id.checkBox -> {
               toast("Modi")
           }
           R.id.checkBox2 -> {
               toast("Pappu")
           }
           R.id.checkBox3 -> {
               toast("Didi")
           }
           R.id.checkBox4 -> {
               toast("Shyam")
           }
           R.id.checkBox5 -> {
               toast("Naveen")
           }
       }
    }
    fun toast(message:String)  {
        Toast.makeText(applicationContext, message + " will be the next PM of Inda.", Toast.LENGTH_LONG).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ch1 = findViewById<CheckBox>(R.id.checkBox)
        val ch2 = findViewById<CheckBox>(R.id.checkBox2)
        val ch3 = findViewById<CheckBox>(R.id.checkBox3)
        val ch4 = findViewById<CheckBox>(R.id.checkBox4)
        val ch5 = findViewById<CheckBox>(R.id.checkBox5)

        ch1.setOnClickListener(this)
        ch2.setOnClickListener(this)
        ch3.setOnClickListener(this)
        ch4.setOnClickListener(this)
        ch5.setOnClickListener(this)

    }
}
