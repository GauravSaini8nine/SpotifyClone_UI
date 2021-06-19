package com.gaurav.myspotifyclone.Activity.Activity

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.gaurav.myspotifyclone.R

open class BaseToolbar : AppCompatActivity() {
    internal fun activateToolbar(enableHome: Boolean) {
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(enableHome)
    }

}