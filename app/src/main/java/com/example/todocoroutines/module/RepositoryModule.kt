package com.example.todocoroutines.module

import com.example.todocoroutines.data.repository.TodoRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { TodoRepository(get()) }
}