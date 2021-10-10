package com.example.todocoroutines.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.todocoroutines.data.database.Todo
import com.example.todocoroutines.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSave.setOnClickListener {
            val todoTitle = binding.todoTitle.text.toString()
            val todoDescription = binding.todoDescription.text.toString()

            val user = Todo(userName = todoTitle, userSurname = todoDescription)

            mainViewModel.insertUser(user)
        }

        var result = ""
        mainViewModel.getAllTodo.observe(this, {
            result = ""

            it.forEach { todo ->
                result += "${todo.userName} - ${todo.userSurname}"
            }
            binding.textView.text = result
        })
    }
}