package com.example.activityexample.feature.about

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.activityexample.R
import com.example.activityexample.databinding.FragmentAboutBinding
import com.example.activityexample.feature.detail.DetailActivity
import com.example.activityexample.model.Person


class AboutFragment : Fragment() {

    private lateinit var binding : FragmentAboutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentAboutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setClickAction() // Call setClickAction here
    }

    private fun setClickAction() {
        binding.btnProfile.setOnClickListener {
            navigateToProfile()
        }
    }

    private fun navigateToProfile() {
        DetailActivity.startActivity(
            requireContext(), Person(
                "Rohit", R.drawable.ic_profil, "Priciple Android", "Lorem ipsum set dolot almet"
            )
        )
        //Toast.makeText(this, "Navigate to Profile", Toast.LENGTH_LONG).show()
    }
}
