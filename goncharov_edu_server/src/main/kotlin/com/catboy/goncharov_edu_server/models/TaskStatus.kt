package com.catboy.goncharov_edu_server.models

enum class TaskStatus {
    START, UPDATE, SEND, REWORK, COMPLETE;

    override fun toString(): String = when(this) {
        START -> "Задача добавлена"
        UPDATE -> "Задача обновлена"
        SEND -> "Задача отправлена на проверку"
        REWORK -> "Задача отправлена на доработку"
        COMPLETE -> "Задача выполнена"
    }

    companion object {
        fun get(statusString: String): TaskStatus =
            when(statusString) {
                "Задача добавлена" -> START
                "Задача обновлена" -> UPDATE
                "Задача отправлена на проверку" -> SEND
                "Задача отправлена на доработку" -> REWORK
                "Задача выполнена" -> COMPLETE
                else -> START
            }

        fun getArray() = arrayOf("Задача добавлена", "Задача обновлена",
            "Задача отправлена на проверку", "Задача отправлена на доработку", "Задача выполнена")

    }
}