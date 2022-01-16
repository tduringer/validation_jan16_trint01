package com.example.validation_jan16_trint01.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.validation_jan16_trint01.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container_view, SigninFragment())
                .commit()
        }
    }
}