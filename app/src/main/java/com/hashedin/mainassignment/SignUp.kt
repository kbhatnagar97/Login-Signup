package com.hashedin.mainassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_log_in.*
import kotlinx.android.synthetic.main.activity_sign_up.*
import kotlinx.android.synthetic.main.activity_sign_up.back_button
import kotlinx.android.synthetic.main.activity_sign_up.textView3
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignUp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        back_button.setOnClickListener()
        {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        text2.setOnClickListener()
        {
            val intent = Intent(this,LogIn::class.java)
            startActivity(intent)
        }

        val mob = mobile_number.text.toString()
        var flagGenerate : Int = 0
        var flagVerify : Int = 0


        }
    }

