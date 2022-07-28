package com.hady.shoestore

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StoreViewModel : ViewModel() {


    val shoe_1 = ShoeModel("Black_Shoe", 45.5, "Nike", "Good_Shoe")
    val shoe_2 = ShoeModel("White_Shoe", 50.0, "Adidas", "Amazing" )

    val _shoeName = MutableLiveData<String>()
    val _shoeSize = MutableLiveData<String>()
    val _shoeCompany = MutableLiveData<String>()
    val _shoeDescription = MutableLiveData<String>()

    val _shoeName_2 = MutableLiveData<String>()
    val _shoeSize_2 = MutableLiveData<String>()
    val _shoeCompany_2 = MutableLiveData<String>()
    val _shoeDescription_2 = MutableLiveData<String>()



    init {
        _shoeName.value = shoe_1.name
        _shoeSize.value = shoe_1.size.toString()
        _shoeCompany.value = shoe_1.company
        _shoeDescription.value = shoe_1.description

        _shoeName_2.value = shoe_2.name
        _shoeSize_2.value = shoe_2.size.toString()
        _shoeCompany_2.value = shoe_2.company
        _shoeDescription_2.value = shoe_2.description
    }


}