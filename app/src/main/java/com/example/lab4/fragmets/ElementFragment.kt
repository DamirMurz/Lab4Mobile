package com.example.lab4.fragmets

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.lab4.R
import com.example.lab4.DataModel
import androidx.fragment.app.activityViewModels

class ElementFragment : Fragment() {
    private val viewModel: DataModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_element, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val pic = view.findViewById<ImageView>(R.id.pic)
        val name = view.findViewById<TextView>(R.id.nameElText)
        val desc = view.findViewById<TextView>(R.id.descElText)
        viewModel.selectedPlace.observe(viewLifecycleOwner) { place ->
            place?.let {
                name.setText(it.nameRes)
                desc.setText(it.longDescRes)
                pic.setImageResource(it.imageRes)
            }
        }


    }
}