package com.example.merging_xml.presentation.utils

import android.app.Application
import com.example.merging_xml.data.database.PreferenceManager
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MergingApplication : Application() {
    companion object {
        lateinit var prefs: PreferenceManager
    }

    override fun onCreate() {
        super.onCreate()
        prefs = PreferenceManager(applicationContext)
    }
}
