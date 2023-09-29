package com.catboy.goncharov_edu_server.controllers

import com.catboy.goncharov_edu_server.exceptions.TaskNotFoundException
import com.catboy.goncharov_edu_server.models.Task
import com.catboy.goncharov_edu_server.service.repository.*
import org.springframework.web.bind.annotation.*


@RestController
class TaskController {

    @GetMapping("/")
    fun mainPage() = "Сервер работает. Всё хорошо!"

    @GetMapping("/tasks")
    fun getAll() = RepositoryGetAll().execute()

    @GetMapping("/tasks/{id}")
    fun getTask(@PathVariable id: Int): Task = RepositoryGetTask(id).execute()

    @PostMapping("/tasks")
    fun newTask(@RequestBody newTask: Task): Task {
        return RepositorySave(newTask).execute()
    }

    @PutMapping("/tasks/{id}")
    fun updateTask(@RequestBody task: Task, @PathVariable id: Int): Task {
        return RepositoryUpdate(task, id).execute()
    }

    @DeleteMapping("/tasks/{id}")
    fun deleteTask(@PathVariable id: Int): Task {
        return RepositoryDelete(id).execute()
    }

    @ExceptionHandler(TaskNotFoundException::class)
    fun handleException(e: TaskNotFoundException): String? {
        return e.message
    }

}