package com.ovdebeli.safepasswordmanager

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.ovdebeli.safepasswordmanager.fragments.TitleFragmentDirections
import com.ovdebeli.safepasswordmanager.models.Password
import java.util.ArrayList

class PasswordAdapter() : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<Password> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return PasswordViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.password_list_item,parent,false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is PasswordViewHolder ->{
                holder.bind(items.get(position))
                holder.itemView.setOnClickListener(){
                    var  pozicija = position.toString()
                    //Toast.makeText( it.context ,pozicija, Toast.LENGTH_SHORT).show()
                    it.findNavController().navigate(TitleFragmentDirections.actionTitleFragmentToBlankFragment(position))
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
    fun submitList(passList: List<Password>){
        items=passList
    }

}