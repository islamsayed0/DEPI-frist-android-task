package com.example.eui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var But = findViewById<Button>(R.id.button5)

        But.setOnClickListener{
            callActivity()
        }
    }

    private fun callActivity() {
        val Text1 = findViewById<EditText>(R.id.Text1)
        val Text2 = findViewById<EditText>(R.id.Text2)
        val pass1 =Text1.text.toString()
        val pass2 = Text2.text.toString()
        startActivity(Intent(this,MainActivity2::class.java)
            .putExtra("Text1",pass1)
            .putExtra("Text2",pass2)

        )
    }
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        var toast = Toast.makeText(this, "activity 1onCreate", Toast.LENGTH_LONG)
        toast.show()
    }

    override fun onStart() {
        super.onStart()
        var toast = Toast.makeText(this, "activity 1 onStart", Toast.LENGTH_LONG)
        toast.show()
    }

    override fun onResume() {
        super.onResume()
        var toast = Toast.makeText(this, "activity 1 onResume", Toast.LENGTH_LONG)
        toast.show()
    }

    override fun onStop() {
        super.onStop()
        var toast = Toast.makeText(this, "activity 1 onStop", Toast.LENGTH_LONG)
        toast.show()
    }
}

