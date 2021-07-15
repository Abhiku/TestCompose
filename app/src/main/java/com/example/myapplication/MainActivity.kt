package com.example.myapplication

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.first.FirstFragment
import com.example.myapplication.second.SecondFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.btn_frag1).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, FirstFragment())
                .commit()
        }

        findViewById<View>(R.id.btn_frag2).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, SecondFragment())
                .commit()
        }
    }
}