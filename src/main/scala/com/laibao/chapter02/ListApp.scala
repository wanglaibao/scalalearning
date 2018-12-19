package com.laibao.chapter02
import scala.collection.immutable.Nil

object ListApp extends App{
  println(Nil)
  val list = List(1,2,3,4,5,6,7,8,9,10)
  println(list)
  list.foreach(element => println(element))
  println()
  println(list.head)
  println(list.tail)


  val listTwo = 1::Nil
  println(listTwo)
  println()
  val listThree =  10 :: 9 :: 8 :: 7 :: 6 :: 5 :: 4 :: 3 :: 2 :: 1 :: Nil
  println(listThree)
  listThree.foreach(ele => println(ele))
}
