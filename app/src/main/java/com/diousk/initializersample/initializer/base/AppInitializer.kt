package com.diousk.initializersample.initializer.base

import android.app.Application

interface AppInitializer {
    fun init(app: Application)
}