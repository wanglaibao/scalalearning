package com.laibao.chapter01

object FunctionInvokeApp extends App{
  val fun = (x:Int,y:Int) => x + y
  def funMethod(f:(Int,Int) => Int): Int = f(30,40)
  val value1 = funMethod(fun)
  println(value1)

  //将方法转换成为一个函数
  val f1 = method2 _

  println(s"funMethod(f1) 的值是 : ${funMethod(f1)}")

  println("............" + funMethod(method2))


  def method2(x:Int,y:Int) = x + y
}


