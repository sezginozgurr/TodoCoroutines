package com.example.todocoroutines.data.repository

import androidx.lifecycle.LiveData
import com.example.todocoroutines.data.database.Todo
import com.example.todocoroutines.data.database.TodoDao

class TodoRepository(private val todoDao: TodoDao) {

    fun getAllUser(): LiveData<List<Todo>> = todoDao.getAllTodo()

    suspend fun insertUser(todo: Todo) {
        todoDao.insert(todo)

    }

    suspend fun deleteUser(todo: Todo) {
        todoDao.delete(todo)
    }
}