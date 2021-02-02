package com.ovdebeli.safepasswordmanager.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase




@Database (entities = [PasswordData::class],version = 1,exportSchema = false)
abstract class  PasswordDatabase:RoomDatabase(){
 abstract val passwordDataDao:PasswordDatabaseDao
 companion object{
     @Volatile
     private var INSTANCE: PasswordDatabase?=null
     fun getInstance(context: Context): PasswordDatabase? {
         synchronized(this){
             var instance = INSTANCE
             if(instance==null){
                 instance= Room.databaseBuilder(context.applicationContext,
                 PasswordDatabase::class.java,
                 "password_database")
                         .fallbackToDestructiveMigration()
                         .build()
                 INSTANCE=instance
             }
             return instance
         }
     }
 }
}
