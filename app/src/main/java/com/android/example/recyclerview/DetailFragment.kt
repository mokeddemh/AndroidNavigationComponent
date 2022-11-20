package com.android.example.recyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.android.example.recyclerview.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {

    lateinit var binding:FragmentDetailBinding
    lateinit var cityModel:CityModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        cityModel = ViewModelProvider(requireActivity()).get(CityModel::class.java)
        val position = arguments?.getInt("position")
        if (position != null) {
            val city = cityModel.cities.get(position)
            binding.imageDetail.setImageResource(city.detailImage)
            binding.nameDetail.text = city.name
            binding.numbertouristDetail.text = city.touristNumber + getString(R.string.touristText)
            binding.description.text = city.description
            binding.places.text = getString(R.string.places) + city.places
        }
    }
    }

