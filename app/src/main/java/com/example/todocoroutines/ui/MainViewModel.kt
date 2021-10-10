package com.example.todocoroutines.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.todocoroutines.data.database.User
import com.example.todocoroutines.data.repository.TodoRepository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: TodoRepository):ViewModel() {

    fun insertUser(user: User) {
        viewModelScope.launch {
            repository.insertUser(user)
        }
    }

    fun deleteUser(user: User) {
        viewModelScope.launch {
            repository.deleteUser(user)
        }
    }

    val getAllUser: LiveData<List<User>> = repository.getAllUser()
}