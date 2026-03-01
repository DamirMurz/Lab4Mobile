package com.example.lab4.fragmets

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lab4.DataModel
import com.example.lab4.MainAdapter
import com.example.lab4.R
import kotlin.getValue
import androidx.recyclerview.widget.RecyclerView
class CategoriesFragment : Fragment() {
    private val viewModel: DataModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_categories, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val controller = findNavController()
        val categories = viewModel.categories
        val adapter = MainAdapter(categories) { selectedCategory ->
            viewModel.selectCategory(selectedCategory)
            findNavController().navigate(R.id.action_mainFragment_to_categoryFragmet)
        }


        val recyclerView = view.findViewById<RecyclerView>(R.id.rcMain)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter
    }
}