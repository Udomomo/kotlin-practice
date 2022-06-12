package com.udomomo.kotlinpractice.apis

import com.udomomo.kotlinpractice.dtos.V1RequestTask
import com.udomomo.kotlinpractice.dtos.V1ResponseTask
import com.udomomo.kotlinpractice.services.TaskService
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class TaskApi(private val taskService: TaskService) {
  @PostMapping("/task")
  fun add(@Validated @RequestBody v1RequestTask: V1RequestTask): V1ResponseTask {
    return taskService.add(v1RequestTask)
  }
  @GetMapping("/tasks")
  fun list(): List<V1ResponseTask> {
    return taskService.list()
  }
}
