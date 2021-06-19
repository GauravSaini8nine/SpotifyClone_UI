package com.gaurav.myspotifyclone.Activity.Activity.SignUpScreens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import com.gaurav.myspotifyclone.Activity.Fragments.StartUpFragment.SignupEmail.SignUpEmailScreen
import com.gaurav.myspotifyclone.R

class SignupEmail : AppCompatActivity() {
//    lateinit var framelayout : FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_email)

//        framelayout = findViewById(R.id.frame)


        supportFragmentManager.beginTransaction()
            .replace(R.id.frame, SignUpEmailScreen())
            .commit()

    }
}