package com.hady.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.hady.shoestore.databinding.FragmentStoreBinding

class StoreFragment : Fragment() {

    private lateinit var viewModel: StoreViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentStoreBinding>(
            inflater , R.layout.fragment_store , container , false
        )
        binding.storeViewModel = this
        viewModel = ViewModelProvider(this).get(StoreViewModel::class.java)
        viewModel.shoeName.observe(viewLifecycleOwner , Observer {
            binding.name1.text = it
        })
        viewModel.shoeSize.observe(viewLifecycleOwner , Observer {
            binding.size1.text = it
        })
        viewModel.shoeCompany.observe(viewLifecycleOwner , Observer {
            binding.company1.text = it
        })
        viewModel.shoeDescription.observe(viewLifecycleOwner , Observer {
            binding.description1.text = it
        })

        return binding.root
    }

}