package com.android.example.navigationcomponent


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import entity.City
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = CityAdapter(activity!!,loadData())
        val itemDecor = DividerItemDecoration(activity,1)
        recyclerView.addItemDecoration(itemDecor)
    }


    fun loadData():List<City> {

        //val detailImages = arrayOf(R.drawable.paris_detail,R.drawable.london_detail,R.drawable.barcelone_detail,R.drawable.istanbul_detail,R.drawable.rome_detail)
        val namesTab = resources.getStringArray(R.array.cities)
        val touristsTab = resources.getStringArray(R.array.tourists)
        //val placesTab = resources.getStringArray(R.array.places)
        //val descTab = resources.getStringArray(R.array.description)
        val imagesTab = arrayOf(R.drawable.paris_list,R.drawable.london_list,R.drawable.barcelona_list,R.drawable.istanbul_list,R.drawable.roma_list)
        val list = mutableListOf<City>()
        for (i in 0..imagesTab.size-1) {
            list.add(City(listImage = imagesTab[i], name = namesTab[i], touristNumber = touristsTab[i]))

        }
        return  list
    }

}
