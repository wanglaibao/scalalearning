package com.laibao.chapter02

import scala.collection.mutable.Set

object MutableSetApp extends App{

  println("test set")
  val set = Set[Int]()
  println(set)
  println()
  println(set.size)
  set += 1
  set += 2
  set += 3
  set += 4
  set += 5
  set += 6
  set += 7
  set += 8
  set += 9
  set += 10
  println(set)
  println()
  for (element <- set) {
    println(element)
  }
  set += (100,200,300)
  println(set)
  println()
  set ++= Set(111111,222222222,333333333,444444444,555555555,666666666,77777777,888888888,999999999,123123,234,234,345)
  println(set)
  println()

  set -= 111111
  set -= 222222222
  set -= 333333333
  set -= 444444444
  set -= 555555555
  println(set)
  println()

  set -= (666666666,77777777,888888888,999999999)
  println(set)
  println()

  set --= List(123123,234,234)
  println(set)
  println()

}
