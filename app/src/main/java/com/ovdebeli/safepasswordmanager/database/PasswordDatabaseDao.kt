package com.ovdebeli.safepasswordmanager.database

import androidx.room.*

@Dao
interface PasswordDatabaseDao {

    @Insert
    fun insert(pw:PasswordData)

    @Update
    fun update(pw: PasswordData)

    @Query("Select * From password_table Where pwID = :key")
    fun get(key:Long):PasswordData

    @Query("Delete from password_table")
    fun clear()

     @Query("Select * from password_table")
     fun getAll():List<PasswordData>


}