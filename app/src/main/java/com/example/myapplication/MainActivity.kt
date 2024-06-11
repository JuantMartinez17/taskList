 package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.adapter.TaskListAdapter
import com.example.myapplication.data.Task
import com.example.myapplication.data.TaskList
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.DialogTaskBinding

 class MainActivity : AppCompatActivity() {
     private lateinit var binding: ActivityMainBinding
     private lateinit var dialogTaskBinding: DialogTaskBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        dialogTaskBinding = DialogTaskBinding.inflate(layoutInflater)
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setView(dialogTaskBinding.root)
        val alertDialog = alertDialogBuilder.create()

        super.onCreate(savedInstanceState)
        setContentView(binding.main)
        initRecycler(TaskList.listOfTasks)
        setListener(alertDialog)

    }

     private fun initRecycler(taskList: List<Task>){
         binding.rvTasks.layoutManager = LinearLayoutManager(this)
         binding.rvTasks.adapter = TaskListAdapter(taskList)
     }

     private fun setListener(alertDialog: AlertDialog){
         binding.fabAddTask.setOnClickListener {
             showAlertDialog(alertDialog)
         }
     }

     private fun showAlertDialog(alertDialog: AlertDialog){
        alertDialog.show()
         clearEditText()
        dialogTaskBinding.fabPlus.setOnClickListener{
            val title = addTitleTask()
            val description =  addDescriptionTask()
            if (!title.isNullOrEmpty() && !description.isNullOrEmpty()){
                saveTask(title, description)
                alertDialog.dismiss()
            }
        }
     }

     private fun clearEditText() {
         dialogTaskBinding.etNewTaskTitle.text.clear()
         dialogTaskBinding.etNewTaskDescription.text.clear()
     }

     private fun saveTask(title:String, description:String){
         val task = Task(title, description)
         TaskList.addTask(task)
     }

     private fun addDescriptionTask(): String {
         return dialogTaskBinding.etNewTaskDescription.text.toString()
     }

     private fun addTitleTask(): String {
         return dialogTaskBinding.etNewTaskTitle.text.toString()
     }

 }