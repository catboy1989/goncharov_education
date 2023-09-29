package com.catboy.goncharov_edu_server.service.repository

import com.catboy.goncharov_edu_server.exceptions.TaskNotFoundException
import com.catboy.goncharov_edu_server.models.Task
import com.catboy.goncharov_edu_server.repository.RepositoryList

class RepositoryUpdate(private val task: Task, private val index: Int) {

    private val repository = RepositoryList

    fun execute() = try {
        repository.update(index, task)
    }catch (e: Exception) {
        throw TaskNotFoundException(index)
    }

}
