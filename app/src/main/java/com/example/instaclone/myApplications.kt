package com.example.instaclone

import android.app.Application
import android.util.Log
import com.parse.*


class myApplications :Application() {
    override fun onCreate() {
        super.onCreate()

        Parse.enableLocalDatastore(this)

        Parse.initialize(Parse.Configuration.Builder(applicationContext)
            .applicationId("myappID")
            .clientKey("AFcaVqxrHGu0")
            .server("http://34.213.49.191/parse/")
            .build())

        val defaultACL = ParseACL()
        defaultACL.publicReadAccess = true
        defaultACL.publicWriteAccess = true
        ParseACL.setDefaultACL(defaultACL, true)

    }
}