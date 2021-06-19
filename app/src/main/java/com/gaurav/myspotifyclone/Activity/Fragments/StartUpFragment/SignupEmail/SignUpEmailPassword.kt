package com.gaurav.myspotifyclone.Activity.Fragments.StartUpFragment.SignupEmail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import com.gaurav.myspotifyclone.R


class SignUpEmailPassword : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sign_up_email_password, container, false)

        val callback = object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                val fragmentManager = requireActivity()!!.supportFragmentManager
                fragmentManager.beginTransaction()
                    .setCustomAnimations(R.anim.slide_in_left, R.anim.slideout_right)
                    .replace(R.id.frame, SignUpEmailScreen())
                    .commit()
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(callback)
        return view
    }


}