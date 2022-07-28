package com.hady.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.hady.shoestore.databinding.FragmentStoreBinding

class StoreFragment : Fragment() {

    lateinit var viewModel: StoreViewModel
    private lateinit var binding: FragmentStoreBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater , R.layout.fragment_store , container , false
        )
        viewModel = ViewModelProvider(this).get(StoreViewModel::class.java)
        binding.storeViewModel = viewModel
        binding.lifecycleOwner = this



        binding.addNewShoeButton.setOnClickListener {view:View ->
            Navigation.findNavController(view).navigate(R.id.action_storeFragment_to_newShoeFragment)
        }


        /*viewModel.shoeName.observe(viewLifecycleOwner , Observer {
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
        })*/

        return binding.root
    }

    /*fun goToAddNewShoe(view: View){
            Navigation.findNavController(view).navigate(R.id.action_storeFragment_to_newShoeFragment)
    }*/

}