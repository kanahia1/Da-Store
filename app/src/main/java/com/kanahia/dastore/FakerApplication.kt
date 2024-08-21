package com.kanahia.dastore

import android.app.Application
import com.kanahia.dastore.di.ApplicationComponent
import com.kanahia.dastore.di.DaggerApplicationComponent

class FakerApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.factory().create(this)
    }

}