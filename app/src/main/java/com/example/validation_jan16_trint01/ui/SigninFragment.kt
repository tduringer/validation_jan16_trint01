package com.example.validation_jan16_trint01.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.validation_jan16_trint01.R
import com.example.validation_jan16_trint01.databinding.FragmentSigninBinding

class SigninFragment : Fragment() {

    private  var _binding : FragmentSigninBinding? = null
    private val binding : FragmentSigninBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSigninBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            btnSignIn.setOnClickListener {
                Log.d("btnSignIn", "btnSignIn was clicked")

                val correctEmailLogin = tilEmail.editText?.text.toString() == "john@mymail.com"
                Log.d("Email Input", "Email input is ${tilEmail.editText?.text.toString()}")
                Log.d("correctEmailLogin", "correctEmailLogin is $correctEmailLogin")

                val correctPasswordLogin = tilPassword.editText?.text.toString().toInt() == 123456
                Log.d("Password Input", "Password input is ${tilPassword.editText?.text.toString().toInt()}")
                Log.d("correctPasswordLogin", "correctPasswordLogin is $correctPasswordLogin")

                if(correctEmailLogin && correctPasswordLogin) {
                    Log.d("Login Success", "both conditions satisfied for login")
                    parentFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_container_view, MailboxesFragment::class.java, null)
                        .addToBackStack(null)
                        .commit()
                } else {
                    Log.d("Login Failed", "both conditions not satisfied for login")
                    parentFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_container_view, OopsFragment::class.java, null)
                        .addToBackStack(null)
                        .commit()
                }

            }
        }
    }
}