package com.example.todocoroutines.data.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class Todo(

    @PrimaryKey(autoGenerate = true)
    val userId: Int = 0,

    @ColumnInfo(name = "userName")
    val userName: String,

    @ColumnInfo(name = "userSurname")
    val userSurname: String
)
