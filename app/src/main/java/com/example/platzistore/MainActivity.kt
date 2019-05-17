package com.example.platzistore

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toast("Hello world from anko")

        txtView.setOnClickListener {
            val text: String = "Hola desde anko"
            startActivity<DetailActivity>("text" to text)
        }
    }
}
