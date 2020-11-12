package com.ovdebeli.safepasswordmanager

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.ovdebeli.safepasswordmanager.models.Password
import kotlinx.android.synthetic.main.password_list_item.view.*


class PasswordViewHolder constructor( itemView: View) : RecyclerView.ViewHolder(itemView) {
    // val myEmail = itemView.email
    val myUsername = itemView.username
    // val myPassword = itemView.pass
    val myClipArt = itemView.clipArt
    val siteName = itemView.siteName
    fun bind(password: Password){
        //  myEmail.setText(password.email)
        myUsername.setText(password.username)
        //  myPassword.setText(password.password)
        siteName.setText(password.site)
        when (password.imageID){
            1 -> myClipArt.setImageResource(R.drawable.internet)
            2 -> myClipArt.setImageResource(R.drawable.facebook)
            3 -> myClipArt.setImageResource(R.drawable.money)
            4 -> myClipArt.setImageResource(R.drawable.instagram)
            5 -> myClipArt.setImageResource(R.drawable.gmail)
            else -> myClipArt.setImageResource(R.drawable.internet)
        }

    }

}