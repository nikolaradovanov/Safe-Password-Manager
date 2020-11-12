package com.ovdebeli.safepasswordmanager.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.ovdebeli.safepasswordmanager.Data
import com.ovdebeli.safepasswordmanager.PasswordAdapter
import com.ovdebeli.safepasswordmanager.R
import kotlinx.android.synthetic.main.fragment_title.*

class TitleFragment : Fragment() {

    private lateinit var pwAdapter: PasswordAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_title, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
        addDataSet()

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
