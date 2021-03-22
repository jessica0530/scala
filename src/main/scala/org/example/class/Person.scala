package org.example.`class`

class Person (var firstName: String, var lastName: String) {
  def printFullName() = println(s"$firstName $lastName")
}

object Persion {

  def printPersion(): Unit ={
    val p = new Person("Julia","Kern")
    p.lastName = "Manes"
    p.printFullName()
  }
}