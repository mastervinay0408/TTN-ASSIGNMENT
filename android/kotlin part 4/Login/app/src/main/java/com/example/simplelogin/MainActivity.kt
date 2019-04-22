package com.example.simplelogin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etUserName = findViewById<EditText>(R.id.et_user_name)
        var etPassword = findViewById<EditText>(R.id.et_password)
        var btnReset = findViewById<Button>(R.id.btn_reset)
        var btnSubmit = findViewById<Button>(R.id.btn_submit)

        btnReset.setOnClickListener{
            etUserName.setText("");
            etPassword.setText("");
        }

        btnSubmit.setOnClickListener{
            var userName = etUserName.text
            var password = etPassword.text

            val intent = Intent(this, TargetActivity::class.java)
            intent.putExtra("UserName", userName)
            intent.putExtra("Password", password)
            startActivity(intent)
        }
    }


}
