package org.example.trycatch

import java.io.{FileNotFoundException, IOException}

class TryCatch {

  def writeToFile(): Unit = ???

  def tryCatchExpression(): Unit ={
    try {
      writeToFile()
    } catch {
      case fnfe: FileNotFoundException => println(fnfe)
      case ioe: IOException => println(ioe)  
    }
  }

}
