package org.example.traits

class Dog(name: String) extends Speaker with TailWagger with Runner {
  override def speak(): String = "Woof"
}
