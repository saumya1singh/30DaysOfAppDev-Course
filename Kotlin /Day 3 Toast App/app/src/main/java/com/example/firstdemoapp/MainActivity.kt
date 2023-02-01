package com.example.firstdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonUpload= findViewById<Button>(R.id.btnUpload)
        val buttonDownLoad= findViewById<Button>(R.id.btnDownload)
        val layout= findViewById<LinearLayout>(R.id.linear)

        buttonUpload.setOnClickListener {
            Toast.makeText(applicationContext, "Uploading..", Toast.LENGTH_SHORT).show()
        }

        buttonDownLoad.setOnClickListener {
            layout.setBackgroundResource(R.color.purple_200)
        }
    }
}