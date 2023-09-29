package com.catboy.goncharov_edu_server.exceptions

class TaskNotFoundException(id: Int) : RuntimeException("В списке нет задачи с номером $id")
