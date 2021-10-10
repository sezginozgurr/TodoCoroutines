package com.example.todocoroutines.data.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [User::class], version = 2,exportSchema = false)
abstract class UserDatabase : RoomDatabase() {

    abstract fun userDAO(): UserDAO
}