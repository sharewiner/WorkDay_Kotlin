package com.sharewiner.workday_kotlin.year2021.month02

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.sharewiner.workday_kotlin.R

class LoginFragment : Fragment() {

    lateinit var et_name: EditText
    lateinit var et_psw: EditText

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        et_name = view.findViewById(R.id.et_name)
        et_psw = view.findViewById(R.id.et_psw)


    }
}