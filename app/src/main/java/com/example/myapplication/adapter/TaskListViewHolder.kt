package com.example.myapplication.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.data.Task
import com.example.myapplication.databinding.TaskItemBinding

class TaskListViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding = TaskItemBinding.bind(view)

    fun bind (task: Task){
        binding.tvTitle.text = task.title
        binding.tvDescription.text = task.description

    }
}