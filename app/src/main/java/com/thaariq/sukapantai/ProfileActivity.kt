package com.thaariq.sukapantai

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ProfileActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        supportActionBar?.hide()

        val btnBack : View? = findViewById(R.id.btn_back)
        btnBack?.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.btn_back ->{
                val moveIntent = Intent(this@ProfileActivity,MainActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}