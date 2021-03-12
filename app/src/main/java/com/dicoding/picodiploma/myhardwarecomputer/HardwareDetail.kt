package com.dicoding.picodiploma.myhardwarecomputer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.widget.ImageView
import android.widget.TextView
import androidx.core.graphics.drawable.toDrawable
import com.codesgood.views.JustifiedTextView

class HardwareDetail : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "name"
        const val EXTRA_DETAIL = "detail"
        const val EXTRA_IMAGES = "images"
    }
    private var title: String = "My Hardware Computer"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hardware_detail)

        val tvDetail : JustifiedTextView = findViewById(R.id.tv_item_detail)
        val imgPhoto : ImageView = findViewById(R.id.img_item_photo)

        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val photo = intent.getIntExtra(EXTRA_IMAGES,0)

        tvDetail.text = detail?.toString()
        imgPhoto.setImageResource(photo)

        title = name?.toString().toString()

        setActionBarTitle(title)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

}