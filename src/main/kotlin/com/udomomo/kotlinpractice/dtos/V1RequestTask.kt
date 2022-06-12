package com.udomomo.kotlinpractice.dtos

import com.udomomo.kotlinpractice.exceptions.InvalidTaskException
import org.jetbrains.annotations.NotNull

class V1RequestTask(contents: String, isDone: Boolean) {
  @NotNull
  val contents: String
  @NotNull
  val isDone: Boolean

  val CONTENTS_MAX_LENGTH = 30

  init {
    if (contents.length > CONTENTS_MAX_LENGTH) {
      throw InvalidTaskException("Contents is too long.");
    }
    this.contents = contents
    this.isDone = isDone
  }

}