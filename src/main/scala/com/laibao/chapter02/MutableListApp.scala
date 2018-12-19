package com.laibao.chapter02
import scala.collection.mutable.ListBuffer

object MutableListApp extends App{
  println("test")
  val list = ListBuffer[Int]()
  println(list)
  println()
  println(list.length)
  list += 1
  list += 2
  list += 3
  list += 4
  list += 5
  list += 6
  list += 7
  list += 8
  list += 9
  list += 10
  println(list)
  println()
  for (element <- list) {
    println(element)
  }
  list += (100,200,300)
  println(list)
  println()
  list ++= List(111111,222222222,333333333,444444444,555555555,666666666,77777777,888888888,999999999,123123,234,234,345)
  println(list)
  println()

  list -= 111111
  list -= 222222222
  list -= 333333333
  list -= 444444444
  list -= 555555555
  println(list)
  println()

  list -= (666666666,77777777,888888888,999999999)
  println(list)
  println()

  list --= List(123123,234,234)
  println(list)
  println()

  val list2 = list.toList
  list2.foreach(element => println(element))
  println(sum())
  println(sum(1,2,3,4,5,6,7,8,9,10))



  def sum(numbers:Int*): Int = if (numbers.length == 0) 0 else numbers.head + sum(numbers.tail:_*)

}


