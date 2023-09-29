package com.catboy.goncharov_edu_server.repository

import com.catboy.goncharov_edu_server.models.Task

object RepositoryList : Repository {

    private val list: ArrayList<Task> = ArrayList()

    override fun getAll(): ArrayList<Task> {
        return list
    }

    override fun get(index: Int): Task {
        return list[index]
    }

    override fun save(item: Task): Task {
        list.add(item)
        return item
    }

    override fun delete(index: Int): Task {
        val task = list[index]
        list.removeAt(index)
        return task
    }

    override fun update(index: Int, task: Task): Task {
        list[index] = task
        return task
    }

    override fun deleteAll() {
        list.clear()
    }
}