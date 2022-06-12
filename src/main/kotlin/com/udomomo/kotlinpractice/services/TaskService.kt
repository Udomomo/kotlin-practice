package com.udomomo.kotlinpractice.services

import com.udomomo.kotlinpractice.dtos.V1RequestTask
import com.udomomo.kotlinpractice.dtos.V1ResponseTask
import com.udomomo.kotlinpractice.entities.Task
import com.udomomo.kotlinpractice.exceptions.InvalidTaskException
import com.udomomo.kotlinpractice.repositories.TaskRepository
import org.springframework.stereotype.Service

@Service
class TaskService(taskRepository: TaskRepository) {
  final val taskRepository: TaskRepository

  init {
    this.taskRepository = taskRepository
  }

  fun add(v1RequestTask: V1RequestTask): V1ResponseTask {
    if (v1RequestTask.isDone) {
      throw InvalidTaskException("new task should not be done")
    }

    val task = Task(v1RequestTask.contents, v1RequestTask.isDone)
    val taskResult = taskRepository.save(task)

    if (taskResult.id == null) {
      throw RuntimeException("Failed to insert task")
    }

    return V1ResponseTask(taskResult.id, taskResult.contents, taskResult.isDone)
  }
}