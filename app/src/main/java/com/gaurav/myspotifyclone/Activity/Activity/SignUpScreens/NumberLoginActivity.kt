package com.gaurav.myspotifyclone.Activity.Activity.SignUpScreens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gaurav.myspotifyclone.Activity.Fragments.StartUpFragment.ByNumberFragment.NumberSignup
import com.gaurav.myspotifyclone.R

class NumberLoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_login)


        supportFragmentManager.beginTransaction()
            .replace(R.id.frameNumber, NumberSignup())
            .commit()
    }
}