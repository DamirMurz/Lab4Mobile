package com.example.lab4.fragmets

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lab4.PlaceAdapter
import com.example.lab4.R
import androidx.recyclerview.widget.RecyclerView
import com.example.lab4.DataModel
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
class CategoryFragmet : Fragment() {
    private val viewModel: DataModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_category, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val controller = findNavController()
        val adapter = PlaceAdapter { selectedPlace ->
            viewModel.selectPlace(selectedPlace)
            findNavController().navigate(R.id.action_categoryFragmet_to_elementFragment)
        }

        val recyclerView = view.findViewById<RecyclerView>(R.id.rcViewCategory)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter

        viewModel.selectedCategory.observe(viewLifecycleOwner) { category ->
            category?.let {
                adapter.setList(it.places)
            }
        }
    }

}