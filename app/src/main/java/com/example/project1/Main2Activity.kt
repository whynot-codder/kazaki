package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun btnRazb(view: View){
        val intent1 = Intent(this, MainActivity::class.java)
        startActivity(intent1)
    }
    fun btnKaz(view: View){
        val intent = Intent(this, Main3Activity::class.java)
        startActivity(intent)
    }
}
