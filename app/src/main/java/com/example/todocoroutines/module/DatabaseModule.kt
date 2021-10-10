package com.example.todocoroutines.module

import androidx.room.Room
import com.example.todocoroutines.data.database.UserDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val databaseModule = module {


    single {
        Room.databaseBuilder(
            androidContext(),
            UserDatabase::class.java,
            "todo.db"
        ).build()
    }

    single {
        get<UserDatabase>().userDAO()
    }
}