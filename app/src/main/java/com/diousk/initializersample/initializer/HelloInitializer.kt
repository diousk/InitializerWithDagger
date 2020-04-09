package com.diousk.initializersample.initializer

import android.app.Application
import android.util.Log
import com.diousk.initializersample.initializer.base.AppInitializer
import javax.inject.Inject

class HelloInitializer @Inject constructor() : AppInitializer {
    override fun init(app: Application) {
        Log.d("HelloInitializer", "Hello World!")
        // do initialization for some dependent library
    }
}
