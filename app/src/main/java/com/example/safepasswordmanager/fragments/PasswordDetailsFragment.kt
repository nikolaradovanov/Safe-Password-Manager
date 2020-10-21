package com.example.safepasswordmanager.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.safepasswordmanager.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [PasswordDetailsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PasswordDetailsFragment : Fragment() {
    // TODO: Rename and change types of parameters

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        var args = PasswordDetailsFragmentArgs.fromBundle(arguments)
        Toast.makeText(activity,"Primio sam argumente: pozicija: ${args.passwordID}",Toast.LENGTH_SHORT).show()

        return inflater.inflate(R.layout.fragment_password_details, container, false)

    }

}