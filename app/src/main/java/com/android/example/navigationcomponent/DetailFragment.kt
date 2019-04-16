package com.android.example.navigationcomponent


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import entity.City
import kotlinx.android.synthetic.main.fragment_detail.*


class DetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val i = arguments!!.getInt("position")
        val detailImages= arrayOf(R.drawable.paris_detail,R.drawable.london_detail,R.drawable.barcelone_detail,R.drawable.istanbul_detail,R.drawable.rome_detail)
        val namesTab = resources.getStringArray(R.array.cities)
        val touristsTab = resources.getStringArray(R.array.tourists)
        val placesTab = resources.getStringArray(R.array.places)
        val descTab = resources.getStringArray(R.array.description)
        val city = City(detailImage = detailImages[i],name = namesTab[i],touristNumber = touristsTab[i],places = placesTab,description = descTab[i])
        imageDetail.setImageResource(city.detailImage)
        nameDetail.text = city.name
        numbertouristDetail.text  =  if (city.touristNumber.toString()!="") city.touristNumber + getString(R.string.touristText) else  ""
        description.text = city.description
        places.text = if(city.places.size!=0) getString(R.string.places)+city.places.joinToString(separator = ", ") else ""
    }
}
