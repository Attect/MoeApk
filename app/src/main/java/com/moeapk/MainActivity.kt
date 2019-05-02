package com.moeapk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        GlideApp.with(this)
            .load("https://i0.hdslb.com/bfs/live/0dcdf7f8600514ba7bc3d15654ecc7c5a248e478.jpg")
            .into(imageView)
    }
}
