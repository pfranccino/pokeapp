package com.pfranccino.pokeapp.register.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pfranccino.pokeapp.databinding.FragmentRegisterBinding


class RegisterFragment : Fragment() {

    private lateinit var binding : FragmentRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        binding =  FragmentRegisterBinding.inflate(inflater,container,false)

        binding.btnSignUp.setOnClickListener {

        }

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = RegisterFragment()
    }
}