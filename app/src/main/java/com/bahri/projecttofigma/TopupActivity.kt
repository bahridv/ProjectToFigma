package com.bahri.projecttofigma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TopupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topup)
        supportActionBar?.hide()
    }
}