package com.laibao.chapter02

object SetApp extends App{

  val set = Set(1,2,3,4,5,6,7,8,9,10,2,3,4,5)
  println(set)
  set.foreach(element => println(element))
  println()
  println(set.head)
  println(set.tail)
}
