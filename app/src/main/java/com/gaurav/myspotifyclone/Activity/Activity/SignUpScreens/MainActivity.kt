package com.gaurav.myspotifyclone.Activity.Activity.SignUpScreens


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import com.gaurav.myspotifyclone.R

class MainActivity : AppCompatActivity() {
    lateinit var signupButton : Button
    lateinit var btnPhone: Button
    lateinit var btnfacebook : Button
    lateinit var btnlogin: Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        signupButton = findViewById(R.id.btnsign_up)
        btnPhone= findViewById(R.id.btnphone)
        btnfacebook = findViewById(R.id.btnfacebook)
        btnlogin = findViewById(R.id.btn_login)




        signupButton.setOnClickListener {
            startActivity(Intent(this, SignupEmail::class.java))
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out_left)

        }

        btnPhone.setOnClickListener {
            startActivity(Intent(this, NumberLoginActivity::class.java))
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out_left)
        }

        btnfacebook.setOnClickListener {
            startActivity(Intent(this, FacebookLogin::class.java))
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out_left)

        }

        btnlogin.setOnClickListener {
            startActivity(Intent(this, BaseLogin::class.java))
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out_left)


        }






    }
}