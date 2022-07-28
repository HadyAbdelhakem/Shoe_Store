package com.hady.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.hady.shoestore.databinding.FragmentNewShoeBinding

class NewShoeFragment : Fragment() {

    private lateinit var binding: FragmentNewShoeBinding
    private lateinit var viewModel: StoreViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater
        , R.layout.fragment_new_shoe , container , false)

        viewModel = ViewModelProvider(this).get(StoreViewModel::class.java)
        binding.addViewModel = viewModel

        binding.lifecycleOwner = this

        binding.buttonAddNewShoe.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(R.id.action_newShoeFragment_to_storeFragment)
        }


        return binding.root
    }

}