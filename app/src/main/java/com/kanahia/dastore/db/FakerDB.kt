package com.kanahia.dastore.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.kanahia.dastore.models.Product

@Database(entities = [Product::class], version = 1)
abstract class FakerDB : RoomDatabase(){

    abstract fun getDao() : FakerDAO

}