package com.android.example.recyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import com.android.example.recyclerview.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    lateinit var binding:FragmentMainBinding
    lateinit var cityModel: CityModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        cityModel = ViewModelProvider(this).get(CityModel::class.java)
        binding.recyclerView.layoutManager = GridLayoutManager(requireActivity(),resources.getInteger(R.integer.nbcol))
        binding.recyclerView.adapter = CityAdapter(requireActivity(),cityModel.cities)
        val itemDecor = DividerItemDecoration(requireActivity(),1)
        binding.recyclerView.addItemDecoration(itemDecor)
    }



}