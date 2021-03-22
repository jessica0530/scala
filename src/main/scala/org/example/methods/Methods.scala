package org.example.methods

import org.example.methods.Method.{concatenate, sum}

class Methods {
  val x = sum(1,2)
  val y = concatenate("foo","bar")

}
object Method {

  def sum(a: Int,b:Int) : Int = a+b
  def concatenate(s1:String,s2:String) : String = s1+ s2
}
