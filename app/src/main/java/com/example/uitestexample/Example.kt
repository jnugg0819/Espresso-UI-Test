package com.example.uitestexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_example.*

class Example : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example)

        val intent=getIntent()
        val send=intent.getStringExtra("send")

        textView2.text=send
    }
}
