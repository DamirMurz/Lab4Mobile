package com.example.lab4

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.LiveData


open class DataModel: ViewModel() {
    val categories: List<CategoryData> = AllObjects.allCategories

    private val _selectedCategory = MutableLiveData<CategoryData>()
    val selectedCategory: LiveData<CategoryData> = _selectedCategory

    private val _selectedPlace = MutableLiveData<ElementData>()
    val selectedPlace: LiveData<ElementData> = _selectedPlace


    fun selectCategory(category: CategoryData) {
        _selectedCategory.value = category
    }

    fun selectPlace(place: ElementData) {
        _selectedPlace.value = place
    }
}