package com.example.activityexample.feature.detail

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.activityexample.databinding.ActivityDetailBinding
import com.example.activityexample.model.Person

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRAS_DETAIL_DATA = "EXTRAS_DETAIL_DATA"

        fun startActivity(context: Context, person: Person) {
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra(EXTRAS_DETAIL_DATA, person)
            context.startActivity(intent)
        }
    }

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getIntentData()
    }

    private fun getIntentData() {
        val person = intent.getParcelableExtra<Person>(EXTRAS_DETAIL_DATA)
        person?.let {
            setProfileImage(it.imgResDrawable)
            setProfileData(it)
        }
    }

    private fun setProfileData(person: Person) {
        binding.tvName.text = person.name
        binding.tvJobDesc.text = person.jobDesc
        binding.tvMoreDetails.text = person.shortDesc
    }

    private fun setProfileImage(imgResDrawable: Int) {
        imgResDrawable?.let {binding.ivProvile.setImageResource(imgResDrawable) }
    }
}

