package com.catboy.goncharov_edu_server.repository

import com.catboy.goncharov_edu_server.models.Task

interface Repository {

    fun getAll(): ArrayList<Task>
    fun get(index: Int): Task
    fun save(item: Task): Task
    fun delete(index: Int): Task
    fun update(index: Int, task: Task): Task
    fun deleteAll()
}