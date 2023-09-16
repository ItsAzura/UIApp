package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val feed = findViewById<Button>(R.id.button1)
        val video = findViewById<Button>(R.id.button2)
        val Message = findViewById<Button>(R.id.button3)
        val Music = findViewById<Button>(R.id.button4)
        val Notification = findViewById<Button>(R.id.button5)
        val Setting = findViewById<Button>(R.id.button6)
        
        feed.setOnClickListener {
            Toast.makeText(this, "You Clicked Feed", Toast.LENGTH_SHORT).show()
        }
        video.setOnClickListener {
            Toast.makeText(this, "You Clicked Video", Toast.LENGTH_SHORT).show()
        }
        Message.setOnClickListener {
            Toast.makeText(this, "You Clicked Message", Toast.LENGTH_SHORT).show()
        }
        Music.setOnClickListener {
            Toast.makeText(this, "You Clicked Music", Toast.LENGTH_SHORT).show()
        }
        Notification.setOnClickListener {
            Toast.makeText(this, "You Clicked Notification", Toast.LENGTH_SHORT).show()
        }
        Setting.setOnClickListener {
            Toast.makeText(this, "You Clicked Setting", Toast.LENGTH_SHORT).show()
        }
    }
}

