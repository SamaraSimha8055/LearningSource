package com.example.demo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class Search: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.search,container,false)

        val textView = view.findViewById<TextView>(R.id.et_search)

        textView.setOnClickListener {

            Toast.makeText(view.context,"Search clicked", Toast.LENGTH_SHORT).show()
        }
        return view
    }


}