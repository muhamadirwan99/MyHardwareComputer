package com.dicoding.picodiploma.myhardwarecomputer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        supportActionBar!!.title = "Profile"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

    }
}