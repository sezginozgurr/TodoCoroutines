package com.example.todocoroutines.data.repository

import androidx.lifecycle.LiveData
import com.example.todocoroutines.data.database.User
import com.example.todocoroutines.data.database.UserDAO

class TodoRepository(private val userDAO: UserDAO) {

    fun getAllUser(): LiveData<List<User>> = userDAO.getAllUser()

    suspend fun insertUser(user: User) {
        userDAO.insert(user)

    }

    suspend fun deleteUser(user: User) {
        userDAO.delete(user)
    }
}