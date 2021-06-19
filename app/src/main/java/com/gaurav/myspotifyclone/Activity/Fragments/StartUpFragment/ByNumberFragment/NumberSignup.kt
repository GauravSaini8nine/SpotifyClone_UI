package com.gaurav.myspotifyclone.Activity.Fragments.StartUpFragment.ByNumberFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.OnBackPressedCallback
import com.gaurav.myspotifyclone.Activity.Fragments.StartUpFragment.SignupEmail.SignUpEmailScreen
import com.gaurav.myspotifyclone.R


class NumberSignup : Fragment() {
    lateinit var btnNextCode : Button


        lateinit var numberanimationLayout: LinearLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_number_signup, container, false)

        numberanimationLayout= view.findViewById(R.id.NumberSLider)
        btnNextCode =view.findViewById(R.id.btn_number_next)




        btnNextCode.setOnClickListener {
            val fragmentManager = requireActivity()!!.supportFragmentManager
            fragmentManager.beginTransaction()
                .setCustomAnimations(R.anim.slide_in, R.anim.slide_out_left)
                .replace(R.id.frameNumber, CodeFragment())
                .commit()
        }



//        Declaring animation
        val slidedown = AnimationUtils.loadAnimation(context, R.anim.slide_down)



//        Seting animation

        numberanimationLayout.startAnimation(slidedown)


        return view
    }


}