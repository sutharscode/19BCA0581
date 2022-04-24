package com.example.a19bca058

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        button.setOnClickListener {
            var intent = Intent(this,Login::class.java)
            startActivity(intent)
        }
        button.setOnClickListener {
            if(edtRegUsername.text.toString().equals("") || edtRegPassword.text.toString().equals("") )
            {
                Toast.makeText(this,"Fill Data Accurately",Toast.LENGTH_LONG).show()
            }
            else if(edtRegPassword.text.toString().length<=7)
            {
                Toast.makeText(this,"Password Must be 8 Character Long!",Toast.LENGTH_LONG).show()
            }
            else
            {
                var us = User(edtRegPassword.text.toString(),edtRegUsername.text.toString())
                var db = DBHelper(this)

                var res = db.insertUser(us)
                if(res>0)
                {
                    Toast.makeText(this,"Register Successfully",Toast.LENGTH_LONG).show()
                    var intent = Intent(this,Login::class.java)
                    startActivity(intent)
                    finish()
                }
            }
        }
    }
}