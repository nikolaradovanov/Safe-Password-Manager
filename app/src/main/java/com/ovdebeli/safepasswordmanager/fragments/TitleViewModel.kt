package com.ovdebeli.safepasswordmanager.fragments

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.ovdebeli.safepasswordmanager.database.PasswordData
import com.ovdebeli.safepasswordmanager.database.PasswordDatabase
import com.ovdebeli.safepasswordmanager.database.PasswordDatabaseDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TitleViewModel (application: Application,pwDao:PasswordDatabaseDao):AndroidViewModel (application){

    private val listData: LiveData<List<PasswordData>>
    private val pwDao = PasswordDatabase.getInstance(application)?.passwordDataDao

    init {
        listData=pwDao.getAll()
    }

    fun addPassword(pw:PasswordData){
        viewModelScope.launch(Dispatchers.IO) {

            if (pwDao != null) {
                pwDao.insert(pw)
            }
        }
    }
}