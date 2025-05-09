package com.devilmcry.activitytest

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    private val TAG = "SecondActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)
        Log.d(TAG, "${localClassName}: onCreate")

        val dataFromFirstActivity = intent.getStringExtra("data")
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = dataFromFirstActivity

        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            val intent = Intent(this, FirstActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "${localClassName}: 退出了，bye!")
    }
}