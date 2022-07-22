package com.hady.shoestore

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StoreViewModel : ViewModel() {


    val shoe_1 = ShoeModel("Black_Shoe", 45.5, "Nike", "Good_Shoe")

    private val _shoeName = MutableLiveData<String>()
    val shoeName: LiveData<String>
        get() = _shoeName

    private val _shoeSize = MutableLiveData<String>()
    val shoeSize: LiveData<String>
        get() = _shoeSize

    private val _shoeCompany = MutableLiveData<String>()
    val shoeCompany: LiveData<String>
        get() = _shoeCompany

    private val _shoeDescription = MutableLiveData<String>()
    val shoeDescription: LiveData<String>
        get() = _shoeDescription



    init {
        /*val name_1 : String = shoe_1.name
        val size_1 = shoe_1.size
        val company_1 : String = shoe_1.company
        val desc_1 : String = shoe_1.description*/
        _shoeName.value = shoe_1.name
        _shoeSize.value = shoe_1.size.toString()
        _shoeCompany.value = shoe_1.company
        _shoeDescription.value = shoe_1.description
    }


}