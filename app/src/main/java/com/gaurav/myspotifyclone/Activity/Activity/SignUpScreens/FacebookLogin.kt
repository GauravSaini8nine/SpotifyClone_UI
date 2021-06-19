package com.gaurav.myspotifyclone.Activity.Activity.SignUpScreens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import com.gaurav.myspotifyclone.R

class FacebookLogin : AppCompatActivity() {
    lateinit var webview: WebView

    var urlLink: String? = "https://touch.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjIzODg1NzM5LCJjYWxsc2l0ZV9pZCI6Nzk2MTcwNzM0NTY5ODY0fQ%3D%3D&refid=8"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facebook_login)


            webview = findViewById(R.id.facebook_webview)




                webview.webViewClient = object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(
                        view: WebView?,
                        url: String?
                    ): Boolean {
                        if (url != null) {


                            view?.loadUrl(url)
                        } else {
                            Toast.makeText(
                                this@FacebookLogin,
                                "Something went wrong.\n Please try again later",
                                Toast.LENGTH_SHORT
                            ).show()
                        }

                        return true
                    }
                }

                urlLink?.let { webview.loadUrl(it) }
                webview.settings.javaScriptEnabled = true
                webview.settings.allowContentAccess = true
                webview.settings.domStorageEnabled = true
                webview.settings.useWideViewPort = true
                webview.settings.setAppCacheEnabled(true)
    }
}