package com.udomomo.kotlinpractice.repositories

import com.udomomo.kotlinpractice.entities.Task
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TaskRepository : JpaRepository<Task, Int> {
}
