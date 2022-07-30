package com.hady.shoestore

import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.hady.shoestore.databinding.FragmentStoreBinding

class StoreFragment : Fragment() {

    lateinit var viewModel: StoreViewModel
    private lateinit var binding: FragmentStoreBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_store, container, false
        )
        viewModel = ViewModelProvider(requireActivity()).get(StoreViewModel::class.java)

        binding.addNewShoeButton.setOnClickListener { view: View ->
            Navigation.findNavController(view)
                .navigate(R.id.action_storeFragment_to_newShoeFragment)
        }

        activity.let {
            viewModel = ViewModelProvider(it!!).get(StoreViewModel::class.java)
        }
        binding.storeViewModel = viewModel
        binding.lifecycleOwner = this

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

        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        if (binding.name2.text != "") {
            binding.shoe2.visibility = View.VISIBLE
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.logout_menu , menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {


        if (item.itemId == R.id.logoutID){
            findNavController().navigate(R.id.action_storeFragment_to_loginFragment)
        }

        return super.onOptionsItemSelected(item)

    }

}