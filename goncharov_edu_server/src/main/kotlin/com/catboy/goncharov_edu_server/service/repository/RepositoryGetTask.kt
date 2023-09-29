package com.catboy.goncharov_edu_server.service.repository

import com.catboy.goncharov_edu_server.exceptions.TaskNotFoundException
import com.catboy.goncharov_edu_server.repository.RepositoryList

class RepositoryGetTask(private val id: Int) {
    private val repository = RepositoryList

    fun execute() = try {
        repository.get(id)
    }catch (e: Exception) {
        throw TaskNotFoundException(id)
    }
}
