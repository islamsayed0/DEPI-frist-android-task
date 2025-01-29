package com.example.eui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        var Testpass1 = findViewById<TextView>(R.id.View1)
        var Testpass2 = findViewById<TextView>(R.id.View2)
        var gobake = findViewById<Button>(R.id.button2)
        var text1 = intent.getStringExtra("Text1")
        var text2 = intent.getStringExtra("Text2")
        Testpass1.text=text1
        Testpass2.text=text2
        gobake.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))

        }
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        var toast = Toast.makeText(this, "activity 2 onCreate", Toast.LENGTH_LONG)
        toast.show()
    }

    override fun onStart() {
        super.onStart()
        var toast = Toast.makeText(this, "activity 2 onStart", Toast.LENGTH_LONG)
        toast.show()
    }

    override fun onResume() {
        super.onResume()
        var toast = Toast.makeText(this, "activity  2 onResume", Toast.LENGTH_LONG)
        toast.show()
    }

    override fun onStop() {
        super.onStop()
        var toast = Toast.makeText(this, "activity 2 onStop", Toast.LENGTH_LONG)
        toast.show()
    }
}