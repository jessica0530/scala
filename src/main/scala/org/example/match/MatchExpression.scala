package org.example.`match`

class MatchExpression {

  private def matchExpression(): Unit ={
    val i = 1
    val result = i match {
      case 1 => "one"
      case 2 => "two"
      case _ => "not 1 or 2"
    }
  }

  def getClassAsString(x: Any): String = x match {
    case s: String => s + " is a String"
    case i: Int =>"Int"
    case f: Float => "FLoat"
    case l: List[_] => "List"
    case p: Double => "Double"
    case _=>"Unknown"
  }

}
