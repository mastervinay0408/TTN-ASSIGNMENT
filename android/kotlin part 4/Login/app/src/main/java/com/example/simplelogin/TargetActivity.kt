package com.example.simplelogin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TargetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)

        var tvInfo = findViewById<TextView>(R.id.tv_info)
        val i = getIntent()
//        var usrName: String = i.getStringExtra("UserName")
//        var usrPass: String = i.getStringExtra("Password")
//        tvInfo.setText(usrName + " " + usrPass)

    }
}
