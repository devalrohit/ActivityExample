package com.example.activityexample.feature.main

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.activityexample.feature.detail.DetailActivity
import com.example.activityexample.R
import com.example.activityexample.databinding.ActivityMainBinding
import com.example.activityexample.model.Person

class MainActivity : AppCompatActivity() {


    private val TAG: String = MainActivity::class.java.simpleName

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: Activity Created")
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setClickAction()
        setBottomNavigation()
    }

    private fun setBottomNavigation() {
        val navController = findNavController(R.id.main_nav_host)
        binding.btnMain.setupWithNavController(navController)
    }

   /* *//*  private fun setClickAction() {
          binding.btnProfile.setOnClickListener {
              navigateToProfile()
          }
      }*/

   /* private fun navigateToProfile() {
        DetailActivity.startActivity(
            this, Person(
                "Rohit", R.drawable.ic_profil, "Priciple Android", "Lorem ipsum set dolot almet"
            )
        )
        Toast.makeText(this, "Navigate to Profile", Toast.LENGTH_LONG).show()
    }*/

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: Activity Started")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: Activity Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: Activity Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: Activity Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: Activity Destroy")
    }
}
