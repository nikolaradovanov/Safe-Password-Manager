package com.ovdebeli.safepasswordmanager.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.ovdebeli.safepasswordmanager.Data
import com.ovdebeli.safepasswordmanager.R
import com.ovdebeli.safepasswordmanager.databinding.FragmentPasswordDetailsBinding
import kotlinx.android.synthetic.main.fragment_password_details.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [PasswordDetailsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PasswordDetailsFragment : Fragment() {
    private lateinit var binding:FragmentPasswordDetailsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_password_details,container,false)
        var view=binding.root

        var args = PasswordDetailsFragmentArgs.fromBundle(arguments)
        val myClipArt = view.clipArtDetails
        val niz = Data.createDataSet()
        when (niz.get(args.passwordID).imageID){
            1 -> myClipArt.setImageResource(R.drawable.internet)
            2 -> myClipArt.setImageResource(R.drawable.facebook)
            3 -> myClipArt.setImageResource(R.drawable.money)
            4 -> myClipArt.setImageResource(R.drawable.instagram)
            5 -> myClipArt.setImageResource(R.drawable.gmail)
            else -> myClipArt.setImageResource(R.drawable.internet)
        }
        view.pwTitleDetails.setText(niz.get(args.passwordID).site)
       //Toast.makeText(activity,"Primio sam argumente: pozicija: ${args.passwordID}",Toast.LENGTH_SHORT).show()

        return view

    }


}