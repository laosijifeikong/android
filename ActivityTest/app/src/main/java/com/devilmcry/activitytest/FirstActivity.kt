package com.devilmcry.activitytest

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity() {
    private val TAG = "FirstActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)
        Log.d(TAG, "${localClassName}: onCreate")

        val button1 = findViewById<Button>(R.id.button1) // 显式Intent
        val button2 = findViewById<Button>(R.id.button2) // 隐式Intent
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)

        button1.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("data", "Hello SecondActivity(传送的信息)")
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent("com.devilmcry.activitytest.Button2")
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent(this, NormalActivity::class.java)
            startActivity(intent)
        }

        button4.setOnClickListener {
            val intent = Intent(this, DialogActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "${localClassName}: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "${localClassName}: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "${localClassName}: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "${localClassName}: onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "${localClassName}: onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "${localClassName}: 退出了，bye!")
    }


}