package com.catboy.goncharov_edu_server.service.repository

import com.catboy.goncharov_edu_server.models.Task
import com.catboy.goncharov_edu_server.repository.RepositoryList

class RepositoryGetAll {

    private val repository = RepositoryList

    fun execute(): ArrayList<Task> = repository.getAll()

}
