package com.kanahia.dastore.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.kanahia.dastore.db.FakerDB
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun providesFakerDB(context: Context):FakerDB {
        return Room.databaseBuilder(context, FakerDB::class.java, "FakerDB").build()
    }

}