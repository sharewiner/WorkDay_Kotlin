package com.sharewiner.workday_kotlin.year2021.month02

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toolbar
import androidx.fragment.app.Fragment
import com.sharewiner.workday_kotlin.R

class ExampleFragment : Fragment(R.layout.fragment_example) {
    lateinit var msg: String
    lateinit var tv_msg: TextView
    lateinit var tb_top: Toolbar

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        msg = requireArguments().get("msg") as String
        tv_msg = view.findViewById(R.id.tv_msg)
        tv_msg.text = msg

        tb_top = view.findViewById(R.id.tb_top)
        tb_top.inflateMenu(R.menu.menu_example)
    }
}
