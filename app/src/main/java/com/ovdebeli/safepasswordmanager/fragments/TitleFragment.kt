package com.ovdebeli.safepasswordmanager.fragments

import android.app.Application
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.database.FirebaseDatabase
import com.ovdebeli.safepasswordmanager.Data
import com.ovdebeli.safepasswordmanager.PasswordAdapter
import com.ovdebeli.safepasswordmanager.R
import kotlinx.android.synthetic.main.fragment_title.*
import com.google.firebase.database.DatabaseError

import com.google.firebase.database.DataSnapshot

import com.google.firebase.database.ValueEventListener
import com.ovdebeli.safepasswordmanager.database.PasswordDatabase


class TitleFragment : Fragment() {

    private lateinit var pwAdapter: PasswordAdapter

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        //konekcija sa bazom
       

        return inflater.inflate(R.layout.fragment_title, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
        addDataSet()
        val database = FirebaseDatabase.getInstance()
        val myRef = database.getReference("message")
        myRef.setValue("Hello, World!")


    }

    private fun addDataSet(){
        val data = Data.createDataSet()
        pwAdapter.submitList(data)
    }

    private fun initRecyclerView(){
        recycler_view.layoutManager = LinearLayoutManager(activity)
        pwAdapter = PasswordAdapter()
        recycler_view.adapter = pwAdapter
    }
}
