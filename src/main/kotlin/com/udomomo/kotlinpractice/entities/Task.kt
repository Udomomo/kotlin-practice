package com.udomomo.kotlinpractice.entities

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Task(
  val contents: String,
  val isDone: Boolean,
  @Id
  @GeneratedValue
  val id: Int?=null
) {
}
