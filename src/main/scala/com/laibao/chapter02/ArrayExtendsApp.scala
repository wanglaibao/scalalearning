package com.laibao.chapter02

object ArrayExtendsApp extends App{
  println("TEST TEST TEST")
  print()
  val c = Array(1,2,3,4,5,6,7,8,9,10)
  val len = c.length
  println("len == " + len)
  val sum = c.sum
  println("sum == "+sum)
  val maxValue = c.max
  println("max value == "+maxValue)
  val minValue = c.min
  println("min value =="+minValue)
  val str1 = c.mkString
  println("str1 == "+str1)
  val str2 = c.mkString(" ")
  println("str2 =="+str2)
  val str3 = c.mkString("||")
  println("str3 =="+str3)
  val str4 = c.mkString("<","|",">")
  println("str4 =="+str4)
}
