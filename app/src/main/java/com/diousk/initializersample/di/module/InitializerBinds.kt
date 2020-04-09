package com.diousk.initializersample.di.module

import com.diousk.initializersample.initializer.HelloInitializer
import com.diousk.initializersample.initializer.base.AppInitializer
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet

@Module
abstract class InitializerBinds {
    @Binds
    @IntoSet
    abstract fun bindHelloInitializer(initializer: HelloInitializer): AppInitializer
}