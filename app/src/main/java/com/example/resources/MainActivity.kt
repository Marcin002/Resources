package com.example.resources

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wstecz = findViewById<Button>(R.id.tyl)
        val dalej = findViewById<Button>(R.id.przod)
        val zdj = findViewById<ImageView>(R.id.zdjecie)
        val tekst = findViewById<TextView>(R.id.napis)

        val ob1 = "Zdjecie 1-3"
        val ob2 = "Zdjecie 2-3"
        val ob3 = "Zdjecie 3-3"

        var i=1;
        dalej.setOnClickListener {
            i++;
            if (i==1) {
                zdj.setImageResource(R.drawable.zdj1)
                tekst.text = ob1
            }
            else if (i==2){
                zdj.setImageResource(R.drawable.zdj2)
                tekst.text = ob2
            }
            else if (i>=3){
                zdj.setImageResource(R.drawable.zdj3)
                tekst.text = ob3
                i=3
            }
        }

        wstecz.setOnClickListener {
            i--
            if (i<=1){
                zdj.setImageResource(R.drawable.zdj1)
                tekst.text = ob1
                i=1
            }
            else if (i==2){
                zdj.setImageResource(R.drawable.zdj2)
                tekst.text = ob2
            }
            else if (i==3){
                zdj.setImageResource(R.drawable.zdj3)
                tekst.text = ob3
            }
        }
    }
    }
}