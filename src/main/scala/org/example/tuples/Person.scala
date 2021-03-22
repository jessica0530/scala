package org.example.tuples

class Person (var name: String){
  val t = (11,"Eleven", new Person ("ELeven"))
  println(t._1)
  println(t._2)
  println(t._3)
}
