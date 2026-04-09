package com.example.demoapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonUpload = findViewById<Button>(R.id.btnUpload)
        val buttonDownload = findViewById<Button>(R.id.btnDownload)
        val layout = findViewById<LinearLayout>(R.id.linearlayout)
        val toolbar = findViewById<com.google.android.material.appbar.MaterialToolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        val btnIntent = findViewById<Button>(R.id.Clickme)


        btnIntent.setOnClickListener {
         intent = Intent(applicationContext, Secondactivity::class.java)
            startActivity(intent)
        }
        /* buttonUpload.setOnClickListener {
             Toast.makeText(this@MainActivity,"Uploading...",Toast.LENGTH_LONG).show()
             android.util.Log.d("TEST","CLICKED")
         }
         buttonDownload.setOnClickListener {
             Toast.makeText(this@MainActivity,"Downloading...",Toast.LENGTH_LONG).show()
         }
         */

        buttonDownload.setOnClickListener {
            Snackbar.make(findViewById(android.R.id.content), "Downloading...", Snackbar.LENGTH_LONG).show()
            //on click dark mode
            layout.setBackgroundResource(R.color.yellow)
        }

        buttonUpload.setOnClickListener {
            Snackbar.make(findViewById(android.R.id.content), "Uploading...", Snackbar.LENGTH_LONG).show()
            //on click read mode
            layout.setBackgroundResource(R.color.black)
        }


    }
    }
