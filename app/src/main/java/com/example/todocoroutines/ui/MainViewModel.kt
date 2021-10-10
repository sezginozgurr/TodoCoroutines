package com.example.todocoroutines.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.todocoroutines.data.database.Todo
import com.example.todocoroutines.data.repository.TodoRepository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: TodoRepository):ViewModel() {

    fun insertUser(todo: Todo) {
        viewModelScope.launch {
            repository.insertUser(todo)
        }
    }

    fun deleteUser(todo: Todo) {
        viewModelScope.launch {
            repository.deleteUser(todo)
        }
    }

    val getAllTodo: LiveData<List<Todo>> = repository.getAllUser()
}