package com.devilmcry.activitytest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class NormalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.normal_layout)
    }
}