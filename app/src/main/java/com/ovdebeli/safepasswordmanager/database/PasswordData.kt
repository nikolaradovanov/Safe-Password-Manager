package com.ovdebeli.safepasswordmanager.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="password_table")
data class PasswordData(
    @PrimaryKey(autoGenerate = true)
    var pwID:Long = 0L,
    @ColumnInfo(name = "password_data")
    var password: String = "",
    @ColumnInfo(name = "email_data")
    var email: String="",
    @ColumnInfo(name = "username_data")
    var username: String="",
    @ColumnInfo(name = "image_id_data")
    var imageID:Int=-1,
    @ColumnInfo(name = "site_name_data")
    var site:String=""
) {
}