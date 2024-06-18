package com.example.myapplication.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.data.Task
import com.example.myapplication.data.TaskList

class TaskListViewModel: ViewModel() {
    private val _taskList = MutableLiveData<List<Task>>()
    val taskList: LiveData<List<Task>> = _taskList
    init {
        _taskList.value = TaskList.listOfTasks
    }

    fun addTask(title:String, description:String) {
        val task = Task (title, description)
        val updatedList = _taskList.value.orEmpty().toMutableList()
        updatedList.add(task)
        _taskList.value = updatedList
    }
}