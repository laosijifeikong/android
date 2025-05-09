package com.devilmcry.myuidesign

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.devilmcry.myuidesign.databinding.LoginLayoutBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: LoginLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val loginButton = findViewById<Button>(R.id.loginButton)

//        binding.
        loginButton.setOnClickListener {
//            val username = binding.usernameEditText.text.toString()
//            val password = binding.passwordEditText.text.toString()

            val username = findViewById<EditText>(R.id.usernameEditText).text.toString()
            val password = findViewById<EditText>(R.id.passwordEditText).text.toString()

            if (username == "admin" && password == "123") {
                // 登录成功
                Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, ListActivity::class.java))
            }else{
                AlertDialog.Builder(this)
                    .setTitle("登录失败")
                    .setMessage("用户名或者密码输入错误")
                    .setPositiveButton("确定", null)
                    .show()
            }
        }
    }
}