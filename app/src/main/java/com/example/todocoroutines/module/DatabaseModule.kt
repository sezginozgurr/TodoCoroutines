package com.example.todocoroutines.module

import androidx.room.Room
import com.example.todocoroutines.data.database.TodoDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val databaseModule = module {


    single {
        Room.databaseBuilder(
            androidContext(),
            TodoDatabase::class.java,
            "todo.db"
        ).build()
    }

    single {
        get<TodoDatabase>().todoDao()
    }
}