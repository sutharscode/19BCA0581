package com.example.a19bca058

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var sp : SharedPreferences = getSharedPreferences("MyPref", MODE_PRIVATE)
        var st = sp.getString("UserName","tt")

        Handler().postDelayed({
            if(st.equals("tt"))
            {
                var intent = Intent(this,Login::class.java)
                startActivity(intent)
                finish()
            }
            else
            {
                var intent = Intent(this,HomePage::class.java)
                startActivity(intent)
                finish()
            }
        },5000)
    }
}

