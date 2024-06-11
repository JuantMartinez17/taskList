package com.example.myapplication.data

object TaskList {
    val listOfTasks = mutableListOf<Task>(
        Task(
            title = "Estudio",
            description = "Examen de desarrollo web"),
        Task(
            title = "Estudio",
            description = "Examen de desarrollo web"),
        Task(
            title = "Estudio",
            description = "Examen de desarrollo web"),
        Task(
            title = "Estudio",
            description = "Examen de desarrollo web"),
        Task(
            title = "Estudio",
            description = "Examen de desarrollo web"),
        Task(
            title = "Estudio",
            description = "Examen de desarrollo web"),
        Task(
            title = "Estudio",
            description = "Examen de desarrollo web"),
        Task(
            title = "Estudio",
            description = "Examen de desarrollo web"),
        Task(
            title = "Estudio",
            description = "Examen de desarrollo web"),
        Task(
            title = "Estudio",
            description = "Examen de desarrollo web"),
        Task(
            title = "Estudio",
            description = "Examen de desarrollo web"),
        Task(
            title = "Estudio",
            description = "Examen de desarrollo web"),
        Task(
            title = "Estudio",
            description = "Examen de desarrollo web"),

    )

    fun addTask (task: Task) {
        listOfTasks.add(task)
    }
}