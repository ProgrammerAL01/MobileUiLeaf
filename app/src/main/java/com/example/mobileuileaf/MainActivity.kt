package com.example.mobileuileaf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val view:CardView=findViewById(R.id.btn_confirm)
        view.setOnClickListener{
            Toast.makeText(applicationContext,"Welcome to Leaf World",Toast.LENGTH_SHORT).show();
        }
    }
}