package com.hs.islamic.recyclerviewinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hs.islamic.recyclerviewinkotlin.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding :ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle:Bundle?=intent.extras

        val name=bundle!!.getString("food")
        val img=bundle!!.getInt("image")


        binding.imageview.setImageResource(img)
        binding.tvName.text=name










    }
}