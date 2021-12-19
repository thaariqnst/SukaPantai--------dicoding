package com.thaariq.sukapantai

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import com.thaariq.sukapantai.data.Beach
import com.thaariq.sukapantai.data.BeachData
import com.thaariq.sukapantai.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity(), View.OnClickListener {

    private var _binding : ActivityDetailBinding? = null
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val btnBack : View? = findViewById(R.id.btn_back)
        btnBack?.setOnClickListener(this)

        val beach = intent.getParcelableExtra<Beach>(DATA_BEACH)

        val beachImage = intent.getIntExtra(EXTRA_IMAGE,0)
        val beachName = intent.getStringExtra(EXTRA_NAME)
        val beachLocation = intent.getStringExtra(EXTRA_LOCATION)
        val beachDetail = intent.getStringExtra(EXTRA_DETAIL)

        if (beach!= null){
            binding.imgDetail.setImageResource(beach.image)
            binding.tvDataJudul.text = beach.name
            binding.beachLocation.text = beach.location
            binding.beachDetail.text = beach.detail
        }else{
            binding.imgDetail.setImageResource(beachImage)
            binding.tvDataJudul.text = beachName
            binding.beachLocation.text = beachLocation
            binding.beachDetail.text = beachDetail
        }
    }

    companion object{
        const val DATA_BEACH = "beach"
        const val EXTRA_IMAGE = "gambar"
        const val EXTRA_NAME = "nama"
        const val EXTRA_LOCATION = "lokasi"
        const val EXTRA_DETAIL = "detail"
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.btn_back ->{
                val moveIntent = Intent(this@DetailActivity,MainActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}