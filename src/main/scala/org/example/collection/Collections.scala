package org.example.collection

object Collections extends App {
  //populating lists

  val nums1 = List.range(0,10)
  val nums2 = (1 to 10 by 2).toList
  val letters1 = ('a' to 'f').toList
  val letters2 = ('a' to 'f' by 2).toList

  //sequence
  val nums3 = (1 to 10).toList
  val names = List("joe1","ed","chris","maurice")

  override def main(args: Array[String]): Unit = {
    val names = List("joe1","ed","chris","maurice")
    val nums = (1 to 10).toList
    names.foreach(println)
    nums.filter(_ < 4).foreach(println)

    val doubles = nums.map( _ * 2)
    println(doubles)

    val capNames = names.map(_.capitalize)
    println(capNames)
    val lessThanFive = nums.map(_<5)
    println(lessThanFive)

    val res0 = nums.foldLeft(0)(_ + _)
    println(res0)
    val res1 = nums.foldLeft(1)(_ * _)
    println(res1)
  }

}
