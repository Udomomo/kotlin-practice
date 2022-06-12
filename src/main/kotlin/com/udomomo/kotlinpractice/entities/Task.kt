package com.udomomo.kotlinpractice.entities

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Task(
  val contents: String,
  val isDone: Boolean,
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Int?=null
) {
}
