package com.example.restaurant_poli.ui.contacto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.restaurant_poli.R
import com.example.restaurant_poli.databinding.ActivityContactoBinding
import com.example.restaurant_poli.ui.productDetail.ProductDetailViewModel

class contactoFragment : Fragment() {

    private var _binding: ActivityContactoBinding? = null


    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //val productDetailViewModel =  ViewModelProvider(this).get(ProductDetailViewModel::class.java)
        // Inflate the layout for this fragment

        _binding = ActivityContactoBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}