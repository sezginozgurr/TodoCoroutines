package com.example.todocoroutines

import android.app.Application
import com.example.todocoroutines.module.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class TodoApp :Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@TodoApp)
            modules(appModules)
        }
    }
}