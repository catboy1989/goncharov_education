package com.catboy.goncharov_edu_server.service.repository

import com.catboy.goncharov_edu_server.models.Task
import com.catboy.goncharov_edu_server.repository.RepositoryList

class RepositorySave(private val task: Task) {
    private val repository = RepositoryList

    fun execute(): Task = repository.save(task)

}
