package com.catboy.goncharov_edu_server.service.repository

import com.catboy.goncharov_edu_server.exceptions.TaskNotFoundException
import com.catboy.goncharov_edu_server.repository.RepositoryList

class RepositoryDelete(private val index: Int) {

    private val repository = RepositoryList

    fun execute() = try {
        repository.delete(index)
    }catch (e: Exception) {
        throw TaskNotFoundException(index)
    }



}
