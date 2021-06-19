package com.gaurav.myspotifyclone.Activity.Fragments.StartUpFragment.SignupEmail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.gaurav.myspotifyclone.R


class SignUpEmailScreen : Fragment() {

    lateinit var btnEmailnext : Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sign_up_email_screen, container, false)
        btnEmailnext = view.findViewById(R.id.btn_email_next)


        btnEmailnext.setOnClickListener {
            val fragmentManager = requireActivity()!!.supportFragmentManager
            fragmentManager.beginTransaction()
                .setCustomAnimations(R.anim.slide_in, R.anim.slide_out_left)
                .replace(R.id.frame, SignUpEmailPassword())
                .commit()
        }





        return view
    }


}