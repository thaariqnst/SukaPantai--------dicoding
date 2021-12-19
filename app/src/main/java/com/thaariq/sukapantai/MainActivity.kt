package com.thaariq.sukapantai

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.thaariq.sukapantai.data.Beach
import com.thaariq.sukapantai.data.BeachData

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var rvBeach: RecyclerView
    private val list : ArrayList<Beach> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBeach = findViewById(R.id.rv_item)
        rvBeach.setHasFixedSize(true)

        val btnProfileActivity: ImageView = findViewById(R.id.imgbtn_profile)
        btnProfileActivity.setOnClickListener(this)


        rvBeach.layoutManager= LinearLayoutManager(this)
        val listBeachAdapter = ListBeachAdapter(list)
        rvBeach.adapter = listBeachAdapter

        list.addAll(BeachData.listdata)
        showRecyclerList()

    }
    private fun showRecyclerList() {
        rvBeach.layoutManager = LinearLayoutManager(this)
        val listBeachAdapter = ListBeachAdapter(list)
        rvBeach.adapter = listBeachAdapter
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.imgbtn_profile -> {
                val moveIntent = Intent(this@MainActivity, ProfileActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }


}